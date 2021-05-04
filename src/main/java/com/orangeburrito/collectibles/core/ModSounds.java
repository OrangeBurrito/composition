package com.orangeburrito.collectibles.core;

import com.orangeburrito.collectibles.Collectibles;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

import java.util.HashMap;
import java.util.Map;

@ObjectHolder(Collectibles.MOD_ID)
public class ModSounds {
    public final static SoundEvent FART = null;
    public final static SoundEvent FLUSH = null;

    private static SoundEvent createSoundEvent(String soundName) {
        final ResourceLocation soundID = new ResourceLocation(Collectibles.MOD_ID, soundName);
        return new SoundEvent(soundID).setRegistryName(soundID);
    }

    @Mod.EventBusSubscriber(modid = Collectibles.MOD_ID, bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerSoundEvents(final RegistryEvent.Register<SoundEvent> event) {
//            System.out.println("REGISTER SOUND EVENTS CALLED");
            event.getRegistry().registerAll(
                    createSoundEvent("fart"),
                    createSoundEvent("flush")
            );
        }
    }
}