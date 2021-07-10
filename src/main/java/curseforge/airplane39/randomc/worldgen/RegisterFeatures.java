package curseforge.airplane39.randomc.worldgen;

import curseforge.airplane39.randomc.RandoMC;
import curseforge.airplane39.randomc.init.ModBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.CountNoiseDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;

public class RegisterFeatures {

    public static ConfiguredFeature<?, ?> WHITE_DANDELION_CONFIGURED_FEATURE;

    public static void registerFeature() {
        WHITE_DANDELION_CONFIGURED_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(RandoMC.MOD_ID, "flower_pink_daisy"), (Feature.FLOWER.configure((new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.WHITE_DANDELION.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(64).build()).decorate(ConfiguredFeatures.Decorators.SPREAD_32_ABOVE).decorate(ConfiguredFeatures.Decorators.HEIGHTMAP).spreadHorizontally()).decorate(Decorator.COUNT_NOISE.configure(new CountNoiseDecoratorConfig(-0.8D, 15, 4))));
    }

}
