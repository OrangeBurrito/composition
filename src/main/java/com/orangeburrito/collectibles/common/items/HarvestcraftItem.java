package com.orangeburrito.collectibles.common.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class HarvestcraftItem extends Item {
    public HarvestcraftItem(Properties properties) {
        super(properties);
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent("\u00A79Pam's HarvestCraft Legacy Edition"));
//        tooltip.add(new StringTextComponent("\u00A77from \u00A79Pam's HarvestCraft\u00A77 1.12.2"));
    }
}