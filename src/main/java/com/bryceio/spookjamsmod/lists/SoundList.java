package com.bryceio.spookjamsmod.lists;

import com.bryceio.spookjamsmod.Main;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;

public class SoundList
{
   public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<>(ForgeRegistries.SOUND_EVENTS, Main.MOD_ID);
}