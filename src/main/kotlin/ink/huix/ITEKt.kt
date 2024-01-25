package ink.huix;

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.util.registry.RegistryKey


class ITEKt : ModInitializer {

    val CUSTOM_ITEM = Registry.register(Registry.ITEM, Identifier("tutorial", "custom_item"), Item(FabricItemSettings().group(
        ItemGroup.FOOD)))

    override fun onInitialize() {

    }
}
