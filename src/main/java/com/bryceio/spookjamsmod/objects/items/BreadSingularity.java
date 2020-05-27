package com.bryceio.spookjamsmod.objects.items;

import java.util.List;

import com.bryceio.spookjamsmod.lists.FoodList;
import com.bryceio.spookjamsmod.lists.ItemList;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class BreadSingularity extends Item{

	public BreadSingularity() {
		super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(1).rarity(Rarity.RARE).food(FoodList.GLUTENFREEBREAD));
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("\u00A73" + "Perhaps now it's edible?" + "\u00A73"));
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
		final ItemStack KBBREAD = new ItemStack(ItemList.BATTLEBREAD.get(), 1, null);
		KBBREAD.addEnchantment(Enchantments.KNOCKBACK, 10);
		return super.onItemUseFinish(KBBREAD, worldIn, entityLiving);
	}
}
