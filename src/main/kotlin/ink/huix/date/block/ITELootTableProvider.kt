package ink.huix.date.block

import ink.huix.block.ITEBlock
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider
import net.minecraft.loot.LootTable
import net.minecraft.loot.context.LootContextType
import net.minecraft.util.Identifier
import java.util.function.BiConsumer

class ITELootTableProvider(dataGenerator: FabricDataGenerator) : FabricBlockLootTableProvider(dataGenerator) {

    override fun generateBlockLootTables() {
        this.addDrop(ITEBlock.VIBRANIUM_BLOCK)
        this.addDrop(ITEBlock.VIBRANIUM_CRAFTINGTABLE)
        this.addDrop(ITEBlock.VIBRANIUM_FURNACE)
        this.addDrop(ITEBlock.VIBRANIUM_ANVIL)
        this.addDrop(ITEBlock.CHIPPED_VIBRANIUM_ANVIL)
        this.addDrop(ITEBlock.DAMAGED_VIBRANIUM_ANVIL)
    }
}