package com.orangeburrito.collectibles.core;

import com.google.common.collect.ImmutableList;
import com.orangeburrito.collectibles.Collectibles;
import net.minecraft.loot.LootEntry;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.TableLootEntry;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = Collectibles.MOD_ID)
public class ModLoot {
    private ModLoot() {}

    private static final List<String> ENTITY_TABLES = ImmutableList.of("witch");

    @SuppressWarnings("unused") //used in event
    @SubscribeEvent
    public static void lootLoad(LootTableLoadEvent evt) {
        String entitiesPrefix = "minecraft:entities/";
        String name = evt.getName().toString();

//        if ((Settings.COMMON.chestLootEnabled.get() && name.startsWith(chestsPrefix) && CHEST_TABLES.contains(name.substring(chestsPrefix.length())))
        if (name.startsWith(entitiesPrefix) && ENTITY_TABLES.contains(name.substring(entitiesPrefix.length()))) {
            String file = name.substring("minecraft:".length());
            evt.getTable().addPool(getInjectPool(file));
        }
    }

    private static LootPool getInjectPool(String entryName) {
        return LootPool.builder().addEntry(getInjectEntry(entryName)).bonusRolls(0, 1).name("xreliquary_inject_pool").build();
    }

    private static LootEntry.Builder<?> getInjectEntry(String name) {
        return TableLootEntry.builder(new ResourceLocation(Collectibles.MOD_ID, "inject/" + name)).weight(1);
    }
}
