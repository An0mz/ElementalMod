package net.anomz.elementalmod.enchantments.common.enchantment;

import net.anomz.elementalmod.enchantments.common.config.ConfigValues;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.inventory.EquipmentSlotType;

public class EnchantmentSoftFall extends BasicEnchantment {

    public EnchantmentSoftFall(String registryName) {
        super(registryName, Rarity.RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[]{
                EquipmentSlotType.FEET
        });
    }

    @Override
    public int getMaxLevel() {
        return 4;
    }

    public boolean canApplyTogether(Enchantment ench) {
        return super.canApplyTogether(ench) && ench != Enchantments.FEATHER_FALLING;
    }

    @Override
    public boolean isEnabled() {
        return ConfigValues.soft_fall;
    }
}