package net.anomz.elementalmod.enchantments.common.handler;


import net.anomz.elementalmod.enchantments.common.capabilities.mod.IModCapability;
import net.anomz.elementalmod.enchantments.common.util.PlayerUtil;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;

import static net.anomz.elementalmod.enchantments.common.registries.ModEnchants.STEP_ASSIST;


public class HandlerStepAssist {

    public static void handlerPlayerTick(PlayerEntity player) {
        IModCapability enchantsCap = PlayerUtil.getAliveEnchantsCapability(player);
        if (enchantsCap == null) return;

        ItemStack stack = player.getItemStackFromSlot(EquipmentSlotType.FEET);
        int lvl = EnchantmentHelper.getEnchantmentLevel(STEP_ASSIST, stack);

        if (lvl == 0) {
            if (enchantsCap.getStepAssist()) {
                player.stepHeight -= 0.4f;
                enchantsCap.setStepAssist(false);
            }
        } else {
            if (!enchantsCap.getStepAssist()) {
                player.stepHeight += 0.4f;
                enchantsCap.setStepAssist(true);
            }
        }
    }

}