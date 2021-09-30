package com.orangeburrito.composition.core;

import com.orangeburrito.composition.Composition;
import com.orangeburrito.composition.common.loot.WitchLootModifier;
import net.minecraft.advancements.criterion.EntityPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.*;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class LootModifierGen extends GlobalLootModifierProvider {
    public LootModifierGen(DataGenerator generator){
        super(generator, Composition.MOD_ID);
    }

    @Override
    public void start(){
        this.add("drops_witch_hat", ModLootModifiers.DROPS_WITCH_HAT.get(), new WitchLootModifier(
                new ILootCondition[]{
                        KilledByPlayer.builder().build(),
                        RandomChanceWithLooting.builder(0.1f, 0.05f).build(),
                        EntityHasProperty.builder(LootContext.EntityTarget.THIS,
                                EntityPredicate.Builder.create().type(EntityType.WITCH)).build()
                }
        ));
    }
}
