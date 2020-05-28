package com.bryceio.spookjamsmod;

import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.RegistryObject;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import com.bryceio.spookjamsmod.lists.BiomeList;
import com.bryceio.spookjamsmod.lists.BlockList;
import com.bryceio.spookjamsmod.lists.ItemList;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;

@Mod("spookjamsmod")
@Mod.EventBusSubscriber(modid = "spookjamsmod", bus = Mod.EventBusSubscriber.Bus.MOD)
public class Main{
    public static Main instance;
    public static final String MOD_ID = "spookjamsmod";
    
    public Main() {
    	
        Main.instance = this;
        
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetup);
        
        ItemList.ITEMS.register(modEventBus);
        BlockList.BLOCKS.register(modEventBus);
        BiomeList.BIOMES.register(modEventBus);
    }
    
    @SubscribeEvent
    public static void createBlockItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();
        BlockList.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            if (block == BlockList.CHERRYBUTTON.get() || block == BlockList.CHERRYDOOR.get() || block == BlockList.CHERRYPRESSUREPLATE.get() || block == BlockList.CHERRYTRAPDOOR.get() || block == BlockList.CHERRYFENCEGATE.get()) {
                final Item.Properties properties = new Item.Properties().group(ItemGroup.REDSTONE);
                final BlockItem blockItem = new BlockItem(block, properties);
                blockItem.setRegistryName(block.getRegistryName());
                registry.register(blockItem);
            }
            else if(block == BlockList.CHERRYLEAFBLOCK.get() || block == BlockList.CHERRYSAPLING.get() || block == BlockList.CHERRYFENCE.get()) {
            	final Item.Properties properties = new Item.Properties().group(ItemGroup.DECORATIONS);
                final BlockItem blockItem = new BlockItem(block, properties);
                blockItem.setRegistryName(block.getRegistryName());
                registry.register(blockItem);
            }
            else if (block == BlockList.CHERRYWALLSIGN.get() || block == BlockList.CHERRYSIGN.get()) {}
            else {
                final Item.Properties properties = new Item.Properties().group(ItemGroup.BUILDING_BLOCKS);
                final BlockItem blockItem = new BlockItem(block, properties);
                blockItem.setRegistryName(block.getRegistryName());
                registry.register(blockItem);
            }
        });
    }
    
    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
    	BiomeList.registerBiomes();
    }
    
    private void setup(final FMLCommonSetupEvent event) {
    }
    
    private void clientSetup(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockList.CHERRYDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.CHERRYTRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.CHERRYSAPLING.get(), RenderType.getCutout());
    }
    
    public void onServerStarting(final FMLServerStartingEvent event) {
    }
}