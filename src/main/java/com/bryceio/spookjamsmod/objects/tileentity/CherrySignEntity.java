package com.bryceio.spookjamsmod.objects.tileentity;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class CherrySignEntity extends TileEntity{

	public CherrySignEntity(final TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
	}
	
	public CherrySignEntity() {
		this(TileEntityType.SIGN);
	}
}
