package com.bryceio.spookjamsmod.lists;

import com.bryceio.spookjamsmod.Main;
import com.bryceio.spookjamsmod.objects.items.BattleCiabatta;
import com.bryceio.spookjamsmod.objects.items.BreadSingularity;
import com.bryceio.spookjamsmod.objects.items.UltraDenseBread;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.RegistryObject;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;

public class ItemList
{

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, Main.MOD_ID);
        
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(FoodList.CHEESE)));
    public static final RegistryObject<Item> FRIEDEGG = ITEMS.register("fried_egg", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(FoodList.FRIEDEGG)));
    public static final RegistryObject<Item> GLUTENFREEBREAD = ITEMS.register("gluten_free_bread", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(FoodList.GLUTENFREEBREAD)));
    public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(FoodList.CHOCOLATE)));
    public static final RegistryObject<Item> CHERRY = ITEMS.register("cherry", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(FoodList.CHERRY)));
    public static final RegistryObject<Item> DRAGONSODA = ITEMS.register("dragon_soda", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(FoodList.DRAGONSODA)));
    public static final RegistryObject<Item> WRAPPEDCHOCOLATE = ITEMS.register("wrapped_chocolate", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(FoodList.WRAPPEDCHOCOLATE)));
    public static final RegistryObject<Item> WRAPPEDCHERRYCHOCOLATE = ITEMS.register("wrapped_cherry_chocolate", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(FoodList.WRAPPEDCHERRYCHOCOLATE)));
    public static final RegistryObject<Item> SMOKEDCHEESE = ITEMS.register("smoked_cheese", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(FoodList.SMOKEDCHEESE)));
    public static final RegistryObject<Item> CONDENSEDBREAD = ITEMS.register("condensed_loaf", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(FoodList.CONDENSEDBREAD)));
    public static final RegistryObject<Item> ULTRADENSELOAF = ITEMS.register("ultradense_loaf", UltraDenseBread::new);
    public static final RegistryObject<Item> BREADSINGULATIRY = ITEMS.register("bread_singularity", BreadSingularity::new);
    public static final RegistryObject<Item> BATTLEBREAD = ITEMS.register("battle_ciabatta", BattleCiabatta::new);
}