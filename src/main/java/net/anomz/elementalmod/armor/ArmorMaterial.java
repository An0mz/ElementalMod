package net.anomz.elementalmod.armor;

import net.anomz.elementalmod.ElementalMod;
import net.anomz.elementalmod.core.init.ItemInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.util.Lazy;

import java.util.function.Supplier;

public enum ArmorMaterial implements IArmorMaterial {
    FIRE("fire", 400, new int[]{5, 8, 9, 5}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 5.0F, 0.3F,
            () -> Ingredient.fromItems(ItemInit.FIRE_INGOT.get())),
    WATER("water", 400, new int[] {5, 8, 9, 5}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 5.0F, 0.3F,
            () -> Ingredient.fromItems(ItemInit.WATER_INGOT.get())),
    AIR("air", 400, new int[] {5, 8, 9, 5}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 5.0F, 0.3F,
            () -> Ingredient.fromItems(ItemInit.AIR_INGOT.get())),
    EARTH("earth", 400, new int[] {5, 8, 9, 5}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 5.0F, 0.3F,
            () -> Ingredient.fromItems(ItemInit.EARTH_INGOT.get()));

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairMaterialLazy;

    private ArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountArrayIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, float knockbackResistanceIn, Supplier<Ingredient> repairMaterialSupplier) {
        this.name = ElementalMod.MOD_ID + ":" + nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountArrayIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = soundEventIn;
        this.toughness = toughnessIn;
        this.knockbackResistance = knockbackResistanceIn;
        this.repairMaterialLazy = Lazy.concurrentOf(repairMaterialSupplier);
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterialLazy.get();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}