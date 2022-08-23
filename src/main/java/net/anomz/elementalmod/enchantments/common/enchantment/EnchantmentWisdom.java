package net.anomz.elementalmod.enchantments.common.enchantment;

import net.anomz.elementalmod.enchantments.common.config.ConfigValues;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class EnchantmentWisdom extends BasicEnchantment {

    public EnchantmentWisdom(String registryName) {
        super(registryName, Rarity.RARE, EnchantmentType.WEAPON, new EquipmentSlotType[]{
                EquipmentSlotType.MAINHAND
        });
    }

    @Override
    public int getMinEnchantability(int level) {
        return 5 + 10 * (level - 1);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public boolean isEnabled() {
        return ConfigValues.wisdom;
    }
}