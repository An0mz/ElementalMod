package net.anomz.elementalmod.enchantments.common.enchantment;

import net.anomz.elementalmod.enchantments.common.config.ConfigValues;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class EnchantmentNightVision extends BasicEnchantment {

    public EnchantmentNightVision(String registryName) {
        super(registryName, Rarity.RARE, EnchantmentType.ARMOR_HEAD, new EquipmentSlotType[]{
                EquipmentSlotType.HEAD,
        });
    }

    @Override
    public int getMinEnchantability(int level) {
        return 15;
    }

    @Override
    public boolean isEnabled() {
        return ConfigValues.night_vision;
    }
}