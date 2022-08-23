package net.anomz.elementalmod.enchantments.common.enchantment;

import net.anomz.elementalmod.enchantments.common.config.ConfigValues;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class EnchantmentTimeless extends BasicEnchantment {

    public EnchantmentTimeless(String registryName) {
        super(registryName, Rarity.RARE, EnchantmentType.BREAKABLE, new EquipmentSlotType[]{
                EquipmentSlotType.MAINHAND
        });
    }

    @Override
    public int getMinEnchantability(int level) {
        return 5 + 10 * (level - 1);
    }

    @Override
    public boolean isEnabled() {
        return ConfigValues.timeless;
    }
}