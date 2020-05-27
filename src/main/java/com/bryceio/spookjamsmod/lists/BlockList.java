package com.bryceio.spookjamsmod.lists;

import com.bryceio.spookjamsmod.objects.blocks.CustomWoodButtonBlock;
import com.bryceio.spookjamsmod.world.feature.CherryTree;
import com.bryceio.spookjamsmod.objects.blocks.CustomTrapDoorBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.FenceBlock;
import com.bryceio.spookjamsmod.Main;
import com.bryceio.spookjamsmod.objects.blocks.CustomDoorBlock;
import com.bryceio.spookjamsmod.objects.blocks.CustomPressureBlock;
import com.bryceio.spookjamsmod.objects.blocks.CustomSaplingBlock;
import com.bryceio.spookjamsmod.objects.blocks.CustomStairsBlock;

import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.LogBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.RegistryObject;
import net.minecraft.block.Block;
import net.minecraftforge.registries.DeferredRegister;

public class BlockList{
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> CHERRYPLANK = BLOCKS.register("cherry_planks", () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CHERRYLEAFBLOCK = BLOCKS.register("cherry_leaves", () -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> CHERRYLOG = BLOCKS.register("cherry_log", () -> new LogBlock((MaterialColor)null, Block.Properties.from(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> CHERRYWOOD = BLOCKS.register("cherry_wood", () -> new LogBlock((MaterialColor)null, Block.Properties.from(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> CHERRYSTAIRS = BLOCKS.register("cherry_stairs", () -> new CustomStairsBlock(CHERRYPLANK.get().getDefaultState(), Block.Properties.from(CHERRYPLANK.get())));
    public static final RegistryObject<Block> CHERRYSLAB = BLOCKS.register("cherry_slab", () -> new SlabBlock(Block.Properties.from(CHERRYPLANK.get())));
    public static final RegistryObject<Block> CHERRYPRESSUREPLATE = BLOCKS.register("cherry_pressure_plate", () -> new CustomPressureBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.from(CHERRYPLANK.get()).doesNotBlockMovement()));
    public static final RegistryObject<Block> CHERRYDOOR = BLOCKS.register("cherry_door", () -> new CustomDoorBlock(Block.Properties.from(CHERRYPLANK.get()).notSolid()));
    public static final RegistryObject<Block> CHERRYFENCE = BLOCKS.register("cherry_fence", () -> new FenceBlock(Block.Properties.from(CHERRYPLANK.get())));
    public static final RegistryObject<Block> CHERRYFENCEGATE = BLOCKS.register("cherry_fence_gate", () -> new FenceGateBlock(Block.Properties.from(CHERRYPLANK.get())));
    public static final RegistryObject<Block> CHERRYTRAPDOOR = BLOCKS.register("cherry_trapdoor", () -> new CustomTrapDoorBlock(Block.Properties.from(CHERRYPLANK.get()).notSolid()));
    public static final RegistryObject<Block> CHERRYBUTTON = BLOCKS.register("cherry_button", () -> new CustomWoodButtonBlock(Block.Properties.from(CHERRYPLANK.get()).doesNotBlockMovement()));

    public static final RegistryObject<Block> CHERRYSAPLING = BLOCKS.register("cherry_sapling", () -> new CustomSaplingBlock(() -> new CherryTree(), Block.Properties.from(Blocks.OAK_SAPLING)));
}