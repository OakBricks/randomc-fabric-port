package curseforge.airplane39.randomc;

import curseforge.airplane39.randomc.init.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RandoMCClient implements ClientModInitializer {

    public static final Logger LOGGER = LogManager.getLogger("RandoMC Client");

    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_DANDELION, RenderLayer.getCutoutMipped());

        LOGGER.info("RandoMC Client has initalized");

    }
}
