package net.flamesparks4143.item.custom.other_papers.creeper_charge;

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

public class OrangeCreeperChargePaperItem extends Item {
    private static final Map<Block, Block> ORANGE_CC_MAP =
            Map.of(
                    ModBlocks.BLANK_WALL, ModBlocks.ORANGE_CREEPER_CHARGE
            );

    public OrangeCreeperChargePaperItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(ORANGE_CC_MAP.containsKey(clickedBlock)) {
            if(!world.isClient()) {
                ItemStack itemStack = context.getStack();
                world.setBlockState(context.getBlockPos(), ORANGE_CC_MAP.get(clickedBlock).getDefaultState());
                itemStack.decrement(1);

                world.playSound(null, context.getBlockPos(), SoundEvents.ITEM_BOOK_PAGE_TURN, SoundCategory.BLOCKS);

            }
        }

        return ActionResult.SUCCESS;
    }
}
