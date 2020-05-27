package com.bryceio.spookjamsmod.world.feature;

import java.util.Random;

import com.bryceio.spookjamsmod.lists.BlockList;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

public class CherryTree extends Tree {
	
	public static final TreeFeatureConfig CHERRYTREECONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BlockList.CHERRYLOG.get().getDefaultState()), new SimpleBlockStateProvider(BlockList.CHERRYLEAFBLOCK.get().getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(1).foliageHeight(3).ignoreVines().setSapling((IPlantable) BlockList.CHERRYSAPLING.get()).build();
	
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
		return Feature.NORMAL_TREE.withConfiguration(CHERRYTREECONFIG);
	}
}
