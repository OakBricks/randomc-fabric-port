package curseforge.airplane39.randomc;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RandoMC implements ModInitializer {

	public static final String MOD_ID = "oakores";
	public static final Logger LOGGER = LogManager.getLogger();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("RandoMC Fabric was made by OakBricks/EnchantedSpade and airplane39");
		LOGGER.info("RandoMC has initalized");
	}
}
