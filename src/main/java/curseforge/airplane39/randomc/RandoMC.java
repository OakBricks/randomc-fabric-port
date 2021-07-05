package curseforge.airplane39.randomc;

import curseforge.airplane39.randomc.init.ModBlocks;
import curseforge.airplane39.randomc.worldgen.OreGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RandoMC implements ModInitializer {

	public static final String MOD_ID = "random_additions";
	public static final Logger LOGGER = LogManager.getLogger();

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "main"),
			() -> new ItemStack(ModBlocks.SAPPHIRE_ORE));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		OreGen.registerWorldGenFeatures();
		ModBlocks.registerBlocks();

		LOGGER.info("RandoMC Fabric was made by OakBricks/EnchantedSpade and airplane39");
		LOGGER.info("RandoMC has initalized");
	}
}
