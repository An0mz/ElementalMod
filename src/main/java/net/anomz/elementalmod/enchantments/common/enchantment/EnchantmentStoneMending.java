package net.anomz.elementalmod.enchantments.common.enchantment;

import net.anomz.elementalmod.enchantments.common.config.ConfigValues;
import net.anomz.elementalmod.enchantments.common.util.CustomEnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class EnchantmentStoneMending extends BasicEnchantment {

    public EnchantmentStoneMending(String registryName) {
        super(registryName, Rarity.RARE, CustomEnchantmentType.PICKAXE, new EquipmentSlotType[]{
                EquipmentSlotType.MAINHAND
        });
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public boolean isEnabled() {
        return ConfigValues.stone_mending;
    }
}