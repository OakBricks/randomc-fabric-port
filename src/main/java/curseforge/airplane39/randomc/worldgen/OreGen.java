package curseforge.airplane39.randomc.worldgen;

import curseforge.airplane39.randomc.init.ModBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

import static curseforge.airplane39.randomc.RandoMC.MOD_ID;

public class OreGen {
    public static ConfiguredFeature<?, ?> SAPPHIRE_ORE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.SAPPHIRE_ORE.getDefaultState(),
                    9)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(256)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    public static void registerWorldGenFeatures() {
        RegistryKey<ConfiguredFeature<?, ?>> oreWoolOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_sapphire_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreWoolOverworld.getValue(), SAPPHIRE_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreWoolOverworld);
    }

}
