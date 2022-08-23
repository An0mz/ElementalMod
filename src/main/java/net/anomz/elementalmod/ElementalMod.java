package net.anomz.elementalmod;

import net.anomz.elementalmod.armor.ArmorItems;
import net.anomz.elementalmod.core.init.BlockInit;
import net.anomz.elementalmod.core.init.ItemInit;
import net.anomz.elementalmod.enchantments.common.capabilities.Capabilities;
import net.anomz.elementalmod.enchantments.common.config.ConfigHolder;
import net.anomz.elementalmod.enchantments.common.network.Networking;
import net.anomz.elementalmod.enchantments.common.proxy.ClientProxy;
import net.anomz.elementalmod.enchantments.common.proxy.IProxy;
import net.anomz.elementalmod.enchantments.common.proxy.ServerProxy;
import net.anomz.elementalmod.tools.Items;
import net.anomz.elementalmod.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ElementalMod.MOD_ID)
public class ElementalMod {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "elemental";
    public static final ItemGroup ElementalGroup = new ElementalGroup("elementaltab");
    public static IProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    public ElementalMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);


        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        ArmorItems.ARMOR.register(bus);
        Items.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);

        MinecraftForge.EVENT_BUS.register(this);

        final ModLoadingContext modLoadingContext = ModLoadingContext.get();
        modLoadingContext.registerConfig(ModConfig.Type.COMMON, ConfigHolder.COMMON_SPEC);

    }

    private void setup(final FMLCommonSetupEvent event) {
        Capabilities.register();
        Networking.registerMessages();
        proxy.init();
    }

    public static class ElementalGroup extends ItemGroup {

        public ElementalGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack createIcon() {
            return ItemInit.FIRE_ORE.get().getDefaultInstance();
        }

    }
}