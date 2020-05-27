package com.bryceio.spookjamsmod.lists;

import com.bryceio.spookjamsmod.Main;
import com.bryceio.spookjamsmod.world.biomes.CherryForest;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeList {
	public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<Biome>(ForgeRegistries.BIOMES,
			Main.MOD_ID);

	public static final RegistryObject<Biome> CHERRYFOREST = BIOMES.register("cherry_forest",
			() -> new CherryForest(new Biome.Builder().precipitation(RainType.RAIN).scale(0.2f).temperature(0.7f)
					.waterColor(4159204).waterFogColor(329011).depth(0.1f).category(Category.FOREST).downfall(0.8f)
					.surfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG).parent(null)));
	
	private static void registerBiome(Biome biome, Type... types) {
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 10));
	}
	public static void registerBiomes() {
		registerBiome(CHERRYFOREST.get(), Type.OVERWORLD);
	}
}

	