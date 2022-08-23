package net.anomz.elementalmod.enchantments.common.curse;

import net.anomz.elementalmod.enchantments.common.config.ConfigValues;
import net.anomz.elementalmod.enchantments.common.enchantment.BasicEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class CurseBreaking extends BasicEnchantment {

    public CurseBreaking(String registryName) {
        super(registryName, Rarity.VERY_RARE, EnchantmentType.BREAKABLE, EquipmentSlotType.values());
    }

    @Override
    public int getMinEnchantability(int enchantmentLevel) {
        return 25;
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel) {
        return 50;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public boolean isTreasureEnchantment() {
        return true;
    }

    @Override
    public boolean isCurse() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return ConfigValues.curse_breaking;
    }
}