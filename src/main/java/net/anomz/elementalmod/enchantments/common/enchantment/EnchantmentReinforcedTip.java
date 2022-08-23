package net.anomz.elementalmod.enchantments.common.enchantment;

import net.anomz.elementalmod.enchantments.common.config.ConfigValues;
import net.anomz.elementalmod.enchantments.common.util.CustomEnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class EnchantmentReinforcedTip extends BasicEnchantment {

    public EnchantmentReinforcedTip(String registryName) {
        super(registryName, Rarity.UNCOMMON, CustomEnchantmentType.PICKAXE, new EquipmentSlotType[]{
                EquipmentSlotType.MAINHAND
        });
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public boolean isEnabled() {
        return ConfigValues.reinforced_tip;
    }
}