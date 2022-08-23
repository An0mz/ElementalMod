package net.anomz.elementalmod.enchantments.common.curse;

import net.anomz.elementalmod.enchantments.common.config.ConfigValues;
import net.anomz.elementalmod.enchantments.common.enchantment.BasicEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class CurseAquaphobia extends BasicEnchantment {

    public CurseAquaphobia(String registryName) {
        super(registryName, Rarity.RARE, EnchantmentType.ARMOR, new EquipmentSlotType[]{
                EquipmentSlotType.FEET,
        });
    }

    @Override
    public int getMinEnchantability(int level) {
        return 20;
    }

    @Override
    public boolean isCurse() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return ConfigValues.curse_aquaphobia;
    }
}