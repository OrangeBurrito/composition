package com.orangeburrito.collectibles.common.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class SouthernStyleBreakfastItem extends HarvestcraftItem {
    public SouthernStyleBreakfastItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        entityLiving.addPotionEffect(new EffectInstance(Effects.STRENGTH, 3600, 0));
        entityLiving.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 3600, 0));
        return stack;
    }
}
