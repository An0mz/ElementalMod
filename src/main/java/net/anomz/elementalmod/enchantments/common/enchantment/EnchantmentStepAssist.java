package net.anomz.elementalmod.enchantments.common.enchantment;

import net.anomz.elementalmod.enchantments.common.config.ConfigValues;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class EnchantmentStepAssist extends BasicEnchantment {

    public EnchantmentStepAssist(String registryName) {
        super(registryName, Rarity.RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[]{
                EquipmentSlotType.FEET,
        });
    }

    @Override
    public int getMinEnchantability(int level) {
        return 20;
    }

    @Override
    public boolean isEnabled() {
        return ConfigValues.step_assist;
    }
}