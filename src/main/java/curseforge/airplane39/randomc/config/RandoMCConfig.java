package curseforge.airplane39.randomc.config;

import curseforge.airplane39.randomc.RandoMC;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = RandoMC.MOD_ID)
public class RandoMCConfig implements ConfigData {

    @ConfigEntry.Gui.RequiresRestart
    @ConfigEntry.Gui.CollapsibleObject
    WorldgenConfig worldgen = new WorldgenConfig();

    static class WorldgenConfig {
        int sapphire_ore_maxheight = 256;
        int sapphire_ore_minheight = 0;
        int sapphire_ore_vein_size = 9;
        int sapphire_ore_repeat = 20;
        int white_dandelion_patch_spawn_tries = 48;
        int white_dandelion_patch_count = 8;
    }
}
