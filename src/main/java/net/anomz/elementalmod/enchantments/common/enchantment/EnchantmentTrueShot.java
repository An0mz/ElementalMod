package net.anomz.elementalmod.enchantments.common.enchantment;

import net.anomz.elementalmod.enchantments.common.config.ConfigValues;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class EnchantmentTrueShot extends BasicEnchantment {

    public EnchantmentTrueShot(String registryName) {
        super(registryName, Rarity.VERY_RARE, EnchantmentType.BOW, new EquipmentSlotType[]{
                EquipmentSlotType.MAINHAND,
                EquipmentSlotType.OFFHAND
        });
    }

    @Override
    public int getMinEnchantability(int level) {
        return 20;
    }

    @Override
    public boolean isEnabled() {
        return ConfigValues.true_shot;
    }
}
