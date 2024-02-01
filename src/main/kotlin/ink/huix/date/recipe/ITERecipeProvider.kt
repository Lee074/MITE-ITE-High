package ink.huix.date.recipe

import ink.huix.block.ITEBlock
import ink.huix.block.ITEBlock.Companion.VIBRANIUM_ANVIL
import ink.huix.block.ITEBlock.Companion.VIBRANIUM_CRAFTINGTABLE
import ink.huix.item.ITEItem.Companion.VIBRANIUM_BOOTS
import ink.huix.item.ITEItem.Companion.VIBRANIUM_CHESTPLATE
import ink.huix.item.ITEItem.Companion.VIBRANIUM_HELMET
import ink.huix.item.ITEItem.Companion.VIBRANIUM_INGOT
import ink.huix.item.ITEItem.Companion.VIBRANIUM_LEGGINGS
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.block.Blocks
import net.minecraft.data.server.recipe.RecipeJsonProvider
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder
import net.minecraft.item.Items
import net.minecraft.tag.ItemTags
import java.util.function.Consumer

class ITERecipeProvider(dataGenerator: FabricDataGenerator) : FabricRecipeProvider(dataGenerator) {
    override fun generateRecipes(exporter: Consumer<RecipeJsonProvider>) {
        ShapedRecipeJsonBuilder.create(VIBRANIUM_INGOT)
            .input('X', Items.MITHRIL_NUGGET)
            .input('Y', Items.DIAMOND)
            .input('Z', Items.ADAMANTIUM_INGOT)
            .pattern("XZX")
            .pattern("ZYZ")
            .pattern("XZX")
            .setCraftTier(7)
            .criterion("has_ingot", conditionsFromItem(Items.ADAMANTIUM_INGOT))
            .offerTo(exporter)



        ShapelessRecipeJsonBuilder.create(VIBRANIUM_CRAFTINGTABLE)
            .input(ItemTags.PLANKS)
            .input(Items.STICK)
            .input(Items.LEATHER)
            .input(VIBRANIUM_INGOT)
            .setCraftTier(7)
            .criterion("has_ingot", conditionsFromItem(VIBRANIUM_INGOT))
            .criterion("has_leather", conditionsFromItem(Items.LEATHER))
            .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
            .criterion("has_stick", conditionsFromItem(Items.STICK))
            .offerTo(exporter)
        ShapedRecipeJsonBuilder.create(VIBRANIUM_ANVIL)
            .input('A', VIBRANIUM_INGOT)
            .input('X', ITEBlock.VIBRANIUM_BLOCK)
            .input('Y', Blocks.ANCIENT_METAL_ANVIL)
            .input('Z', Items.ADAMANTIUM_INGOT)
            .pattern("ZXZ")
            .pattern(" A ")
            .pattern("AYA")
            .setCraftTier(8)
            .criterion("has_ingot", conditionsFromItem(Items.ADAMANTIUM_INGOT))
            .offerTo(exporter)



        ShapedRecipeJsonBuilder.create(VIBRANIUM_HELMET)
            .input('X', VIBRANIUM_INGOT)
            .pattern("XXX")
            .pattern("X X")
            .setCraftTier(8)
            .criterion("has_ingot", conditionsFromItem(VIBRANIUM_INGOT))
            .offerTo(exporter)
        ShapedRecipeJsonBuilder.create(VIBRANIUM_CHESTPLATE)
            .input('X', VIBRANIUM_INGOT)
            .pattern("X X")
            .pattern("XXX")
            .pattern("XXX")
            .setCraftTier(8)
            .criterion("has_ingot", conditionsFromItem(VIBRANIUM_INGOT))
            .offerTo(exporter)
        ShapedRecipeJsonBuilder.create(VIBRANIUM_LEGGINGS)
            .input('X', VIBRANIUM_INGOT)
            .pattern("XXX")
            .pattern("X X")
            .pattern("X X")
            .setCraftTier(8)
            .criterion("has_ingot", conditionsFromItem(VIBRANIUM_INGOT))
            .offerTo(exporter)
        ShapedRecipeJsonBuilder.create(VIBRANIUM_BOOTS)
            .input('X', VIBRANIUM_INGOT)
            .pattern("X X")
            .pattern("X X")
            .setCraftTier(8)
            .criterion("has_ingot", conditionsFromItem(VIBRANIUM_INGOT))
            .offerTo(exporter)
    }
}