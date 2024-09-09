package com.idtech.entity;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.monster.Zombie;


public class ZomboRenderFactory implements EntityRendererProvider<Blaze> {

    public static ZomboRenderFactory INSTANCE = new ZomboRenderFactory();

    @Override
    public EntityRenderer<Blaze> create(Context manager) {
        return new ZomboRenderer(manager);
    }
}