package net.anomz.elementalmod.enchantments.common.enchantment;

import net.anomz.elementalmod.enchantments.common.config.ConfigValues;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class EnchantmentQuickDraw extends BasicEnchantment {

    public EnchantmentQuickDraw(String registryName) {
        super(registryName, Rarity.RARE, EnchantmentType.BOW, new EquipmentSlotType[]{
                EquipmentSlotType.MAINHAND,
                EquipmentSlotType.OFFHAND
        });
    }

    @Override
    public int getMinEnchantability(int level) {
        return 5 + 10 * (level - 1);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public boolean isEnabled() {
        return ConfigValues.quick_draw;
    }
}