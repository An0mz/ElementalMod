package net.anomz.elementalmod.enchantments.common.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public interface IProxy {

    void init();
    Minecraft getClient();
    World getClientWorld();
    PlayerEntity getClientPlayer();

}