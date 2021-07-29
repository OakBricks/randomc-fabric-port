package curseforge.airplane39.randomc.config;

import curseforge.airplane39.randomc.RandoMC;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = RandoMC.MOD_ID)
public class RandoMCConfig implements ConfigData {
        @ConfigEntry.Gui.RequiresRestart
        @Comment("Maximum Height for Sapphire Ore Generation")
        public int sapphire_ore_maximum_height = 256;

        @ConfigEntry.Gui.RequiresRestart
        @Comment("Minimum Height for Sapphire Ore Generation")
        public int sapphire_ore_minimum_height = 0;

        @ConfigEntry.Gui.RequiresRestart
        @Comment("Vein Size of Sapphire Ore's Generation")
        public int sapphire_ore_vein_size = 9;

        @ConfigEntry.Gui.RequiresRestart
        @Comment("How Many Time Sapphire Ore's Generation is Repeated")
        public int sapphire_ore_repeat = 20;

        @ConfigEntry.Gui.RequiresRestart
        @Comment("How Many Times White Dandelion Patches Try To Spawn")
        public int white_dandelion_patch_spawn_tries = 64;

        @ConfigEntry.Gui.RequiresRestart
        @Comment("How Many White Dandelion Patches Are Possible in a Chunk")
        public int white_dandelion_patch_count = 8;
}
