package net.flamesparks4143.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.flamesparks4143.block.custom.black_wallpapers.*;
import net.flamesparks4143.victorian_madess.FlamesVictorianMadness;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block PORCELAIN_BLOCK = registerBlock("porcelain_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block PORCELAIN_BRICKS = registerBlock("porcelain_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CRACKED_PORCELAIN_BRICKS = registerBlock("cracked_porcelain_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHISELED_PORCELAIN = registerBlock("chiseled_porcelain",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));

    public static final Block BLANK_WALL = registerBlock("blank_wall",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_CHAIN_LINKS_WALLPAPER = registerBlock("black_chain_links_wallpaper",
            new BlackChainLinksWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_CHECKERED_WALLPAPER = registerBlock("black_checkered_wallpaper",
            new BlackCheckeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_CIRCULAR_WALLPAPER = registerBlock("black_circular_wallpaper",
            new BlackCircularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_CROSSED_WALLPAPER = registerBlock("black_crossed_wallpaper",
            new BlackCrossedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_DIAMOND_WALLPAPER = registerBlock("black_diamond_wallpaper",
            new BlackDiamondWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_GRASS_WALLPAPER = registerBlock("black_grass_wallpaper",
            new BlackGrassWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_INTERLINKED_WALLPAPER = registerBlock("black_interlinked_wallpaper",
            new BlackInterlinkedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_LAYERED_WALLPAPER = registerBlock("black_layered_wallpaper",
            new BlackLayeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_LILY_FLOWER_WALLPAPER = registerBlock("black_lily_flower_wallpaper",
            new BlackLilyFlowerWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_OCULAR_WALLPAPER = registerBlock("black_ocular_wallpaper",
            new BlackOcularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_OVAL_WALLPAPER = registerBlock("black_oval_wallpaper",
            new BlackOvalWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_PYRIFORM_WALLPAPER = registerBlock("black_pyriform_wallpaper",
            new BlackPyriformWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_SCALES_WALLPAPER = registerBlock("black_scales_wallpaper",
            new BlackScalesWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_TWISTED_WALLPAPER = registerBlock("black_twisted_wallpaper",
            new BlackTwistedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_TWO_STARRED_WALLPAPER = registerBlock("black_two_starred_wallpaper",
            new BlackTwoStarredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_ZIPPER_WALLPAPER = registerBlock("black_zipper_wallpaper",
            new BlackZipperWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));

    public static final Block ANDESITE_PILLAR = registerBlock("andesite_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block GRANITE_PILLAR = registerBlock("granite_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block DIORITE_PILLAR = registerBlock("diorite_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block DEEPSLATE_PILLAR = registerBlock("deepslate_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block BASALT_PILLAR = registerBlock("basalt_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block BLACKSTONE_PILLAR = registerBlock("blackstone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block GILDED_BLACKSTONE_PILLAR = registerBlock("gilded_blackstone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block END_STONE_PILLAR = registerBlock("end_stone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block TUFF_PILLAR = registerBlock("tuff_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block CALCITE_PILLAR = registerBlock("calcite_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block PORCELAIN_PILLAR = registerBlock("porcelain_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block STONE_PILLAR = registerBlock("stone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));


    public static final Block CHECKERED_PORCELAIN_TERRACOTTA = registerBlock("checkered_porcelain_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_WHITE_TERRACOTTA = registerBlock("checkered_porcelain_white_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_LIGHT_GRAY_TERRACOTTA = registerBlock("checkered_porcelain_light_gray_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_GRAY_TERRACOTTA = registerBlock("checkered_porcelain_gray_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_BLACK_TERRACOTTA = registerBlock("checkered_porcelain_black_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_BROWN_TERRACOTTA = registerBlock("checkered_porcelain_brown_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_RED_TERRACOTTA = registerBlock("checkered_porcelain_red_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_ORANGE_TERRACOTTA = registerBlock("checkered_porcelain_orange_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_YELLOW_TERRACOTTA = registerBlock("checkered_porcelain_yellow_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_LIME_TERRACOTTA = registerBlock("checkered_porcelain_lime_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_GREEN_TERRACOTTA = registerBlock("checkered_porcelain_green_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_CYAN_TERRACOTTA = registerBlock("checkered_porcelain_cyan_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_LIGHT_BLUE_TERRACOTTA = registerBlock("checkered_porcelain_light_blue_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_BLUE_TERRACOTTA = registerBlock("checkered_porcelain_blue_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_PURPLE_TERRACOTTA = registerBlock("checkered_porcelain_purple_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_MAGENTA_TERRACOTTA = registerBlock("checkered_porcelain_magenta_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_PINK_TERRACOTTA = registerBlock("checkered_porcelain_pink_terracotta",

            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_TERRACOTTA = registerBlock("starred_porcelain_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_WHITE_TERRACOTTA = registerBlock("starred_porcelain_white_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_LIGHT_GRAY_TERRACOTTA = registerBlock("starred_porcelain_light_gray_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_GRAY_TERRACOTTA = registerBlock("starred_porcelain_gray_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_BLACK_TERRACOTTA = registerBlock("starred_porcelain_black_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_BROWN_TERRACOTTA = registerBlock("starred_porcelain_brown_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_RED_TERRACOTTA = registerBlock("starred_porcelain_red_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_ORANGE_TERRACOTTA = registerBlock("starred_porcelain_orange_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_YELLOW_TERRACOTTA = registerBlock("starred_porcelain_yellow_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_LIME_TERRACOTTA = registerBlock("starred_porcelain_lime_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_GREEN_TERRACOTTA = registerBlock("starred_porcelain_green_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_CYAN_TERRACOTTA = registerBlock("starred_porcelain_cyan_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_LIGHT_BLUE_TERRACOTTA = registerBlock("starred_porcelain_light_blue_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_BLUE_TERRACOTTA = registerBlock("starred_porcelain_blue_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_PURPLE_TERRACOTTA = registerBlock("starred_porcelain_purple_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_MAGENTA_TERRACOTTA = registerBlock("starred_porcelain_magenta_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_PINK_TERRACOTTA = registerBlock("starred_porcelain_pink_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));

    public static final Block CHECKERED_PORCELAIN_WHITE_CONCRETE = registerBlock("checkered_porcelain_white_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_LIGHT_GRAY_CONCRETE = registerBlock("checkered_porcelain_light_gray_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_GRAY_CONCRETE = registerBlock("checkered_porcelain_gray_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_BLACK_CONCRETE = registerBlock("checkered_porcelain_black_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_BROWN_CONCRETE = registerBlock("checkered_porcelain_brown_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_RED_CONCRETE = registerBlock("checkered_porcelain_red_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_ORANGE_CONCRETE = registerBlock("checkered_porcelain_orange_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_YELLOW_CONCRETE = registerBlock("checkered_porcelain_yellow_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_LIME_CONCRETE = registerBlock("checkered_porcelain_lime_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_GREEN_CONCRETE = registerBlock("checkered_porcelain_green_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_CYAN_CONCRETE = registerBlock("checkered_porcelain_cyan_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_LIGHT_BLUE_CONCRETE = registerBlock("checkered_porcelain_light_blue_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_BLUE_CONCRETE = registerBlock("checkered_porcelain_blue_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_PURPLE_CONCRETE = registerBlock("checkered_porcelain_purple_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_MAGENTA_CONCRETE = registerBlock("checkered_porcelain_magenta_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block CHECKERED_PORCELAIN_PINK_CONCRETE = registerBlock("checkered_porcelain_pink_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));

    public static final Block STARRED_PORCELAIN_WHITE_CONCRETE = registerBlock("starred_porcelain_white_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_LIGHT_GRAY_CONCRETE = registerBlock("starred_porcelain_light_gray_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_GRAY_CONCRETE = registerBlock("starred_porcelain_gray_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_BLACK_CONCRETE = registerBlock("starred_porcelain_black_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_BROWN_CONCRETE = registerBlock("starred_porcelain_brown_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_RED_CONCRETE = registerBlock("starred_porcelain_red_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_ORANGE_CONCRETE = registerBlock("starred_porcelain_orange_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_YELLOW_CONCRETE = registerBlock("starred_porcelain_yellow_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_LIME_CONCRETE = registerBlock("starred_porcelain_lime_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_GREEN_CONCRETE = registerBlock("starred_porcelain_green_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_CYAN_CONCRETE = registerBlock("starred_porcelain_cyan_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_LIGHT_BLUE_CONCRETE = registerBlock("starred_porcelain_light_blue_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_BLUE_CONCRETE = registerBlock("starred_porcelain_blue_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_PURPLE_CONCRETE = registerBlock("starred_porcelain_purple_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_MAGENTA_CONCRETE = registerBlock("starred_porcelain_magenta_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block STARRED_PORCELAIN_PINK_CONCRETE = registerBlock("starred_porcelain_pink_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block STEEL_STAIRS = registerBlock("steel_stairs",
            new StairsBlock(ModBlocks.STEEL_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE)));
    public static final Block STEEL_SLAB = registerBlock("steel_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE)));


    public static final Block STEEL_PRESSURE_PLATE = registerBlock("steel_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE), BlockSetType.IRON));

    public static final Block STEEL_DOOR = registerBlock("steel_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).sounds(BlockSoundGroup.NETHERITE), BlockSetType.IRON));
    public static final Block STEEL_TRAPDOOR = registerBlock("steel_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).sounds(BlockSoundGroup.NETHERITE), BlockSetType.IRON));


    public static final Block GOLD_DOOR = registerBlock("gold_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.METAL), BlockSetType.GOLD));
    public static final Block GOLD_TRAPDOOR = registerBlock("gold_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_TRAPDOOR).sounds(BlockSoundGroup.METAL), BlockSetType.GOLD));


    public static final Block OAK_CIRCLE_WAINSCOTTING = registerBlock("oak_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block SPRUCE_CIRCLE_WAINSCOTTING = registerBlock("spruce_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BIRCH_CIRCLE_WAINSCOTTING = registerBlock("birch_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block JUNGLE_CIRCLE_WAINSCOTTING = registerBlock("jungle_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block ACACIA_CIRCLE_WAINSCOTTING = registerBlock("acacia_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block DARK_OAK_CIRCLE_WAINSCOTTING = registerBlock("dark_oak_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block MANGROVE_CIRCLE_WAINSCOTTING = registerBlock("mangrove_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CHERRY_CIRCLE_WAINSCOTTING = registerBlock("cherry_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BAMBOO_CIRCLE_WAINSCOTTING = registerBlock("bamboo_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CRIMSON_CIRCLE_WAINSCOTTING = registerBlock("crimson_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block WARPED_CIRCLE_WAINSCOTTING = registerBlock("warped_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block OAK_CORNERS_WAINSCOTTING = registerBlock("oak_corners_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block SPRUCE_CORNERS_WAINSCOTTING = registerBlock("spruce_corners_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block OAK_LINES_WAINSCOTTING = registerBlock("oak_lines_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block SPRUCE_LINES_WAINSCOTTING = registerBlock("spruce_lines_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block OAK_SQUARE_WAINSCOTTING = registerBlock("oak_square_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block SPRUCE_SQUARE_WAINSCOTTING = registerBlock("spruce_square_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BIRCH_CORNERS_WAINSCOTTING = registerBlock("birch_corners_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BIRCH_LINES_WAINSCOTTING = registerBlock("birch_lines_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BIRCH_SQUARE_WAINSCOTTING = registerBlock("birch_square_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block JUNGLE_CORNERS_WAINSCOTTING = registerBlock("jungle_corners_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block JUNGLE_LINES_WAINSCOTTING = registerBlock("jungle_lines_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block JUNGLE_SQUARE_WAINSCOTTING = registerBlock("jungle_square_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block ACACIA_CORNERS_WAINSCOTTING = registerBlock("acacia_corners_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block ACACIA_LINES_WAINSCOTTING = registerBlock("acacia_lines_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block ACACIA_SQUARE_WAINSCOTTING = registerBlock("acacia_square_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block DARK_OAK_CORNERS_WAINSCOTTING = registerBlock("dark_oak_corners_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block DARK_OAK_LINES_WAINSCOTTING = registerBlock("dark_oak_lines_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block DARK_OAK_SQUARE_WAINSCOTTING = registerBlock("dark_oak_square_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block MANGROVE_CORNERS_WAINSCOTTING = registerBlock("mangrove_corners_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block MANGROVE_LINES_WAINSCOTTING = registerBlock("mangrove_lines_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block MANGROVE_SQUARE_WAINSCOTTING = registerBlock("mangrove_square_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CHERRY_CORNERS_WAINSCOTTING = registerBlock("cherry_corners_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CHERRY_LINES_WAINSCOTTING = registerBlock("cherry_lines_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CHERRY_SQUARE_WAINSCOTTING = registerBlock("cherry_square_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BAMBOO_CORNERS_WAINSCOTTING = registerBlock("bamboo_corners_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BAMBOO_LINES_WAINSCOTTING = registerBlock("bamboo_lines_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BAMBOO_SQUARE_WAINSCOTTING = registerBlock("bamboo_square_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CRIMSON_CORNERS_WAINSCOTTING = registerBlock("crimson_corners_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CRIMSON_LINES_WAINSCOTTING = registerBlock("crimson_lines_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CRIMSON_SQUARE_WAINSCOTTING = registerBlock("crimson_square_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block WARPED_CORNERS_WAINSCOTTING = registerBlock("warped_corners_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block WARPED_LINES_WAINSCOTTING = registerBlock("warped_lines_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block WARPED_SQUARE_WAINSCOTTING = registerBlock("warped_square_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FlamesVictorianMadness.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FlamesVictorianMadness.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        FlamesVictorianMadness.LOGGER.info("Registering ModBlocks for " + FlamesVictorianMadness.MOD_ID);
    }

}
