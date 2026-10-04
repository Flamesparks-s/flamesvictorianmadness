package net.flamesparks4143.block.custom.wallpapers_blocks.magenta_wallpapers;

import net.flamesparks4143.block.ModBlocks;
import net.flamesparks4143.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class MagentaInterlinkedWallpaperBlock extends Block {
    public MagentaInterlinkedWallpaperBlock(Settings settings) {
        super(settings);
    }

    public static void dropMagentaInterlinkedPaper(World world, BlockPos pos) {
        dropStack(world, pos, new ItemStack(ModItems.MAGENTA_INTERLINKED_PAPER, 1));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(Items.SHEARS)) {
            if (!world.isClient) {
                world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_BOOK_PAGE_TURN, SoundCategory.BLOCKS, 1.0f, 1.0f);
                world.setBlockState(pos, (BlockState) ModBlocks.BLANK_WALL.getDefaultState());
                dropMagentaInterlinkedPaper(world, pos);

                itemStack.damage(1, player, (playerx) -> playerx.sendToolBreakStatus(hand));
                world.emitGameEvent(player, GameEvent.SHEAR, pos);
                player.incrementStat(Stats.USED.getOrCreateStat(Items.SHEARS));
            }

            return ActionResult.success(world.isClient);
        } else {
            return super.onUse(state, world, pos, player, hand, hit);
        }
    }
}
