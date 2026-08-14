package net.flamesparks4143.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.flamesparks4143.block.ModBlocks;
import net.flamesparks4143.victorian_madess.FlamesVictorianMadness;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup VICTORIAN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FlamesVictorianMadness.MOD_ID, "victorian"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.victorian"))
                    .icon(() -> new ItemStack(ModItems.STEEL_INGOT)).entries((displayContext, entries) -> {

                        entries.add(ModItems.HUNTERS_HAT);
                        entries.add(ModItems.NEWSPAPER_BOY_HAT);
                        entries.add(ModItems.TOP_HAT);
                        entries.add(ModItems.CHISEL);
                        entries.add(ModItems.RAW_PORCELAIN);
                        entries.add(ModItems.PORCELAIN_BRICK);
                        entries.add(ModBlocks.PORCELAIN_BLOCK);
                        entries.add(ModBlocks.PORCELAIN_BRICKS);

                        entries.add(ModBlocks.CRACKED_PORCELAIN_BRICKS);
                        entries.add(ModBlocks.CHISELED_PORCELAIN);

                        entries.add(ModItems.BLACK_CHAIN_LINK_PAPER);
                        entries.add(ModItems.BLACK_CHECKERED_PAPER);
                        entries.add(ModItems.BLACK_CIRCULAR_PAPER);
                        entries.add(ModItems.BLACK_CROSSED_PAPER);
                        entries.add(ModItems.BLACK_DIAMOND_PAPER);
                        entries.add(ModItems.BLACK_GRASS_PAPER);
                        entries.add(ModItems.BLACK_INTERLINKED_PAPER);
                        entries.add(ModItems.BLACK_LAYERED_PAPER);
                        entries.add(ModItems.BLACK_LILY_FLOWER_PAPER);
                        entries.add(ModItems.BLACK_OCULAR_PAPER);
                        entries.add(ModItems.BLACK_OVAL_PAPER);
                        entries.add(ModItems.BLACK_PYRIFORM_PAPER);
                        entries.add(ModItems.BLACK_SCALES_PAPER);
                        entries.add(ModItems.BLACK_TWISTED_PAPER);
                        entries.add(ModItems.BLACK_TWO_STARRED_PAPER);
                        entries.add(ModItems.BLACK_ZIPPER_PAPER);

                        entries.add(ModBlocks.BLANK_WALL);

                        entries.add(ModBlocks.BLACK_CHAIN_LINKS_WALLPAPER);
                        entries.add(ModBlocks.BLACK_CHECKERED_WALLPAPER);
                        entries.add(ModBlocks.BLACK_CIRCULAR_WALLPAPER);
                        entries.add(ModBlocks.BLACK_CROSSED_WALLPAPER);
                        entries.add(ModBlocks.BLACK_DIAMOND_WALLPAPER);
                        entries.add(ModBlocks.BLACK_GRASS_WALLPAPER);
                        entries.add(ModBlocks.BLACK_INTERLINKED_WALLPAPER);
                        entries.add(ModBlocks.BLACK_LAYERED_WALLPAPER);
                        entries.add(ModBlocks.BLACK_LILY_FLOWER_WALLPAPER);
                        entries.add(ModBlocks.BLACK_OCULAR_WALLPAPER);
                        entries.add(ModBlocks.BLACK_OVAL_WALLPAPER);
                        entries.add(ModBlocks.BLACK_SCALES_WALLPAPER);
                        entries.add(ModBlocks.BLACK_PYRIFORM_WALLPAPER);
                        entries.add(ModBlocks.BLACK_TWISTED_WALLPAPER);
                        entries.add(ModBlocks.BLACK_TWO_STARRED_WALLPAPER);
                        entries.add(ModBlocks.BLACK_ZIPPER_WALLPAPER);


                        entries.add(ModBlocks.STONE_PILLAR);
                        entries.add(ModBlocks.DEEPSLATE_PILLAR);
                        entries.add(ModBlocks.GRANITE_PILLAR);
                        entries.add(ModBlocks.DIORITE_PILLAR);
                        entries.add(ModBlocks.ANDESITE_PILLAR);
                        entries.add(ModBlocks.CALCITE_PILLAR);
                        entries.add(ModBlocks.TUFF_PILLAR);
                        entries.add(ModBlocks.BLACKSTONE_PILLAR);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_PILLAR);
                        entries.add(ModBlocks.BASALT_PILLAR);
                        entries.add(ModBlocks.END_STONE_PILLAR);
                        entries.add(ModBlocks.PORCELAIN_PILLAR);

                        entries.add(ModBlocks.CHECKERED_PORCELAIN_TERRACOTTA);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_WHITE_TERRACOTTA);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_LIGHT_GRAY_TERRACOTTA);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_GRAY_TERRACOTTA);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_BLACK_TERRACOTTA);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_BROWN_TERRACOTTA);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_RED_TERRACOTTA);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_ORANGE_TERRACOTTA);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_YELLOW_TERRACOTTA);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_LIME_TERRACOTTA);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_GREEN_TERRACOTTA);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_CYAN_TERRACOTTA);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_LIGHT_BLUE_TERRACOTTA);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_BLUE_TERRACOTTA);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_PURPLE_TERRACOTTA);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_MAGENTA_TERRACOTTA);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_PINK_TERRACOTTA);
                        entries.add(ModBlocks.STARRED_PORCELAIN_TERRACOTTA);
                        entries.add(ModBlocks.STARRED_PORCELAIN_WHITE_TERRACOTTA);
                        entries.add(ModBlocks.STARRED_PORCELAIN_LIGHT_GRAY_TERRACOTTA);
                        entries.add(ModBlocks.STARRED_PORCELAIN_GRAY_TERRACOTTA);
                        entries.add(ModBlocks.STARRED_PORCELAIN_BLACK_TERRACOTTA);
                        entries.add(ModBlocks.STARRED_PORCELAIN_BROWN_TERRACOTTA);
                        entries.add(ModBlocks.STARRED_PORCELAIN_RED_TERRACOTTA);
                        entries.add(ModBlocks.STARRED_PORCELAIN_ORANGE_TERRACOTTA);
                        entries.add(ModBlocks.STARRED_PORCELAIN_YELLOW_TERRACOTTA);
                        entries.add(ModBlocks.STARRED_PORCELAIN_LIME_TERRACOTTA);
                        entries.add(ModBlocks.STARRED_PORCELAIN_GREEN_TERRACOTTA);
                        entries.add(ModBlocks.STARRED_PORCELAIN_CYAN_TERRACOTTA);
                        entries.add(ModBlocks.STARRED_PORCELAIN_LIGHT_BLUE_TERRACOTTA);
                        entries.add(ModBlocks.STARRED_PORCELAIN_BLUE_TERRACOTTA);
                        entries.add(ModBlocks.STARRED_PORCELAIN_PURPLE_TERRACOTTA);
                        entries.add(ModBlocks.STARRED_PORCELAIN_MAGENTA_TERRACOTTA);
                        entries.add(ModBlocks.STARRED_PORCELAIN_PINK_TERRACOTTA);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_WHITE_CONCRETE);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_LIGHT_GRAY_CONCRETE);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_GRAY_CONCRETE);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_BLACK_CONCRETE);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_BROWN_CONCRETE);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_RED_CONCRETE);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_ORANGE_CONCRETE);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_YELLOW_CONCRETE);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_LIME_CONCRETE);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_GREEN_CONCRETE);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_CYAN_CONCRETE);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_LIGHT_BLUE_CONCRETE);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_BLUE_CONCRETE);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_PURPLE_CONCRETE);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_MAGENTA_CONCRETE);
                        entries.add(ModBlocks.CHECKERED_PORCELAIN_PINK_CONCRETE);
                        entries.add(ModBlocks.STARRED_PORCELAIN_WHITE_CONCRETE);
                        entries.add(ModBlocks.STARRED_PORCELAIN_LIGHT_GRAY_CONCRETE);
                        entries.add(ModBlocks.STARRED_PORCELAIN_GRAY_CONCRETE);
                        entries.add(ModBlocks.STARRED_PORCELAIN_BLACK_CONCRETE);
                        entries.add(ModBlocks.STARRED_PORCELAIN_BROWN_CONCRETE);
                        entries.add(ModBlocks.STARRED_PORCELAIN_RED_CONCRETE);
                        entries.add(ModBlocks.STARRED_PORCELAIN_ORANGE_CONCRETE);
                        entries.add(ModBlocks.STARRED_PORCELAIN_YELLOW_CONCRETE);
                        entries.add(ModBlocks.STARRED_PORCELAIN_LIME_CONCRETE);
                        entries.add(ModBlocks.STARRED_PORCELAIN_GREEN_CONCRETE);
                        entries.add(ModBlocks.STARRED_PORCELAIN_CYAN_CONCRETE);
                        entries.add(ModBlocks.STARRED_PORCELAIN_LIGHT_BLUE_CONCRETE);
                        entries.add(ModBlocks.STARRED_PORCELAIN_BLUE_CONCRETE);
                        entries.add(ModBlocks.STARRED_PORCELAIN_PURPLE_CONCRETE);
                        entries.add(ModBlocks.STARRED_PORCELAIN_MAGENTA_CONCRETE);
                        entries.add(ModBlocks.STARRED_PORCELAIN_PINK_CONCRETE);

                        entries.add(ModItems.VICTORIAN_BANNER_PATTERN);
                        entries.add(ModBlocks.OAK_CIRCLE_WAINSCOTTING);
                        entries.add(ModBlocks.OAK_CORNERS_WAINSCOTTING);
                        entries.add(ModBlocks.OAK_LINES_WAINSCOTTING);
                        entries.add(ModBlocks.OAK_SQUARE_WAINSCOTTING);
                        entries.add(ModBlocks.SPRUCE_CIRCLE_WAINSCOTTING);
                        entries.add(ModBlocks.SPRUCE_CORNERS_WAINSCOTTING);
                        entries.add(ModBlocks.SPRUCE_LINES_WAINSCOTTING);
                        entries.add(ModBlocks.SPRUCE_SQUARE_WAINSCOTTING);
                        entries.add(ModBlocks.BIRCH_CIRCLE_WAINSCOTTING);
                        entries.add(ModBlocks.BIRCH_CORNERS_WAINSCOTTING);
                        entries.add(ModBlocks.BIRCH_LINES_WAINSCOTTING);
                        entries.add(ModBlocks.BIRCH_SQUARE_WAINSCOTTING);
                        entries.add(ModBlocks.JUNGLE_CIRCLE_WAINSCOTTING);
                        entries.add(ModBlocks.JUNGLE_CORNERS_WAINSCOTTING);
                        entries.add(ModBlocks.JUNGLE_LINES_WAINSCOTTING);
                        entries.add(ModBlocks.JUNGLE_SQUARE_WAINSCOTTING);
                        entries.add(ModBlocks.ACACIA_CIRCLE_WAINSCOTTING);
                        entries.add(ModBlocks.ACACIA_CORNERS_WAINSCOTTING);
                        entries.add(ModBlocks.ACACIA_LINES_WAINSCOTTING);
                        entries.add(ModBlocks.ACACIA_SQUARE_WAINSCOTTING);
                        entries.add(ModBlocks.DARK_OAK_CIRCLE_WAINSCOTTING);
                        entries.add(ModBlocks.DARK_OAK_CORNERS_WAINSCOTTING);
                        entries.add(ModBlocks.DARK_OAK_LINES_WAINSCOTTING);
                        entries.add(ModBlocks.DARK_OAK_SQUARE_WAINSCOTTING);
                        entries.add(ModBlocks.MANGROVE_CIRCLE_WAINSCOTTING);
                        entries.add(ModBlocks.MANGROVE_CORNERS_WAINSCOTTING);
                        entries.add(ModBlocks.MANGROVE_LINES_WAINSCOTTING);
                        entries.add(ModBlocks.MANGROVE_SQUARE_WAINSCOTTING);
                        entries.add(ModBlocks.CHERRY_CIRCLE_WAINSCOTTING);
                        entries.add(ModBlocks.CHERRY_CORNERS_WAINSCOTTING);
                        entries.add(ModBlocks.CHERRY_LINES_WAINSCOTTING);
                        entries.add(ModBlocks.CHERRY_SQUARE_WAINSCOTTING);
                        entries.add(ModBlocks.BAMBOO_CIRCLE_WAINSCOTTING);
                        entries.add(ModBlocks.BAMBOO_CORNERS_WAINSCOTTING);
                        entries.add(ModBlocks.BAMBOO_LINES_WAINSCOTTING);
                        entries.add(ModBlocks.BAMBOO_SQUARE_WAINSCOTTING);
                        entries.add(ModBlocks.CRIMSON_CIRCLE_WAINSCOTTING);
                        entries.add(ModBlocks.CRIMSON_CORNERS_WAINSCOTTING);
                        entries.add(ModBlocks.CRIMSON_LINES_WAINSCOTTING);
                        entries.add(ModBlocks.CRIMSON_SQUARE_WAINSCOTTING);
                        entries.add(ModBlocks.WARPED_CIRCLE_WAINSCOTTING);
                        entries.add(ModBlocks.WARPED_CORNERS_WAINSCOTTING);
                        entries.add(ModBlocks.WARPED_LINES_WAINSCOTTING);
                        entries.add(ModBlocks.WARPED_SQUARE_WAINSCOTTING);

                        entries.add(ModBlocks.STEEL_BLOCK);

                        entries.add(ModBlocks.STEEL_STAIRS);
                        entries.add(ModBlocks.STEEL_SLAB);
                        entries.add(ModBlocks.STEEL_DOOR);
                        entries.add(ModBlocks.STEEL_TRAPDOOR);
                        entries.add(ModBlocks.STEEL_PRESSURE_PLATE);


                        entries.add(ModItems.STEEL_NUGGET);
                        entries.add(ModItems.STEEL_INGOT);

                        entries.add(ModBlocks.GOLD_DOOR);
                        entries.add(ModBlocks.GOLD_TRAPDOOR);


                    }).build());

    public static void registerItemGroups() {
        FlamesVictorianMadness.LOGGER.info("Registering Item Groups for " +FlamesVictorianMadness.MOD_ID);
    }
}
