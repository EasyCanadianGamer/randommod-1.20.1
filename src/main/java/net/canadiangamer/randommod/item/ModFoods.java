package net.canadiangamer.randommod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RANDOM_MEAT_RAW = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 400), 0.35f).build();
    public static final FoodProperties RANDOM_MEAT_COOKED = new FoodProperties.Builder().nutrition(5).fast()
            .saturationMod(0.7f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400), 0.40f).build();
}
