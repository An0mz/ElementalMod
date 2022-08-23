package net.anomz.elementalmod.enchantments.common.handler;

import net.anomz.elementalmod.enchantments.common.network.Networking;
import net.anomz.elementalmod.enchantments.common.network.packet.PacketCloudParticles;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingFallEvent;

import static net.anomz.elementalmod.enchantments.common.registries.ModEnchants.SOFT_FALL;


public class HandlerSoftFall {

    public static void handlerFall(LivingFallEvent event) {
        Entity source = event.getEntityLiving();
        if (!(source instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) source;

        ItemStack stack = player.getItemStackFromSlot(EquipmentSlotType.FEET);
        int lvl = EnchantmentHelper.getEnchantmentLevel(SOFT_FALL, stack);
        if (lvl == 0) return;

        if (event.getDistance() <= Math.max((lvl * 2), 15) && event.getDistance() > 3) {
            player.getFoodStats().addExhaustion(event.getDistance());
            event.setCanceled(true);
            Networking.INSTANCE.sendToServer(new PacketCloudParticles());
        }
    }

}