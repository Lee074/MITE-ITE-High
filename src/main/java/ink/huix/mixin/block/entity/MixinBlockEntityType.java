package ink.huix.mixin.block.entity;

import ink.huix.block.ITEBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(BlockEntityType.class)
public class MixinBlockEntityType {
    @ModifyArgs(at = @At(value = "INVOKE", target = "Lnet/minecraft/block/entity/BlockEntityType$Builder;create(Lnet/minecraft/block/entity/BlockEntityType$BlockEntityFactory;[Lnet/minecraft/block/Block;)Lnet/minecraft/block/entity/BlockEntityType$Builder;", ordinal = 0), method = "<clinit>")
    private static void initClint(Args args) {
        Block[] blocks = new Block[]{Blocks.COPPER_ANVIL, Blocks.CHIPPED_COPPER_ANVIL, Blocks.DAMAGED_COPPER_ANVIL, Blocks.SILVER_ANVIL, Blocks.CHIPPED_SILVER_ANVIL, Blocks.DAMAGED_SILVER_ANVIL, Blocks.GOLD_ANVIL, Blocks.CHIPPED_GOLD_ANVIL, Blocks.DAMAGED_GOLD_ANVIL, Blocks.IRON_ANVIL, Blocks.CHIPPED_IRON_ANVIL, Blocks.DAMAGED_IRON_ANVIL, Blocks.ANCIENT_METAL_ANVIL, Blocks.CHIPPED_ANCIENT_METAL_ANVIL, Blocks.DAMAGED_ANCIENT_METAL_ANVIL, Blocks.MITHRIL_ANVIL, Blocks.CHIPPED_MITHRIL_ANVIL, Blocks.DAMAGED_MITHRIL_ANVIL, Blocks.TUNGSTEN_ANVIL, Blocks.CHIPPED_TUNGSTEN_ANVIL, Blocks.DAMAGED_TUNGSTEN_ANVIL, Blocks.ADAMANTIUM_ANVIL, Blocks.CHIPPED_ADAMANTIUM_ANVIL, Blocks.DAMAGED_ADAMANTIUM_ANVIL
                , ITEBlock.Companion.getVIBRANIUM_ANVIL(), ITEBlock.Companion.getCHIPPED_VIBRANIUM_ANVIL(), ITEBlock.Companion.getDAMAGED_VIBRANIUM_ANVIL()};
        args.set(1, blocks);
    }
}
