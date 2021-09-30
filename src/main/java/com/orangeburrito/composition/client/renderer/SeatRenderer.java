package com.orangeburrito.composition.client.renderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.orangeburrito.composition.common.entity.SeatEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

/**
 * Author: MrCrayfish
 */
public class SeatRenderer extends EntityRenderer<SeatEntity> {
    public SeatRenderer(EntityRendererManager manager) {
        super(manager);
    }

    @Override
    public ResourceLocation getEntityTexture(SeatEntity seatEntity) {
        return null;
    }

    //@Override
    protected void func_225629_a_(SeatEntity p_225629_1_, String p_225629_2_, MatrixStack p_225629_3_, IRenderTypeBuffer p_225629_4_, int p_225629_5_) {
    }
}
