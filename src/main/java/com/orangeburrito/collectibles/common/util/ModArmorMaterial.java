package com.orangeburrito.collectibles.common.util;

import java.util.function.Supplier;

import com.orangeburrito.collectibles.Collectibles;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.util.Lazy;

public enum ModArmorMaterial implements IArmorMaterial {
    //  Adding mod id prefix before the id if there are  errors, and remove it later when you have the model textures
    //  Collectibles.MOD_ID + "flower_crown"
    FLOWER_CROWN("flower_crown", 0, new int[] {2, 6, 7, 1}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, 0.0F, () -> Ingredient.fromTag(ItemTags.SMALL_FLOWERS)),
    WITCH_HAT("witch_hat", 10, new int[] {2, 6, 7, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0, 0.0F, () -> Ingredient.fromTag(ItemTags.SMALL_FLOWERS)),
    PLATE("plate", 40, new int[] {3, 6, 7, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0, 0.0F, () -> Ingredient.fromItems(Items.IRON_INGOT));

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairMaterialLazy;

    private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountArrayIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, float knockbackResistanceIn, Supplier<Ingredient> repairMaterialSupplier) {
        this.name = Collectibles.MOD_ID + ":" + nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountArrayIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = soundEventIn;
        this.toughness = toughnessIn;
        this.knockbackResistance = knockbackResistanceIn;
        this.repairMaterialLazy = Lazy.concurrentOf(repairMaterialSupplier);
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterialLazy.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}