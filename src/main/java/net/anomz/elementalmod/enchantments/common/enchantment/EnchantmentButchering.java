package net.anomz.elementalmod.enchantments.common.enchantment;


import net.anomz.elementalmod.enchantments.common.config.ConfigValues;
import net.anomz.elementalmod.enchantments.common.util.CustomEnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class EnchantmentButchering extends BasicEnchantment {

    public EnchantmentButchering(String registryName) {
        super(registryName, Rarity.COMMON, CustomEnchantmentType.AXE, new EquipmentSlotType[]{
                EquipmentSlotType.MAINHAND
        });
    }

    @Override
    public int getMinEnchantability(int level) {
        return level * 8;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public boolean isEnabled() {
        return ConfigValues.butchering;
    }
}