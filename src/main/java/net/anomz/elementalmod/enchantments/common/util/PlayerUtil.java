package net.anomz.elementalmod.enchantments.common.util;

import net.anomz.elementalmod.enchantments.common.capabilities.Capabilities;
import net.anomz.elementalmod.enchantments.common.capabilities.mod.IModCapability;
import net.minecraft.entity.player.PlayerEntity;

import javax.annotation.Nullable;

public class PlayerUtil {

    public static IModCapability getEnchantsCapability(PlayerEntity player) {
        return player.getCapability(Capabilities.MOD_CAPABILITY, null).orElseThrow(() -> new IllegalArgumentException("LazyOptional must not be empty!"));
    }

    @Nullable
    public static IModCapability getAliveEnchantsCapability(PlayerEntity player) {
        return player.getCapability(Capabilities.MOD_CAPABILITY, null).orElse(null);
    }

}
