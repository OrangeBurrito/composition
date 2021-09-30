package com.orangeburrito.composition.core.proxy;

import com.orangeburrito.composition.core.ModWorldGen;
import net.minecraftforge.fml.DeferredWorkQueue;

public class CommonProxy {

    public void onSetupCommon() {
        DeferredWorkQueue.runLater(ModWorldGen::registerConfiguredFeatures);
    }

    public void onSetupClient() {}
}
