package com.bryceio.spookjamsmod.objects.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class UltraDenseBread extends Item{

	public UltraDenseBread() {
		super(new Item.Properties().group(ItemGroup.MATERIALS).rarity(Rarity.UNCOMMON));
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("\u00A73" + "It's too dense to chew" + "\u00A73"));
	}

}
