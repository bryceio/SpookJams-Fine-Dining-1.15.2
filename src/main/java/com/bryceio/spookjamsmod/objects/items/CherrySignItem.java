package com.bryceio.spookjamsmod.objects.items;

import com.bryceio.spookjamsmod.lists.BlockList;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SignItem;

public class CherrySignItem extends SignItem{

	public CherrySignItem() {
		super(new Item.Properties().group(ItemGroup.DECORATIONS), BlockList.CHERRYSIGN.get(), BlockList.CHERRYWALLSIGN.get());
	}

}
