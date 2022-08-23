package net.anomz.elementalmod.enchantments.client;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class Keys {
    public static final KeyBinding excavateKey = new KeyBinding("key.elemental.key.excavate", 67, "Elemental");

    public static void registerKeys() {
        ClientRegistry.registerKeyBinding(excavateKey);
    }
}