package com.bryceio.spookjamsmod.lists;

import com.bryceio.spookjamsmod.Main;
import com.google.common.collect.ImmutableSet;

import net.minecraft.tileentity.SignTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeList {
	public static final DeferredRegister<TileEntityType<?>> TILEENTITIES = new DeferredRegister<TileEntityType<?>>(ForgeRegistries.TILE_ENTITIES, Main.MOD_ID); 
	
	public static final RegistryObject<TileEntityType<SignTileEntity>> CHERRYSIGNENTITY = TILEENTITIES.register("cherry_sign_tile_entity_type", () -> new TileEntityType<SignTileEntity>(SignTileEntity::new, ImmutableSet.of(BlockList.CHERRYSIGN.get(), BlockList.CHERRYWALLSIGN.get()), null));
}
