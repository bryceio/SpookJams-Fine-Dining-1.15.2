package com.bryceio.spookjamsmod.objects.items;

import java.util.List;
import java.util.UUID;

import com.bryceio.spookjamsmod.lists.FoodList;
import com.google.common.collect.Multimap;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class BattleCiabatta extends Item {

	public BattleCiabatta() {
		super(new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.EPIC).food(FoodList.GLUTENFREEBREAD));
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("Week-old bread, great for clobbering."));
	}
	@Override
	public Multimap<String, AttributeModifier> getAttributeModifiers(EquipmentSlotType slot, ItemStack stack) {
		//final AttributeModifier CIABATTAKB = new AttributeModifier(UUID.fromString("7bdc0233-813b-4592-b944-a1756fa62a40"), "BreadKB", 10.0d, Operation.MULTIPLY_BASE);
		final AttributeModifier CIABATTADMG = new AttributeModifier(UUID.fromString("6e1cce33-8b3b-4592-b944-a1756fa62a41"), "BreadDMG", 3.0d, Operation.ADDITION);
		//stack.addAttributeModifier("generic.attack_knockback", CIABATTAKB, EquipmentSlotType.MAINHAND);
		stack.addAttributeModifier("generic.attackDamage", CIABATTADMG, EquipmentSlotType.MAINHAND);
		return super.getAttributeModifiers(EquipmentSlotType.MAINHAND, stack);
	}

}
