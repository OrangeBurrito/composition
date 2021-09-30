package com.orangeburrito.composition.client.renderer.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ArmorStandEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


@OnlyIn(Dist.CLIENT)
public class WitchHatModel extends BipedModel<LivingEntity> {
    public static final WitchHatModel INSTANCE = new WitchHatModel();
    public ModelRenderer hat;
    public ModelRenderer hat2;
    public ModelRenderer hat3;
    public ModelRenderer hat4;
//    public ModelRenderer hat4_r1;

    public WitchHatModel() {
        super(1.0F, 0.0F, 90, 20);

//        setVisible(false);
//        bipedHead.showModel = false;
//        bipedHeadwear.showModel = false;
        bipedHead = new ModelRenderer(this, 0, 0);
        bipedHead.addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

        hat = new ModelRenderer(this); // y was -1
        hat.setRotationPoint(-5.0F, -8.0313F, -5.0F);
        hat.setTextureOffset(0, 8).addBox(0.0F, 0.0187F, 0.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);

        hat2 = new ModelRenderer(this);
        hat2.setRotationPoint(1.75F, -8.0F, 2.0F);
        setRotationAngle(hat2, -0.0524F, 0.0F, 0.0262F); // y was -4
        hat2.setTextureOffset(62, 9).addBox(-5.0F, -3.5F, -5.0F, 7.0F, 4.0F, 7.0F, 0.0F, false);

        hat3 = new ModelRenderer(this);
        hat3.setRotationPoint(1.75F, -11.0F, 2.0F);
        setRotationAngle(hat3, -0.1745F, 0.0F, 0.096F); //  y was -4
        hat3.setTextureOffset(74, 1).addBox(-3.25F, -3.5F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

        hat4 = new ModelRenderer(this);
        hat4.setRotationPoint(1.75F, -14.0F, 2.0F);
        setRotationAngle(hat4, -0.3839F, 0.0F, 0.1047F); // z was -1, was 0.7277F
        hat4.setTextureOffset(69, 5).addBox(-1.5078F, -2.3636F, -1.0277F, 1.0F, 2.0F, 1.0F, 0.25F, false);

        bipedHead.addChild(hat); // x was -1.6078
        bipedHead.addChild(hat2);
        bipedHead.addChild(hat3);
        bipedHead.addChild(hat4);
    }

    @Override
    public void setRotationAngles(LivingEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        if (entityIn instanceof ArmorStandEntity) {
            netHeadYaw = 0;
        }

        super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
