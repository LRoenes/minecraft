package com.example.examplemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties CHUZO = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 0), 1.0f)
            .build();



    public static final FoodProperties ATOM = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 500, 0), 1.0f)
            .effect(()-> new MobEffectInstance(MobEffects.JUMP,500,0),1.0f)
            .build();
}

