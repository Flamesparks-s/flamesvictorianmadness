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

public class ChiselTool extends Item {
    private static final Map<Block, Block> CHISEL_MAP = new HashMap<>();
            static {
                        CHISEL_MAP.put(Blocks.OAK_PLANKS, ModBlocks.OAK_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.OAK_CIRCLE_WAINSCOTTING, ModBlocks.OAK_CORNERS_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.OAK_CORNERS_WAINSCOTTING, ModBlocks.OAK_LINES_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.OAK_LINES_WAINSCOTTING, ModBlocks.OAK_SQUARE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.OAK_SQUARE_WAINSCOTTING, ModBlocks.OAK_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.SPRUCE_CIRCLE_WAINSCOTTING, ModBlocks.SPRUCE_CORNERS_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.SPRUCE_CORNERS_WAINSCOTTING, ModBlocks.SPRUCE_LINES_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.SPRUCE_LINES_WAINSCOTTING, ModBlocks.SPRUCE_SQUARE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.SPRUCE_SQUARE_WAINSCOTTING, ModBlocks.SPRUCE_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.BIRCH_CIRCLE_WAINSCOTTING, ModBlocks.BIRCH_CORNERS_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.BIRCH_CORNERS_WAINSCOTTING, ModBlocks.BIRCH_LINES_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.BIRCH_LINES_WAINSCOTTING, ModBlocks.BIRCH_SQUARE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.BIRCH_SQUARE_WAINSCOTTING, ModBlocks.BIRCH_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.MANGROVE_CIRCLE_WAINSCOTTING, ModBlocks.MANGROVE_CORNERS_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.MANGROVE_CORNERS_WAINSCOTTING, ModBlocks.MANGROVE_LINES_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.MANGROVE_LINES_WAINSCOTTING, ModBlocks.MANGROVE_SQUARE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.MANGROVE_SQUARE_WAINSCOTTING, ModBlocks.MANGROVE_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.ACACIA_CIRCLE_WAINSCOTTING, ModBlocks.ACACIA_CORNERS_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.ACACIA_CORNERS_WAINSCOTTING, ModBlocks.ACACIA_LINES_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.ACACIA_LINES_WAINSCOTTING, ModBlocks.ACACIA_SQUARE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.ACACIA_SQUARE_WAINSCOTTING, ModBlocks.ACACIA_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.BAMBOO_CIRCLE_WAINSCOTTING, ModBlocks.BAMBOO_CORNERS_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.BAMBOO_CORNERS_WAINSCOTTING, ModBlocks.BAMBOO_LINES_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.BAMBOO_LINES_WAINSCOTTING, ModBlocks.BAMBOO_SQUARE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.BAMBOO_SQUARE_WAINSCOTTING, ModBlocks.BAMBOO_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(Blocks.CHERRY_PLANKS, ModBlocks.CHERRY_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.CHERRY_CIRCLE_WAINSCOTTING, ModBlocks.CHERRY_CORNERS_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.CHERRY_CORNERS_WAINSCOTTING, ModBlocks.CHERRY_LINES_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.CHERRY_LINES_WAINSCOTTING, ModBlocks.CHERRY_SQUARE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.CHERRY_SQUARE_WAINSCOTTING, ModBlocks.CHERRY_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.CRIMSON_CIRCLE_WAINSCOTTING, ModBlocks.CRIMSON_CORNERS_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.CRIMSON_CORNERS_WAINSCOTTING, ModBlocks.CRIMSON_LINES_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.CRIMSON_LINES_WAINSCOTTING, ModBlocks.CRIMSON_SQUARE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.CRIMSON_SQUARE_WAINSCOTTING, ModBlocks.CRIMSON_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.DARK_OAK_CIRCLE_WAINSCOTTING, ModBlocks.DARK_OAK_CORNERS_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.DARK_OAK_CORNERS_WAINSCOTTING, ModBlocks.DARK_OAK_LINES_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.DARK_OAK_LINES_WAINSCOTTING, ModBlocks.DARK_OAK_SQUARE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.DARK_OAK_SQUARE_WAINSCOTTING, ModBlocks.DARK_OAK_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.JUNGLE_CIRCLE_WAINSCOTTING, ModBlocks.JUNGLE_CORNERS_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.JUNGLE_CORNERS_WAINSCOTTING, ModBlocks.JUNGLE_LINES_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.JUNGLE_LINES_WAINSCOTTING, ModBlocks.JUNGLE_SQUARE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.JUNGLE_SQUARE_WAINSCOTTING, ModBlocks.JUNGLE_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(Blocks.WARPED_PLANKS, ModBlocks.WARPED_CIRCLE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.WARPED_CIRCLE_WAINSCOTTING, ModBlocks.WARPED_CORNERS_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.WARPED_CORNERS_WAINSCOTTING, ModBlocks.WARPED_LINES_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.WARPED_LINES_WAINSCOTTING, ModBlocks.WARPED_SQUARE_WAINSCOTTING);
                        CHISEL_MAP.put(ModBlocks.WARPED_SQUARE_WAINSCOTTING, ModBlocks.WARPED_CIRCLE_WAINSCOTTING);

                        CHISEL_MAP.put(Blocks.POLISHED_ANDESITE, ModBlocks.ANDESITE_PILLAR);
                        CHISEL_MAP.put(Blocks.POLISHED_GRANITE, ModBlocks.GRANITE_PILLAR);
                        CHISEL_MAP.put(Blocks.POLISHED_DEEPSLATE, ModBlocks.DEEPSLATE_PILLAR);
                        CHISEL_MAP.put(Blocks.POLISHED_BASALT, ModBlocks.BASALT_PILLAR);
                        CHISEL_MAP.put(Blocks.POLISHED_BLACKSTONE, ModBlocks.BLACKSTONE_PILLAR);
                        CHISEL_MAP.put(Blocks.GILDED_BLACKSTONE, ModBlocks.GILDED_BLACKSTONE_PILLAR);
                        CHISEL_MAP.put(Blocks.CALCITE, ModBlocks.CALCITE_PILLAR);
                        CHISEL_MAP.put(Blocks.STONE, ModBlocks.STONE_PILLAR);
                        CHISEL_MAP.put(Blocks.END_STONE, ModBlocks.END_STONE_PILLAR);
                        CHISEL_MAP.put(ModBlocks.PORCELAIN_BLOCK, ModBlocks.PORCELAIN_PILLAR);
                        CHISEL_MAP.put(Blocks.POLISHED_DIORITE, ModBlocks.DIORITE_PILLAR);
                        CHISEL_MAP.put(Blocks.TUFF, ModBlocks.TUFF_PILLAR);
                        CHISEL_MAP.put(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_PILLAR);
                        CHISEL_MAP.put(Blocks.PURPUR_BLOCK, Blocks.PURPUR_PILLAR);

            };

    public ChiselTool(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(CHISEL_MAP.containsKey(clickedBlock)) {
            if(!world.isClient()) {
                world.setBlockState(context.getBlockPos(), CHISEL_MAP.get(clickedBlock).getDefaultState());

                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_CHERRY_WOOD_PLACE, SoundCategory.BLOCKS);
            }

        }

        return ActionResult.SUCCESS;
    }
}
