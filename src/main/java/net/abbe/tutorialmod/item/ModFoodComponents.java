package net.abbe.tutorialmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent COCONUT = new FoodComponent.Builder().hunger(4).saturationModifier(0.25f).build();
}
