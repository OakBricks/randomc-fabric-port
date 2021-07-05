package curseforge.airplane39.randomc.init;

import curseforge.airplane39.randomc.RandoMC;
import curseforge.airplane39.randomc.item.TwentyTwentyOneDiscItem;
import curseforge.airplane39.randomc.sound.RandoMCSoundEvents;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static curseforge.airplane39.randomc.RandoMC.MOD_ID;

public class ModItems {

    public static final Item TWENTY_TWENTY_ONE_DISC_ITEM = new TwentyTwentyOneDiscItem(4, RandoMCSoundEvents.MUSIC_DISC_2021_SOUND, new Item.Settings().group(RandoMC.ITEM_GROUP));

    //register items
    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "twenty_twenty_one_music_disc"), TWENTY_TWENTY_ONE_DISC_ITEM);

    }

}
