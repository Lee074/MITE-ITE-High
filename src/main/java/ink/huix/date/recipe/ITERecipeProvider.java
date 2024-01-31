package ink.huix.date.recipe;

import ink.huix.item.ITEItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;

import java.util.function.Consumer;

public class ITERecipeProvider extends FabricRecipeProvider {
    public ITERecipeProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(ITEItem.Companion.getVIBRANIUM_HELMET())
                .input('X', ITEItem.Companion.getVIBRANIUM_INGOT())
                .pattern("XXX")
                .pattern("X X")
                .setCraftTier(8).setTime(8)
                .criterion("has_ingot", RecipeProvider.conditionsFromItem(ITEItem.Companion.getVIBRANIUM_INGOT()))
                .offerTo(exporter);
    }
}
