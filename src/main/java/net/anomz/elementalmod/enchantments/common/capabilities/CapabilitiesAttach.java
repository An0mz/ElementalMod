package net.anomz.elementalmod.enchantments.common.capabilities;

import net.anomz.elementalmod.ElementalMod;
import net.anomz.elementalmod.enchantments.common.capabilities.mod.IModCapability;
import net.anomz.elementalmod.enchantments.common.capabilities.mod.ModCapabilityProvider;
import net.anomz.elementalmod.enchantments.common.util.PlayerUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ElementalMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class CapabilitiesAttach {

    @SubscribeEvent
    public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof PlayerEntity) {
            event.addCapability(new ResourceLocation(ElementalMod.MOD_ID, "capability"), new ModCapabilityProvider());
        }
    }

    @SubscribeEvent
    public static void onPlayerClone(PlayerEvent.Clone event) {
        if (event.getOriginal().getCapability(Capabilities.MOD_CAPABILITY, null).isPresent()) {
            IModCapability origEnchantsCap = PlayerUtil.getEnchantsCapability(event.getOriginal());
            IModCapability enchantsCap = PlayerUtil.getEnchantsCapability(event.getPlayer());
            enchantsCap.clone(origEnchantsCap);
        }
    }

}
