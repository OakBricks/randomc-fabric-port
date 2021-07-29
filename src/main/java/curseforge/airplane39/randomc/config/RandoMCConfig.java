package curseforge.airplane39.randomc.config;

import curseforge.airplane39.randomc.RandoMC;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = RandoMC.MOD_ID)
public class RandoMCConfig implements ConfigData {
        public int sapphire_ore_maxheight = 256;
        public int sapphire_ore_minheight = 0;
        public int sapphire_ore_vein_size = 9;
        public int sapphire_ore_repeat = 20;
        public int white_dandelion_patch_spawn_tries = 48;
        public int white_dandelion_patch_count = 8;
}
