package com.orangeburrito.collectibles.client;

import com.orangeburrito.collectibles.client.renderer.entity.model.HorseMaskModel;
import com.orangeburrito.common.ISidedReference;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.eventbus.api.IEventBus;

public class ClientReference implements ISidedReference {

    private final HorseMaskModel horseMaskModel = new HorseMaskModel(1.0f);
    private final HorseMaskModel horseMaskHelmet = new HorseMaskModel(0.5f);

    @Override
    public void setup(IEventBus modEventBus, IEventBus forgeEventBus) { }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getRubyArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.HEAD ? horseMaskHelmet : horseMaskModel);
    }
}
