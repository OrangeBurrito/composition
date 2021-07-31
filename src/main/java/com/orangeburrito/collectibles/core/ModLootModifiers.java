package com.orangeburrito.collectibles.core;

import com.orangeburrito.collectibles.Collectibles;
import com.orangeburrito.collectibles.common.loot.WitchLootModifier;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModLootModifiers {
    private ModLootModifiers() {}

    public static final DeferredRegister<GlobalLootModifierSerializer<?>> REGISTER = DeferredRegister.create(ForgeRegistries.LOOT_MODIFIER_SERIALIZERS, Collectibles.MOD_ID);

    public static final RegistryObject<GlobalLootModifierSerializer<WitchLootModifier>> DROPS_WITCH_HAT = REGISTER.register("drops_witch_hat", WitchLootModifier.Serializer::new);
}
