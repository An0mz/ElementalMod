package net.anomz.elementalmod.tools;

import net.anomz.elementalmod.core.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ItemTiers implements IItemTier {
    FIRE(4, 5000, 35.0f, 5.0f, 25, new LazyValue<>(
            () -> {return Ingredient.fromItems(ItemInit.FIRE_INGOT.get());})),

    WATER(4, 5000, 35.0f, 5.0f, 25, new LazyValue<>(
            () -> {return Ingredient.fromItems(ItemInit.WATER_INGOT.get());})),

    AIR(4, 5000, 35.0f, 5.0f, 25, new LazyValue<>(
            () -> {return Ingredient.fromItems(ItemInit.AIR_INGOT.get());})),

    EARTH(4, 5000, 35.0f, 5.0f, 25, new LazyValue<>(
            () -> {return Ingredient.fromItems(ItemInit.EARTH_INGOT.get());}));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    ItemTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, LazyValue<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }
}
