package net.anomz.elementalmod.enchantments.common.network.packet;

import net.anomz.elementalmod.enchantments.common.capabilities.mod.IModCapability;
import net.anomz.elementalmod.enchantments.common.util.PlayerUtil;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class PacketLumberjackToggle {

    private final boolean toggle;

    public PacketLumberjackToggle(boolean toggle) {
        this.toggle = toggle;
    }

    public PacketLumberjackToggle(PacketBuffer buf) {
        toggle = buf.readBoolean();
    }

    public void toBytes(PacketBuffer buf) {
        buf.writeBoolean(toggle);
    }

    public void handle(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            if (ctx.get() == null || ctx.get().getSender() == null) return;
            IModCapability enchantsCap = PlayerUtil.getEnchantsCapability(ctx.get().getSender());
            enchantsCap.setExcavateActive(toggle);
        });
        ctx.get().setPacketHandled(true);
    }
}
