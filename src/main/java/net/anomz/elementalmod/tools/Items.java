package net.anomz.elementalmod.tools;

import net.anomz.elementalmod.ElementalMod;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            ElementalMod.MOD_ID);

    //FIRE
    public static final RegistryObject<Item> FIRE_SWORD = ITEMS.register("fire_sword",
            () -> new SwordItem(ItemTiers.FIRE, 4, -1.8F, new Item.Properties().maxStackSize(1).group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<Item> FIRE_PICKAXE = ITEMS.register("fire_pickaxe",
            () -> new PickaxeItem(ItemTiers.FIRE, 2, -2.4F, new Item.Properties().maxStackSize(1).group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<Item> FIRE_AXE = ITEMS.register("fire_axe",
            () -> new AxeItem(ItemTiers.FIRE, 6, -2.6F, new Item.Properties().maxStackSize(1).group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<Item> FIRE_SHOVEL = ITEMS.register("fire_shovel",
            () -> new ShovelItem(ItemTiers.FIRE, 1, -2.8F, new Item.Properties().maxStackSize(1).group(ElementalMod.ElementalGroup)));
    //WATER
    public static final RegistryObject<Item> WATER_SWORD = ITEMS.register("water_sword",
            () -> new SwordItem(ItemTiers.WATER, 4, -1.8F, new Item.Properties().maxStackSize(1).group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<Item> WATER_PICKAXE = ITEMS.register("water_pickaxe",
            () -> new PickaxeItem(ItemTiers.WATER, 2, -2.4F, new Item.Properties().maxStackSize(1).group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<Item> WATER_AXE = ITEMS.register("water_axe",
            () -> new AxeItem(ItemTiers.WATER, 6, -2.6F, new Item.Properties().maxStackSize(1).group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<Item> WATER_SHOVEL = ITEMS.register("water_shovel",
            () -> new ShovelItem(ItemTiers.WATER, 1, -2.8F, new Item.Properties().maxStackSize(1).group(ElementalMod.ElementalGroup)));
    //AIR
    public static final RegistryObject<Item> AIR_SWORD = ITEMS.register("air_sword",
            () -> new SwordItem(ItemTiers.AIR, 4, -1.8F, new Item.Properties().maxStackSize(1).group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<Item> AIR_PICKAXE = ITEMS.register("air_pickaxe",
            () -> new PickaxeItem(ItemTiers.AIR, 2, -2.4F, new Item.Properties().maxStackSize(1).group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<Item> AIR_AXE = ITEMS.register("air_axe",
            () -> new AxeItem(ItemTiers.AIR, 6, -2.6F, new Item.Properties().maxStackSize(1).group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<Item> AIR_SHOVEL = ITEMS.register("air_shovel",
            () -> new ShovelItem(ItemTiers.AIR, 1, -2.8F, new Item.Properties().maxStackSize(1).group(ElementalMod.ElementalGroup)));
    //EARTH
    public static final RegistryObject<Item> EARTH_SWORD = ITEMS.register("earth_sword",
            () -> new SwordItem(ItemTiers.EARTH, 4, -1.8F, new Item.Properties().maxStackSize(1).group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<Item> EARTH_PICKAXE = ITEMS.register("earth_pickaxe",
            () -> new PickaxeItem(ItemTiers.EARTH, 2, -2.4F, new Item.Properties().maxStackSize(1).group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<Item> EARTH_AXE = ITEMS.register("earth_axe",
            () -> new AxeItem(ItemTiers.EARTH, 6, -2.6F, new Item.Properties().maxStackSize(1).group(ElementalMod.ElementalGroup)));
    public static final RegistryObject<Item> EARTH_SHOVEL = ITEMS.register("earth_shovel",
            () -> new ShovelItem(ItemTiers.EARTH, 1, -2.8F, new Item.Properties().maxStackSize(1).group(ElementalMod.ElementalGroup)));
}
