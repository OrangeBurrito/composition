package com.orangeburrito.composition.client.renderer.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class HorseMaskModel extends BipedModel<LivingEntity> {

    public HorseMaskModel(float modelSize) {
        super(modelSize, 0.0F, 80, 80);

        ModelRenderer bipedHead = new ModelRenderer(this);
        bipedHead.setRotationPoint(0.0F, -11.0F, 4.75F);

        ModelRenderer ear1 = new ModelRenderer(this);
        ear1.setRotationPoint(-1.0012F, 10.0F, 10.0108F);
        bipedHead.addChild(ear1);
        setRotationAngle(ear1, 0.0F, -0.3927F, 0.0F);
        ear1.setTextureOffset(0, 24).addBox(-1.1229F, -15.0F, -19.7821F, 0.0F, 4.0F, 4.0F, 0.0F, false);

        ModelRenderer ear2 = new ModelRenderer(this);
        ear2.setRotationPoint(-8.2358F, -2.0F, -2.1631F);
        bipedHead.addChild(ear2);
        setRotationAngle(ear2, 0.0F, 0.3927F, 0.0F);
        ear2.setTextureOffset(0, 0).addBox(5.0F, -3.0F, -5.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);

        ModelRenderer head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -2.0F, 0.0F);
        bipedHead.addChild(head);
        head.setTextureOffset(45, 0).addBox(-4.0F, 1.0F, 4.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(36, 16).addBox(-4.0F, 8.0F, 3.0F, 8.0F, 1.0F, 4.0F, 0.0F, false);
        head.setTextureOffset(48, 37).addBox(2.0F, 2.0F, 3.0F, 2.0F, 6.0F, 4.0F, 0.0F, false);
        head.setTextureOffset(18, 46).addBox(-4.0F, 2.0F, 3.0F, 2.0F, 6.0F, 4.0F, 0.0F, false);
        head.setTextureOffset(36, 7).addBox(-3.0F, 2.0F, 4.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);
        head.setTextureOffset(0, 13).addBox(1.5F, 5.0F, 7.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(0, 17).addBox(2.0F, 5.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(4, 0).addBox(-3.0F, 5.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(0, 0).addBox(-2.5F, 5.0F, 7.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(34, 41).addBox(-2.0F, 2.0F, 7.0F, 4.0F, 3.0F, 6.0F, 0.0F, false);
        head.setTextureOffset(11, 30).addBox(-2.0F, 7.0F, 7.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        head.setTextureOffset(55, 5).addBox(-1.5F, 6.25F, 7.0F, 0.0F, 0.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(55, 5).addBox(1.0F, 6.25F, 7.0F, 0.0F, 0.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(56, 5).addBox(-1.0F, 6.25F, 10.0F, 2.0F, 0.0F, 0.0F, 0.0F, false);
        head.setTextureOffset(0, 28).addBox(4.0F, 1.0F, -5.0F, 1.0F, 5.0F, 9.0F, 0.0F, false);
        head.setTextureOffset(0, 13).addBox(-5.0F, 6.0F, -5.0F, 10.0F, 3.0F, 6.0F, 0.0F, false);
        head.setTextureOffset(25, 13).addBox(-5.0F, 1.0F, -5.0F, 1.0F, 5.0F, 9.0F, 0.0F, false);
        head.setTextureOffset(24, 0).addBox(-4.0F, 0.0F, 1.0F, 8.0F, 2.0F, 5.0F, 0.0F, false);
        head.setTextureOffset(0, 46).addBox(-4.0F, 1.0F, -7.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(27, 27).addBox(-4.0F, 0.0F, -6.0F, 8.0F, 11.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(0, 0).addBox(-4.25F, 7.0F, -5.25F, 8.0F, 5.0F, 8.0F, 0.0F, false);
        head.setTextureOffset(11, 20).addBox(3.75F, 6.0F, -5.25F, 0.0F, 1.0F, 9.0F, 0.0F, false);
        head.setTextureOffset(11, 19).addBox(-4.25F, 6.0F, -5.25F, 0.0F, 1.0F, 9.0F, 0.0F, false);
        head.setTextureOffset(16, 41).addBox(-4.0F, -1.0F, -5.0F, 8.0F, 1.0F, 4.0F, 0.0F, false);
        head.setTextureOffset(0, 22).addBox(-5.0F, 0.0F, -4.0F, 10.0F, 1.0F, 5.0F, 0.0F, false);
        head.setTextureOffset(32, 7).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(49, 29).addBox(-2.0F, -2.0F, -4.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(46, 27).addBox(-1.0F, 7.0F, -8.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(0, 42).addBox(-4.0F, 5.0F, -8.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(11, 35).addBox(-3.0F, 1.0F, -8.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(0, 44).addBox(-3.0F, 3.0F, -8.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(45, 21).addBox(-2.0F, 1.0F, 7.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
