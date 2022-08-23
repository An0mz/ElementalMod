package net.anomz.elementalmod.enchantments.common.enchantment;

import net.anomz.elementalmod.enchantments.common.config.ConfigValues;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class EnchantmentFasterAttack extends BasicEnchantment {

    public EnchantmentFasterAttack(String registryName) {
        super(registryName, Rarity.COMMON, EnchantmentType.WEAPON, new EquipmentSlotType[]{
                EquipmentSlotType.MAINHAND
        });
    }

    @Override
    public int getMinEnchantability(int level) {
        return level * 6;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public boolean isEnabled() {
        return ConfigValues.faster_attack;
    }
}