package net.anomz.elementalmod.enchantments.common.enchantment;

import net.anomz.elementalmod.enchantments.common.config.ConfigValues;
import net.anomz.elementalmod.enchantments.common.util.CustomEnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class EnchantmentDetonation extends BasicEnchantment {

    public EnchantmentDetonation(String registryName) {
        super(registryName, Rarity.COMMON, CustomEnchantmentType.SHOOTABLE, new EquipmentSlotType[]{
                EquipmentSlotType.MAINHAND
        });
    }

    @Override
    public int getMinEnchantability(int level) {
        return 5 + 10 * (level - 1);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public boolean isEnabled() {
        return ConfigValues.detonation;
    }
}