package com.orangeburrito.collectibles.core.proxy;

import com.orangeburrito.collectibles.core.ModWorldGen;
import net.minecraftforge.fml.DeferredWorkQueue;

public class CommonProxy {

    public void onSetupCommon() {
        DeferredWorkQueue.runLater(ModWorldGen::registerConfiguredFeatures);
    }

    public void onSetupClient() {}
}
