package net.anomz.elementalmod.enchantments.common.subscribers;

import com.google.common.base.Preconditions;
import net.anomz.elementalmod.enchantments.common.block.MeltedCobblestone;
import net.anomz.elementalmod.enchantments.common.config.ConfigHelper;
import net.anomz.elementalmod.enchantments.common.curse.CurseAquaphobia;
import net.anomz.elementalmod.enchantments.common.curse.CurseBreaking;
import net.anomz.elementalmod.enchantments.common.curse.CurseButterfingers;
import net.anomz.elementalmod.enchantments.common.curse.CurseDeath;
import net.anomz.elementalmod.enchantments.common.enchantment.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.jline.utils.Log;

import javax.annotation.Nonnull;
import java.util.ArrayList;

import static net.anomz.elementalmod.ElementalMod.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber {

    @SubscribeEvent
    public static void onModConfigEvent(final ModConfig.ModConfigEvent event) {
        final ModConfig config = event.getConfig();
        ConfigHelper.bake(config);
        Log.debug("Baked config");
    }

    @SubscribeEvent
    public static void onRegisterBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                setup(new MeltedCobblestone(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.STONE)), "melted_cobblestone")
        );
    }

    @SubscribeEvent
    public static void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
        final IForgeRegistry<Enchantment> registry = event.getRegistry();

        ArrayList<BasicEnchantment> enchantments = new ArrayList<>();

        // Curse
        enchantments.add(new CurseBreaking("curse_breaking"));
        enchantments.add(new CurseButterfingers("curse_butterfingers"));
        enchantments.add(new CurseAquaphobia("curse_aquaphobia"));
        enchantments.add(new CurseDeath("curse_death"));

        // Tools
        enchantments.add(new EnchantmentReinforcedTip("reinforced_tip"));
        enchantments.add(new EnchantmentStoneMending("stone_mending"));
        enchantments.add(new EnchantmentLumberjack("lumberjack"));
        enchantments.add(new EnchantmentLumberjack("momentum"));
        enchantments.add(new EnchantmentButchering("butchering"));

        // Bows
        enchantments.add(new EnchantmentTrueShot("true_shot"));
        enchantments.add(new EnchantmentQuickDraw("quick_draw"));
        enchantments.add(new EnchantmentFloating("floating"));
        enchantments.add(new EnchantmentParalysis("paralysis"));
        enchantments.add(new EnchantmentDetonation("detonation"));

        // Swords
        enchantments.add(new EnchantmentCombo("combo"));
        enchantments.add(new EnchantmentFasterAttack("faster_attack"));
        enchantments.add(new EnchantmentLifesteal("lifesteal"));
        enchantments.add(new EnchantmentIceAspect("ice_aspect"));
        enchantments.add(new EnchantmentWisdom("wisdom"));

        // Armour
        enchantments.add(new EnchantmentBlazingWalker("blazing_walker"));
        enchantments.add(new EnchantmentStepAssist("step_assist"));
        enchantments.add(new EnchantmentNightVision("night_vision"));
        enchantments.add(new EnchantmentMultiJump("multi_jump"));
        enchantments.add(new EnchantmentSoftFall("soft_fall"));

        // Other
        enchantments.add(new EnchantmentTimeless("timeless"));


        enchantments.forEach((e) -> {
//			if (e.isEnabled()) {
            registry.register(setup(e, e.getRegistry()));
//			}
        });
    }

    @Nonnull
    private static <T extends IForgeRegistryEntry<T>> T setup(@Nonnull final T entry, @Nonnull final String name) {
        return setup(entry, new ResourceLocation(MOD_ID, name));
    }

    @Nonnull
    private static <T extends IForgeRegistryEntry<T>> T setup(@Nonnull final T entry, @Nonnull final ResourceLocation registryName) {
        Preconditions.checkNotNull(entry, "Entry cannot be null!");
        Preconditions.checkNotNull(registryName, "Registry name to assign to entry cannot be null!");
        entry.setRegistryName(registryName);
        return entry;
    }
}