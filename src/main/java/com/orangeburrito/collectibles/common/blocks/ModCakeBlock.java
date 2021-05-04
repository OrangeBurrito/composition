package com.orangeburrito.collectibles.common.blocks;

import net.minecraft.block.CakeBlock;

public class ModCakeBlock extends CakeBlock {

    public ModCakeBlock(Properties properties) {
        super(properties);
        setDefaultState(stateContainer.getBaseState().with(BITES, 0));
    }
}
