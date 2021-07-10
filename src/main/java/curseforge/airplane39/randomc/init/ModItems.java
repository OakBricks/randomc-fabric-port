package curseforge.airplane39.randomc.init;

import curseforge.airplane39.randomc.RandoMC;
import curseforge.airplane39.randomc.item.TwentyTwentyOneDiscItem;
import curseforge.airplane39.randomc.sound.RandoMCSoundEvents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static curseforge.airplane39.randomc.RandoMC.MOD_ID;

public class ModItems {

    public static final Item TWENTY_TWENTY_ONE_DISC_ITEM = new TwentyTwentyOneDiscItem(4, RandoMCSoundEvents.MUSIC_DISC_2021_SOUND, new Item.Settings().maxCount(1).group(RandoMC.ITEM_GROUP));

    public static final Item SAPPHIRE = new Item(new FabricItemSettings().group(RandoMC.ITEM_GROUP));

    public static final Item SALT = new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1).build()).group(RandoMC.ITEM_GROUP));

    public static final Item PRETZEL = new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(3).build()).group(RandoMC.ITEM_GROUP));

    public static final Item DOUGH = new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1).build()).group(RandoMC.ITEM_GROUP));

    //register items
    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "twenty_twenty_one_music_disc"), TWENTY_TWENTY_ONE_DISC_ITEM);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sapphire"), SAPPHIRE);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "salt"), SALT);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pretzel"), PRETZEL);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dough"), DOUGH);

    }

}
