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
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;

import static curseforge.airplane39.randomc.RandoMC.MOD_ID;
import static curseforge.airplane39.randomc.init.ModBlocks.WHITE_DANDELION;

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
    
    public static ConfiguredFeature<?, ?> WHITE_DANDELION_PATCH = /*register("patch_sunflower", (ConfiguredFeature)*/ Feature.RANDOM_PATCH.configure((new net.minecraft.world.gen.feature.RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(WHITE_DANDELION.getDefaultState()), new SimpleBlockPlacer())).tries(64).cannotProject().build()).decorate(ConfiguredFeatures.Decorators.SPREAD_32_ABOVE).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).repeat(10);

    @SuppressWarnings("deprecation")
    public static void registerWorldGenFeatures() {
        RegistryKey<ConfiguredFeature<?, ?>> oreSapphireOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_sapphire_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphireOverworld.getValue(), SAPPHIRE_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphireOverworld);

        RegistryKey<ConfiguredFeature<?, ?>> patchWhiteDandelion = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "patch_white_dandelion"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, patchWhiteDandelion.getValue(), WHITE_DANDELION_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.TOP_LAYER_MODIFICATION, patchWhiteDandelion);

    }

}
