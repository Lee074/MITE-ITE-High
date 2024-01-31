package ink.huix;

import ink.huix.block.ITEBlock
import ink.huix.item.ITEItem
import ink.huix.item.group.ITEItemGroup
import net.fabricmc.api.ModInitializer


class IsTooEasyKt : ModInitializer {

    override fun onInitialize() {
        ITEItem
        ITEItemGroup
        ITEBlock.init()
    }
}
