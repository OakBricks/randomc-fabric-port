package curseforge.airplane39.randomc.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static curseforge.airplane39.randomc.RandoMC.MOD_ID;

public class RandoMCSoundEvents {

    public static final Identifier MUSIC_DISC_2021 = new Identifier(MOD_ID + ":twenty_twenty_one_music");
    public static SoundEvent MUSIC_DISC_2021_SOUND = new SoundEvent(MUSIC_DISC_2021);

    //registers the sound event
    public static void registerSounds() {
        Registry.register(Registry.SOUND_EVENT, MUSIC_DISC_2021, MUSIC_DISC_2021_SOUND);
    }

}
