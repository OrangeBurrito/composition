package com.orangeburrito.collectibles.common.loot;

import com.google.gson.JsonObject;
import com.orangeburrito.collectibles.core.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;

import java.util.List;

public class WitchLootModifier extends LootModifier {
    public WitchLootModifier(ILootCondition[] conditions){
        super(conditions);
    }

    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        generatedLoot.add(new ItemStack(ModItems.WITCH_HAT.get(), 1));
        return generatedLoot;
    }

    public static final class Serializer extends GlobalLootModifierSerializer<WitchLootModifier> {
        @Override public WitchLootModifier read(ResourceLocation location, JsonObject object, ILootCondition[] conditions){
            return new WitchLootModifier(conditions);
        }
        @Override public JsonObject write(WitchLootModifier instance){
            return makeConditions(instance.conditions);
        }
    }
}
