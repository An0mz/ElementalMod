package net.anomz.elementalmod.enchantments.common.handler;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.item.ItemExpireEvent;

import static net.anomz.elementalmod.enchantments.common.registries.ModEnchants.TIMELESS;

public class HandlerTimeless {

    public static void handlerItemExpire(ItemExpireEvent event) {
        ItemStack itemStack = event.getEntityItem().getItem();

        int lvl = EnchantmentHelper.getEnchantmentLevel(TIMELESS, itemStack);
        if (lvl == 0) return;

        event.setExtraLife(Integer.MAX_VALUE);
        event.setCanceled(true);
    }

}