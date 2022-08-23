package net.anomz.elementalmod.enchantments.common.enchantment;


import net.anomz.elementalmod.enchantments.common.config.ConfigValues;
import net.anomz.elementalmod.enchantments.common.util.CustomEnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class EnchantmentLumberjack extends BasicEnchantment {

    public EnchantmentLumberjack(String registryName) {
        super(registryName, Rarity.UNCOMMON, CustomEnchantmentType.AXE, new EquipmentSlotType[]{
                EquipmentSlotType.MAINHAND
        });
    }

    @Override
    public boolean isEnabled() {
        return ConfigValues.lumberjack;
    }
}
