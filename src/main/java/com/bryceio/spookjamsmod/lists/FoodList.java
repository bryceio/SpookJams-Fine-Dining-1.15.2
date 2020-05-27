package com.bryceio.spookjamsmod.lists;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import net.minecraft.item.Food;

public class FoodList{
        public static final Food CHEESE = new Food.Builder().hunger(4).saturation(5.0f).build();
        public static final Food FRIEDEGG = new Food.Builder().hunger(4).saturation(2.0f).build();
        public static final Food CHOCOLATE = new Food.Builder().hunger(3).saturation(0.5f).build();
        public static final Food GLUTENFREEBREAD = new Food.Builder().hunger(4).saturation(1.4f).build();
        public static final Food CHERRY = new Food.Builder().hunger(4).saturation(2.4f).build();
        public static final Food DRAGONFRUIT = new Food.Builder().hunger(10).saturation(8.0f).build();
        public static final Food DRAGONSODA = new Food.Builder().hunger(2).saturation(0.2f).setAlwaysEdible().effect(() -> new EffectInstance(Effects.RESISTANCE, 600, 1), 1).build();
        public static final Food DRAGONCOOKIE = new Food.Builder().hunger(20).saturation(20.0f).build();
        public static final Food WRAPPEDCHOCOLATE = new Food.Builder().hunger(3).saturation(0.5f).build();
        public static final Food WRAPPEDCHERRYCHOCOLATE = new Food.Builder().hunger(6).saturation(1.5f).build();
        public static final Food SMOKEDCHEESE = new Food.Builder().hunger(6).saturation(6.0f).build();
        public static final Food CONDENSEDBREAD = new Food.Builder().hunger(20).saturation(3.5f).build();

}