package org.bukkit.craftbukkit.v1_19_R1.entity;

import org.bukkit.craftbukkit.v1_19_R1.CraftServer;
import org.bukkit.entity.Flying;

public class CraftFlying extends CraftMob implements Flying {

    public CraftFlying(CraftServer server, net.minecraft.world.entity.FlyingMob entity) {
        super(server, entity);
    }

    @Override
    public net.minecraft.world.entity.FlyingMob getHandle() {
        return (net.minecraft.world.entity.FlyingMob) entity;
    }

    @Override
    public String toString() {
        return "CraftFlying";
    }
}
