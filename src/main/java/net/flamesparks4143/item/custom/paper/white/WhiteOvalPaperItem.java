package net.flamesparks4143.item.custom.paper.white;

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

public class WhiteOvalPaperItem extends Item {
    private static final Map<Block, Block> WHITE_O_MAP =
            Map.of(
                    ModBlocks.BLANK_WALL, ModBlocks.WHITE_OVAL_WALLPAPER
            );

    public WhiteOvalPaperItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(WHITE_O_MAP.containsKey(clickedBlock)) {
            if(!world.isClient()) {
                ItemStack itemStack = context.getStack();
                world.setBlockState(context.getBlockPos(), WHITE_O_MAP.get(clickedBlock).getDefaultState());
                itemStack.decrement(1);

                world.playSound(null, context.getBlockPos(), SoundEvents.ITEM_BOOK_PAGE_TURN, SoundCategory.BLOCKS);

            }
        }

        return ActionResult.SUCCESS;
    }
}
