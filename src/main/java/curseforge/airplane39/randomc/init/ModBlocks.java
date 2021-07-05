package curseforge.airplane39.randomc.init;

import curseforge.airplane39.randomc.RandoMC;
import curseforge.airplane39.randomc.block.SaphireOreBlock;
import curseforge.airplane39.randomc.block.WhiteDandelion;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static curseforge.airplane39.randomc.RandoMC.MOD_ID;

public class ModBlocks {

    public static final WhiteDandelion WHITE_DANDELION = new WhiteDandelion(StatusEffects.SATURATION, 30, AbstractBlock.Settings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS));

    public static final Block SAPPHIRE_ORE = new SaphireOreBlock(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).strength(1.0f, 10.0f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().sounds(BlockSoundGroup.STONE));

    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "white_dandelion"), WHITE_DANDELION);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);

        //MOD ITEMS
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "white_dandelion"), new BlockItem(WHITE_DANDELION, new FabricItemSettings().group(RandoMC.ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sapphire_ore"), new BlockItem(SAPPHIRE_ORE, new FabricItemSettings().group(RandoMC.ITEM_GROUP)));

    }

}
