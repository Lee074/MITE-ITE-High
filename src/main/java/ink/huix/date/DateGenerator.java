package ink.huix.date;


import ink.huix.date.recipe.ITERecipeProvider;
import ink.huix.date.block.ITELootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DateGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(ITERecipeProvider::new);
        fabricDataGenerator.addProvider(ITELootTableProvider::new);
    }
}
