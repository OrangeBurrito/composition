package com.orangeburrito.collectibles.core;

import com.orangeburrito.collectibles.Collectibles;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Collectibles.MOD_ID);
    public static final RegistryObject<SoundEvent> FLUSH = register("block.toilet.flush");

    private static RegistryObject<SoundEvent> register(String name) {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(Collectibles.MOD_ID, name)));
    }
}