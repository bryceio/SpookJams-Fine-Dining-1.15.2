package com.bryceio.spookjamsmod.objects.blocks;

import com.bryceio.spookjamsmod.lists.BlockList;
import com.bryceio.spookjamsmod.lists.TileEntityTypeList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class WallCherrySign extends WallSignBlock{

	public WallCherrySign() {
		super(Block.Properties.from(BlockList.CHERRYPLANK.get()).doesNotBlockMovement().notSolid(), WoodType.OAK);
	}

	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return TileEntityTypeList.CHERRYSIGNENTITY.get().create();
	}
}