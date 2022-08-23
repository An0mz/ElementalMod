package net.anomz.elementalmod.armor;

import net.anomz.elementalmod.ElementalMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ArmorItems {
    public static final DeferredRegister<Item> ARMOR = DeferredRegister.create(ForgeRegistries.ITEMS,
            ElementalMod.MOD_ID);
    public static final RegistryObject<ArmorItem> FIRE_HELMET = ARMOR.register("fire_helmet", () -> new ArmorItem(ArmorMaterial.FIRE, EquipmentSlotType.HEAD, new Item.Properties().group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<ArmorItem> FIRE_CHESTPLATE = ARMOR.register("fire_chestplate", () -> new ArmorItem(ArmorMaterial.FIRE, EquipmentSlotType.CHEST, new Item.Properties().group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<ArmorItem> FIRE_LEGGINGS = ARMOR.register("fire_leggings", () -> new ArmorItem(ArmorMaterial.FIRE, EquipmentSlotType.LEGS, new Item.Properties().group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<ArmorItem> FIRE_BOOTS = ARMOR.register("fire_boots", () -> new ArmorItem(ArmorMaterial.FIRE, EquipmentSlotType.FEET, new Item.Properties().group(ElementalMod.ElementalGroup)));

    public static final RegistryObject<ArmorItem> WATER_HELMET = ARMOR.register("water_helmet", () -> new ArmorItem(ArmorMaterial.WATER, EquipmentSlotType.HEAD, new Item.Properties().group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<ArmorItem> WATER_CHESTPLATE = ARMOR.register("water_chestplate", () -> new ArmorItem(ArmorMaterial.WATER, EquipmentSlotType.CHEST, new Item.Properties().group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<ArmorItem> WATER_LEGGINGS = ARMOR.register("water_leggings", () -> new ArmorItem(ArmorMaterial.WATER, EquipmentSlotType.LEGS, new Item.Properties().group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<ArmorItem> WATER_BOOTS = ARMOR.register("water_boots", () -> new ArmorItem(ArmorMaterial.WATER, EquipmentSlotType.FEET, new Item.Properties().group(ElementalMod.ElementalGroup)));

    public static final RegistryObject<ArmorItem> AIR_HELMET = ARMOR.register("air_helmet", () -> new ArmorItem(ArmorMaterial.AIR, EquipmentSlotType.HEAD, new Item.Properties().group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<ArmorItem> AIR_CHESTPLATE = ARMOR.register("air_chestplate", () -> new ArmorItem(ArmorMaterial.AIR, EquipmentSlotType.CHEST, new Item.Properties().group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<ArmorItem> AIR_LEGGINGS = ARMOR.register("air_leggings", () -> new ArmorItem(ArmorMaterial.AIR, EquipmentSlotType.LEGS, new Item.Properties().group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<ArmorItem> AIR_BOOTS = ARMOR.register("air_boots", () -> new ArmorItem(ArmorMaterial.AIR, EquipmentSlotType.FEET, new Item.Properties().group(ElementalMod.ElementalGroup)));

    public static final RegistryObject<ArmorItem> EARTH_HELMET = ARMOR.register("earth_helmet", () -> new ArmorItem(ArmorMaterial.EARTH, EquipmentSlotType.HEAD, new Item.Properties().group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<ArmorItem> EARTH_CHESTPLATE = ARMOR.register("earth_chestplate", () -> new ArmorItem(ArmorMaterial.EARTH, EquipmentSlotType.CHEST, new Item.Properties().group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<ArmorItem> EARTH_LEGGINGS = ARMOR.register("earth_leggings", () -> new ArmorItem(ArmorMaterial.EARTH, EquipmentSlotType.LEGS, new Item.Properties().group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<ArmorItem> EARTH_BOOTS = ARMOR.register("earth_boots", () -> new ArmorItem(ArmorMaterial.EARTH, EquipmentSlotType.FEET, new Item.Properties().group(ElementalMod.ElementalGroup)));
}