package net.anomz.elementalmod.enchantments.common.network;

import net.anomz.elementalmod.ElementalMod;
import net.anomz.elementalmod.enchantments.common.network.packet.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class Networking {

    public static SimpleChannel INSTANCE;
    private static int ID = 0;

    private static int nextID() {
        return ID++;
    }

    public static void registerMessages() {
        INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation(ElementalMod.MOD_ID, "elemental-enchants"), () -> "1.0", s -> true, s -> true);
        INSTANCE.registerMessage(nextID(), PacketComboReset.class, PacketComboReset::toBytes, PacketComboReset::new, PacketComboReset::handle);
        INSTANCE.registerMessage(nextID(), PacketMultiJumpSync.class, PacketMultiJumpSync::toBytes, PacketMultiJumpSync::new, PacketMultiJumpSync::handle);
        INSTANCE.registerMessage(nextID(), PacketMultiJumpDo.class, PacketMultiJumpDo::toBytes, PacketMultiJumpDo::new, PacketMultiJumpDo::handle);
        INSTANCE.registerMessage(nextID(), PacketLumberjackToggle.class, PacketLumberjackToggle::toBytes, PacketLumberjackToggle::new, PacketLumberjackToggle::handle);

        INSTANCE.registerMessage(nextID(), PacketCloudParticles.class, PacketCloudParticles::toBytes, PacketCloudParticles::new, PacketCloudParticles::handle);
    }

}