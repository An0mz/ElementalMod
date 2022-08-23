package net.anomz.elementalmod.enchantments.common.enchantment;

import net.anomz.elementalmod.enchantments.common.config.ConfigValues;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class EnchantmentMultiJump extends BasicEnchantment {

    public EnchantmentMultiJump(String registryName) {
        super(registryName, Rarity.RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[]{
                EquipmentSlotType.FEET
        });
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public boolean isEnabled() {
        return ConfigValues.multi_jump;
    }
}