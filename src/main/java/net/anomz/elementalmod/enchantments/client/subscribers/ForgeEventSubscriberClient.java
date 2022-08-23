package net.anomz.elementalmod.enchantments.client.subscribers;

import net.anomz.elementalmod.ElementalMod;
import net.anomz.elementalmod.enchantments.common.handler.HandlerCombo;
import net.anomz.elementalmod.enchantments.common.handler.HandlerLumberjack;
import net.anomz.elementalmod.enchantments.common.handler.HandlerMomentum;
import net.anomz.elementalmod.enchantments.common.handler.HandlerMultiJump;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.anomz.elementalmod.ElementalMod.proxy;

@Mod.EventBusSubscriber(modid = ElementalMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public final class ForgeEventSubscriberClient {

    @SubscribeEvent
    public static void onMiss(PlayerInteractEvent.LeftClickEmpty event) {
        HandlerCombo.handlerMiss(event);
    }

    @SubscribeEvent
    public static void onHitBlock(PlayerInteractEvent.LeftClickBlock event) {
        HandlerCombo.handlerHitBlock(event);
    }

    @SubscribeEvent
    public static void onClientKeyInput(InputEvent.KeyInputEvent event) {
        Minecraft mc = proxy.getClient();
        if (!mc.isGameFocused() || mc.world == null) return;

        HandlerMultiJump.handlerKeyInput(mc, event);
        HandlerLumberjack.handlerKeyInput(mc, event);
    }

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        HandlerCombo.handlerTooltip(event);
        HandlerMomentum.handlerTooltip(event);
    }

}