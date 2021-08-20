package curseforge.airplane39.randomc;

import curseforge.airplane39.randomc.init.ModBlocks;
import curseforge.airplane39.randomc.init.ModItems;
import curseforge.airplane39.randomc.worldgen.RandoMCWorldGenFeatures;
import curseforge.airplane39.randomc.worldgen.biomes.BlardlandsPlains;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.kyrptonaught.customportalapi.portal.PortalIgnitionSource;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

public class RandoMC implements ModInitializer {

	public static final String MOD_ID = "random_additions";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID.toUpperCase(Locale.ROOT));

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "main"),
			() -> new ItemStack(ModBlocks.SAPPHIRE_ORE));

	@Override
	public void onInitialize() {

		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.debug("Registering stuff for RandoMC Fabric Port");
		RandoMCWorldGenFeatures.registerWorldGenFeatures();
		LOGGER.debug("Registered Worldgen Features");
		BlardlandsPlains.registerBlardlandsPlains();
		ModBlocks.registerBlocks();
		LOGGER.debug("Registered Blocks");
		ModItems.registerItems();
		LOGGER.debug("Registered Items");

		LOGGER.info("RandoMC has initialized");
		LOGGER.debug("Built against Yarn 1.17+build.13, Fabric Loader 0.11.6, Minecraft 1.17, Fabric API 0.36.0+1.17");
		LOGGER.debug("RandoMC Fabric was made by OakBricks/EnchantedSpade and airplane39");
		LOGGER.info("please get this mod from official sources (GitHub, Curse, Modrinth), check out the mod's modmenu page for more info");

	}
}
