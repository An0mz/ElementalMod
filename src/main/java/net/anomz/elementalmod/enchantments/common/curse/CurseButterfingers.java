package net.anomz.elementalmod.enchantments.common.curse;

import net.anomz.elementalmod.enchantments.common.config.ConfigValues;
import net.anomz.elementalmod.enchantments.common.enchantment.BasicEnchantment;
import net.anomz.elementalmod.enchantments.common.util.CustomEnchantmentType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.EquipmentSlotType;

public class CurseButterfingers extends BasicEnchantment {

    public CurseButterfingers(String registryName) {
        super(registryName, Rarity.VERY_RARE, CustomEnchantmentType.WEAPON_DIGGER, new EquipmentSlotType[]{
                EquipmentSlotType.MAINHAND
        });
    }

    @Override
    public int getMinEnchantability(int enchantmentLevel) {
        return 30;
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel) {
        return 60;
    }

    @Override
    public int getMaxLevel() {
        return 1;
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
        return ConfigValues.curse_butterfingers;
    }
}