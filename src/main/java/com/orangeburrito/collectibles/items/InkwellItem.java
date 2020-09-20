package com.orangeburrito.collectibles.items;

import com.orangeburrito.collectibles.util.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class InkwellItem extends Item {
    public InkwellItem(Properties properties) {
        super(properties);
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (KeyboardHelper.isHoldingShift()) {
            tooltip.add(new StringTextComponent("Right click two tables with Scribing Tools to create a Research Table (from Thaumcraft 4 by Azanor)"));
        } else {
            tooltip.add(new StringTextComponent("Hold" + "\u00A79" + " SHIFT " + "\u00A79" + "for more information"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

//    public ActionResultType onBlock
}
