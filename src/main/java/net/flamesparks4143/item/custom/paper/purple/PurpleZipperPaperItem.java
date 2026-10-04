package net.flamesparks4143.item.custom.paper.purple;

import net.flamesparks4143.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.Map;

public class PurpleZipperPaperItem extends Item {
    private static final Map<Block, Block> PURPLE_Z_MAP =
            Map.of(
                    ModBlocks.BLANK_WALL, ModBlocks.PURPLE_ZIPPER_WALLPAPER
            );

    public PurpleZipperPaperItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(PURPLE_Z_MAP.containsKey(clickedBlock)) {
            if(!world.isClient()) {
                ItemStack itemStack = context.getStack();
                world.setBlockState(context.getBlockPos(), PURPLE_Z_MAP.get(clickedBlock).getDefaultState());
                itemStack.decrement(1);

                world.playSound(null, context.getBlockPos(), SoundEvents.ITEM_BOOK_PAGE_TURN, SoundCategory.BLOCKS);

            }
        }

        return ActionResult.SUCCESS;
    }
}
