package net.anomz.elementalmod.core.init;

import net.anomz.elementalmod.ElementalMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
        ElementalMod.MOD_ID);

    public static final RegistryObject<Item> FIRE_ESSENCE = ITEMS.register("fire_essence",
            () -> new Item(new Item.Properties().group(ElementalMod.ElementalGroup)));

    public static final RegistryObject<Item> FIRE_INGOT = ITEMS.register("fire_ingot",
            () -> new Item(new Item.Properties().group(ElementalMod.ElementalGroup)));

    public static final RegistryObject<Item> AIR_ESSENCE = ITEMS.register("air_essence",
            () -> new Item(new Item.Properties().group(ElementalMod.ElementalGroup)));

    public static final RegistryObject<Item> AIR_INGOT = ITEMS.register("air_ingot",
            () -> new Item(new Item.Properties().group(ElementalMod.ElementalGroup)));

    public static final RegistryObject<Item> EARTH_ESSENCE = ITEMS.register("earth_essence",
            () -> new Item(new Item.Properties().group(ElementalMod.ElementalGroup)));

    public static final RegistryObject<Item> EARTH_INGOT = ITEMS.register("earth_ingot",
            () -> new Item(new Item.Properties().group(ElementalMod.ElementalGroup)));

    public static final RegistryObject<Item> WATER_ESSENCE = ITEMS.register("water_essence",
            () -> new Item(new Item.Properties().group(ElementalMod.ElementalGroup)));

    public static final RegistryObject<Item> WATER_INGOT = ITEMS.register("water_ingot",
            () -> new Item(new Item.Properties().group(ElementalMod.ElementalGroup)));

    //Block Items
    public static final RegistryObject<BlockItem> FIRE_ORE = ITEMS.register("fire_ore",
            () -> new BlockItem(BlockInit.FIRE_ORE.get(), new Item.Properties().group(ElementalMod.ElementalGroup)));

    public static final RegistryObject<BlockItem> AIR_ORE = ITEMS.register("air_ore",
            () -> new BlockItem(BlockInit.AIR_ORE.get(), new Item.Properties().group(ElementalMod.ElementalGroup)));

    public static final RegistryObject<BlockItem> EARTH_ORE = ITEMS.register("earth_ore",
            () -> new BlockItem(BlockInit.EARTH_ORE.get(), new Item.Properties().group(ElementalMod.ElementalGroup)));

    public static final RegistryObject<BlockItem> WATER_ORE = ITEMS.register("water_ore",
            () -> new BlockItem(BlockInit.WATER_ORE.get(), new Item.Properties().group(ElementalMod.ElementalGroup)));

    public static final RegistryObject<BlockItem> FIRE_BLOCK = ITEMS.register("fire_block",
            () -> new BlockItem(BlockInit.FIRE_BLOCK.get(), new Item.Properties().group(ElementalMod.ElementalGroup)));

    public static final RegistryObject<BlockItem> AIR_BLOCK = ITEMS.register("air_block",
            () -> new BlockItem(BlockInit.AIR_BLOCK.get(), new Item.Properties().group(ElementalMod.ElementalGroup)));

    public static final RegistryObject<BlockItem> EARTH_BLOCK = ITEMS.register("earth_block",
            () -> new BlockItem(BlockInit.EARTH_BLOCK.get(), new Item.Properties().group(ElementalMod.ElementalGroup)));

    public static final RegistryObject<BlockItem> WATER_BLOCK = ITEMS.register("water_block",
            () -> new BlockItem(BlockInit.WATER_BLOCK.get(), new Item.Properties().group(ElementalMod.ElementalGroup)));
}
