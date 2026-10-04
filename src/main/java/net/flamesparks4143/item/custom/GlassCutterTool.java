package net.flamesparks4143.item.custom;

import net.flamesparks4143.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;

public class GlassCutterTool extends Item {
    private static final Map<Block, Block> GLASS_MAP = new HashMap<>();
            static {

                        GLASS_MAP.put(ModBlocks.WHITE_CATHEDRAL_STAINED_GLASS, ModBlocks.WHITE_DIAMOND_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.WHITE_DIAMOND_STAINED_GLASS, ModBlocks.WHITE_EMERALD_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.WHITE_EMERALD_STAINED_GLASS, ModBlocks.WHITE_SQUARE_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.WHITE_SQUARE_STAINED_GLASS, ModBlocks.WHITE_CATHEDRAL_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.LIGHT_GRAY_CATHEDRAL_STAINED_GLASS, ModBlocks.LIGHT_GRAY_DIAMOND_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.LIGHT_GRAY_DIAMOND_STAINED_GLASS, ModBlocks.LIGHT_GRAY_EMERALD_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.LIGHT_GRAY_EMERALD_STAINED_GLASS, ModBlocks.LIGHT_GRAY_SQUARE_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.LIGHT_GRAY_SQUARE_STAINED_GLASS, ModBlocks.LIGHT_GRAY_CATHEDRAL_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.GRAY_CATHEDRAL_STAINED_GLASS, ModBlocks.GRAY_DIAMOND_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.GRAY_DIAMOND_STAINED_GLASS, ModBlocks.GRAY_EMERALD_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.GRAY_EMERALD_STAINED_GLASS, ModBlocks.GRAY_SQUARE_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.GRAY_SQUARE_STAINED_GLASS, ModBlocks.GRAY_CATHEDRAL_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.BLACK_CATHEDRAL_STAINED_GLASS, ModBlocks.BLACK_DIAMOND_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.BLACK_DIAMOND_STAINED_GLASS, ModBlocks.BLACK_EMERALD_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.BLACK_EMERALD_STAINED_GLASS, ModBlocks.BLACK_SQUARE_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.BLACK_SQUARE_STAINED_GLASS, ModBlocks.BLACK_CATHEDRAL_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.BROWN_CATHEDRAL_STAINED_GLASS, ModBlocks.BROWN_DIAMOND_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.BROWN_DIAMOND_STAINED_GLASS, ModBlocks.BROWN_EMERALD_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.BROWN_EMERALD_STAINED_GLASS, ModBlocks.BROWN_SQUARE_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.BROWN_SQUARE_STAINED_GLASS, ModBlocks.BROWN_CATHEDRAL_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.RED_CATHEDRAL_STAINED_GLASS, ModBlocks.RED_DIAMOND_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.RED_DIAMOND_STAINED_GLASS, ModBlocks.RED_EMERALD_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.RED_EMERALD_STAINED_GLASS, ModBlocks.RED_SQUARE_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.RED_SQUARE_STAINED_GLASS, ModBlocks.RED_CATHEDRAL_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.ORANGE_CATHEDRAL_STAINED_GLASS, ModBlocks.ORANGE_DIAMOND_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.ORANGE_DIAMOND_STAINED_GLASS, ModBlocks.ORANGE_EMERALD_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.ORANGE_EMERALD_STAINED_GLASS, ModBlocks.ORANGE_SQUARE_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.ORANGE_SQUARE_STAINED_GLASS, ModBlocks.ORANGE_CATHEDRAL_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.YELLOW_CATHEDRAL_STAINED_GLASS, ModBlocks.YELLOW_DIAMOND_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.YELLOW_DIAMOND_STAINED_GLASS, ModBlocks.YELLOW_EMERALD_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.YELLOW_EMERALD_STAINED_GLASS, ModBlocks.YELLOW_SQUARE_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.YELLOW_SQUARE_STAINED_GLASS, ModBlocks.YELLOW_CATHEDRAL_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.LIME_CATHEDRAL_STAINED_GLASS, ModBlocks.LIME_DIAMOND_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.LIME_DIAMOND_STAINED_GLASS, ModBlocks.LIME_EMERALD_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.LIME_EMERALD_STAINED_GLASS, ModBlocks.LIME_SQUARE_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.LIME_SQUARE_STAINED_GLASS, ModBlocks.LIME_CATHEDRAL_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.GREEN_CATHEDRAL_STAINED_GLASS, ModBlocks.GREEN_DIAMOND_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.GREEN_DIAMOND_STAINED_GLASS, ModBlocks.GREEN_EMERALD_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.GREEN_EMERALD_STAINED_GLASS, ModBlocks.GREEN_SQUARE_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.GREEN_SQUARE_STAINED_GLASS, ModBlocks.GREEN_CATHEDRAL_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.CYAN_CATHEDRAL_STAINED_GLASS, ModBlocks.CYAN_DIAMOND_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.CYAN_DIAMOND_STAINED_GLASS, ModBlocks.CYAN_EMERALD_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.CYAN_EMERALD_STAINED_GLASS, ModBlocks.CYAN_SQUARE_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.CYAN_SQUARE_STAINED_GLASS, ModBlocks.CYAN_CATHEDRAL_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.LIGHT_BLUE_CATHEDRAL_STAINED_GLASS, ModBlocks.LIGHT_BLUE_DIAMOND_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.LIGHT_BLUE_DIAMOND_STAINED_GLASS, ModBlocks.LIGHT_BLUE_EMERALD_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.LIGHT_BLUE_EMERALD_STAINED_GLASS, ModBlocks.LIGHT_BLUE_SQUARE_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.LIGHT_BLUE_SQUARE_STAINED_GLASS, ModBlocks.LIGHT_BLUE_CATHEDRAL_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.BLUE_CATHEDRAL_STAINED_GLASS, ModBlocks.BLUE_DIAMOND_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.BLUE_DIAMOND_STAINED_GLASS, ModBlocks.BLUE_EMERALD_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.BLUE_EMERALD_STAINED_GLASS, ModBlocks.BLUE_SQUARE_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.BLUE_SQUARE_STAINED_GLASS, ModBlocks.BLUE_CATHEDRAL_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.PURPLE_CATHEDRAL_STAINED_GLASS, ModBlocks.PURPLE_DIAMOND_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.PURPLE_DIAMOND_STAINED_GLASS, ModBlocks.PURPLE_EMERALD_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.PURPLE_EMERALD_STAINED_GLASS, ModBlocks.PURPLE_SQUARE_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.PURPLE_SQUARE_STAINED_GLASS, ModBlocks.PURPLE_CATHEDRAL_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.MAGENTA_CATHEDRAL_STAINED_GLASS, ModBlocks.MAGENTA_DIAMOND_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.MAGENTA_DIAMOND_STAINED_GLASS, ModBlocks.MAGENTA_EMERALD_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.MAGENTA_EMERALD_STAINED_GLASS, ModBlocks.MAGENTA_SQUARE_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.MAGENTA_SQUARE_STAINED_GLASS, ModBlocks.MAGENTA_CATHEDRAL_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.PINK_CATHEDRAL_STAINED_GLASS, ModBlocks.PINK_DIAMOND_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.PINK_DIAMOND_STAINED_GLASS, ModBlocks.PINK_EMERALD_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.PINK_EMERALD_STAINED_GLASS, ModBlocks.PINK_SQUARE_STAINED_GLASS);
                        GLASS_MAP.put(ModBlocks.PINK_SQUARE_STAINED_GLASS, ModBlocks.PINK_CATHEDRAL_STAINED_GLASS);
            };

    public GlassCutterTool(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(GLASS_MAP.containsKey(clickedBlock)) {
            if(!world.isClient()) {
                world.setBlockState(context.getBlockPos(), GLASS_MAP.get(clickedBlock).getDefaultState());

                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.BLOCKS);
            }

        }

        return ActionResult.SUCCESS;
    }
}
