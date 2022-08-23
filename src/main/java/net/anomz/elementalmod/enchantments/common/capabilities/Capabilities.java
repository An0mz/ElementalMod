package net.anomz.elementalmod.enchantments.common.capabilities;

import net.anomz.elementalmod.enchantments.common.capabilities.basic.DefaultModCapability;
import net.anomz.elementalmod.enchantments.common.capabilities.mod.IModCapability;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

public final class Capabilities {

    @CapabilityInject(IModCapability.class)
    public static Capability<IModCapability> MOD_CAPABILITY = null;

    public static void register() {
        DefaultModCapability.register();
    }

}
