package net.flamesparks4143.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.flamesparks4143.block.custom.ChairBlock;
import net.flamesparks4143.block.custom.StoolBlock;
import net.flamesparks4143.block.custom.TurnCarpetBlock;
import net.flamesparks4143.block.custom.wallpapers_blocks.black_wallpapers.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.blue_wallpapers.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.brown_wallpapers.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.cyan_wallpapers.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.gray_wallpapers.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.green_wallpapers.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.light_blue_wallpapers.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.light_gray_wallpapers.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.lime_wallpapers.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.magenta_wallpapers.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.orange_wallpapers.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.creeper_charge.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.flower_charge.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.globe.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.skull_charge.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.snout.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.thing.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.pink_wallpapers.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.purple_wallpapers.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.red_wallpapers.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.white_wallpapers.*;
import net.flamesparks4143.block.custom.wallpapers_blocks.yellow_wallpapers.*;
import net.flamesparks4143.victorian_madess.FlamesVictorianMadness;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block PORCELAIN_BLOCK = registerBlock("porcelain_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block PORCELAIN_BRICKS = registerBlock("porcelain_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CRACKED_PORCELAIN_BRICKS = registerBlock("cracked_porcelain_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHISELED_PORCELAIN = registerBlock("chiseled_porcelain",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block PORCELAIN_BRICKS_STAIRS = registerBlock("porcelain_brick_stairs",
            new StairsBlock(ModBlocks.PORCELAIN_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block PORCELAIN_BRICKS_SLAB = registerBlock("porcelain_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block PORCELAIN_BRICKS_WALL = registerBlock("porcelain_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block PORCELAIN_STAIRS = registerBlock("porcelain_stairs",
            new StairsBlock(ModBlocks.PORCELAIN_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block PORCELAIN_SLAB = registerBlock("porcelain_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block PORCELAIN_WALL = registerBlock("porcelain_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));

    public static final Block FLOWER_PANE = registerBlock("flower_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block FLOWER_GLASS = registerBlock("flower_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block MOON_PANE = registerBlock("moon_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block MOON_GLASS = registerBlock("moon_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block SUN_PANE = registerBlock("sun_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block SUN_GLASS = registerBlock("sun_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));

    public static final Block BLACK_CATHEDRAL_STAINED_PANE = registerBlock("black_cathedral_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block BLACK_DIAMOND_STAINED_PANE = registerBlock("black_diamond_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block BLACK_EMERALD_STAINED_PANE = registerBlock("black_emerald_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block BLACK_SQUARE_STAINED_PANE = registerBlock("black_square_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block BLUE_CATHEDRAL_STAINED_PANE = registerBlock("blue_cathedral_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block BLUE_DIAMOND_STAINED_PANE = registerBlock("blue_diamond_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block BLUE_EMERALD_STAINED_PANE = registerBlock("blue_emerald_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block BLUE_SQUARE_STAINED_PANE = registerBlock("blue_square_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block BROWN_CATHEDRAL_STAINED_PANE = registerBlock("brown_cathedral_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block BROWN_DIAMOND_STAINED_PANE = registerBlock("brown_diamond_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block BROWN_EMERALD_STAINED_PANE = registerBlock("brown_emerald_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block BROWN_SQUARE_STAINED_PANE = registerBlock("brown_square_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block LIGHT_GRAY_CATHEDRAL_STAINED_PANE = registerBlock("light_gray_cathedral_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block LIGHT_GRAY_DIAMOND_STAINED_PANE = registerBlock("light_gray_diamond_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block LIGHT_GRAY_EMERALD_STAINED_PANE = registerBlock("light_gray_emerald_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block LIGHT_GRAY_SQUARE_STAINED_PANE = registerBlock("light_gray_square_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block GRAY_CATHEDRAL_STAINED_PANE = registerBlock("gray_cathedral_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block GRAY_DIAMOND_STAINED_PANE = registerBlock("gray_diamond_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block GRAY_EMERALD_STAINED_PANE = registerBlock("gray_emerald_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block GRAY_SQUARE_STAINED_PANE = registerBlock("gray_square_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block WHITE_CATHEDRAL_STAINED_PANE = registerBlock("white_cathedral_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block WHITE_DIAMOND_STAINED_PANE = registerBlock("white_diamond_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block WHITE_EMERALD_STAINED_PANE = registerBlock("white_emerald_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block WHITE_SQUARE_STAINED_PANE = registerBlock("white_square_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block RED_CATHEDRAL_STAINED_PANE = registerBlock("red_cathedral_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block RED_DIAMOND_STAINED_PANE = registerBlock("red_diamond_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block RED_EMERALD_STAINED_PANE = registerBlock("red_emerald_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block RED_SQUARE_STAINED_PANE = registerBlock("red_square_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block YELLOW_CATHEDRAL_STAINED_PANE = registerBlock("yellow_cathedral_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block YELLOW_DIAMOND_STAINED_PANE = registerBlock("yellow_diamond_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block YELLOW_EMERALD_STAINED_PANE = registerBlock("yellow_emerald_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block YELLOW_SQUARE_STAINED_PANE = registerBlock("yellow_square_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block ORANGE_CATHEDRAL_STAINED_PANE = registerBlock("orange_cathedral_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block ORANGE_DIAMOND_STAINED_PANE = registerBlock("orange_diamond_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block ORANGE_EMERALD_STAINED_PANE = registerBlock("orange_emerald_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block ORANGE_SQUARE_STAINED_PANE = registerBlock("orange_square_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block LIME_CATHEDRAL_STAINED_PANE = registerBlock("lime_cathedral_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block LIME_DIAMOND_STAINED_PANE = registerBlock("lime_diamond_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block LIME_EMERALD_STAINED_PANE = registerBlock("lime_emerald_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block LIME_SQUARE_STAINED_PANE = registerBlock("lime_square_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block GREEN_CATHEDRAL_STAINED_PANE = registerBlock("green_cathedral_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block GREEN_DIAMOND_STAINED_PANE = registerBlock("green_diamond_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block GREEN_EMERALD_STAINED_PANE = registerBlock("green_emerald_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block GREEN_SQUARE_STAINED_PANE = registerBlock("green_square_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block CYAN_CATHEDRAL_STAINED_PANE = registerBlock("cyan_cathedral_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block CYAN_DIAMOND_STAINED_PANE = registerBlock("cyan_diamond_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block CYAN_EMERALD_STAINED_PANE = registerBlock("cyan_emerald_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block CYAN_SQUARE_STAINED_PANE = registerBlock("cyan_square_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block LIGHT_BLUE_CATHEDRAL_STAINED_PANE = registerBlock("light_blue_cathedral_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block LIGHT_BLUE_DIAMOND_STAINED_PANE = registerBlock("light_blue_diamond_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block LIGHT_BLUE_EMERALD_STAINED_PANE = registerBlock("light_blue_emerald_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block LIGHT_BLUE_SQUARE_STAINED_PANE = registerBlock("light_blue_square_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block PURPLE_CATHEDRAL_STAINED_PANE = registerBlock("purple_cathedral_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block PURPLE_DIAMOND_STAINED_PANE = registerBlock("purple_diamond_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block PURPLE_EMERALD_STAINED_PANE = registerBlock("purple_emerald_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block PURPLE_SQUARE_STAINED_PANE = registerBlock("purple_square_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block MAGENTA_CATHEDRAL_STAINED_PANE = registerBlock("magenta_cathedral_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block MAGENTA_DIAMOND_STAINED_PANE = registerBlock("magenta_diamond_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block MAGENTA_EMERALD_STAINED_PANE = registerBlock("magenta_emerald_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block MAGENTA_SQUARE_STAINED_PANE = registerBlock("magenta_square_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block PINK_CATHEDRAL_STAINED_PANE = registerBlock("pink_cathedral_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block PINK_DIAMOND_STAINED_PANE = registerBlock("pink_diamond_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block PINK_EMERALD_STAINED_PANE = registerBlock("pink_emerald_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block PINK_SQUARE_STAINED_PANE = registerBlock("pink_square_stained_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));

    public static final Block BLACK_CATHEDRAL_STAINED_GLASS = registerBlock("black_cathedral_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block BLACK_DIAMOND_STAINED_GLASS = registerBlock("black_diamond_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block BLACK_EMERALD_STAINED_GLASS = registerBlock("black_emerald_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block BLACK_SQUARE_STAINED_GLASS = registerBlock("black_square_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block WHITE_CATHEDRAL_STAINED_GLASS = registerBlock("white_cathedral_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block WHITE_DIAMOND_STAINED_GLASS = registerBlock("white_diamond_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block WHITE_EMERALD_STAINED_GLASS = registerBlock("white_emerald_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block WHITE_SQUARE_STAINED_GLASS = registerBlock("white_square_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block LIGHT_GRAY_CATHEDRAL_STAINED_GLASS = registerBlock("light_gray_cathedral_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block LIGHT_GRAY_DIAMOND_STAINED_GLASS = registerBlock("light_gray_diamond_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block LIGHT_GRAY_EMERALD_STAINED_GLASS = registerBlock("light_gray_emerald_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block LIGHT_GRAY_SQUARE_STAINED_GLASS = registerBlock("light_gray_square_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block GRAY_CATHEDRAL_STAINED_GLASS = registerBlock("gray_cathedral_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block GRAY_DIAMOND_STAINED_GLASS = registerBlock("gray_diamond_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block GRAY_EMERALD_STAINED_GLASS = registerBlock("gray_emerald_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block GRAY_SQUARE_STAINED_GLASS = registerBlock("gray_square_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block BROWN_CATHEDRAL_STAINED_GLASS = registerBlock("brown_cathedral_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block BROWN_DIAMOND_STAINED_GLASS = registerBlock("brown_diamond_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block BROWN_EMERALD_STAINED_GLASS = registerBlock("brown_emerald_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block BROWN_SQUARE_STAINED_GLASS = registerBlock("brown_square_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block RED_CATHEDRAL_STAINED_GLASS = registerBlock("red_cathedral_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block RED_DIAMOND_STAINED_GLASS = registerBlock("red_diamond_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block RED_EMERALD_STAINED_GLASS = registerBlock("red_emerald_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block RED_SQUARE_STAINED_GLASS = registerBlock("red_square_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block ORANGE_CATHEDRAL_STAINED_GLASS = registerBlock("orange_cathedral_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block ORANGE_DIAMOND_STAINED_GLASS = registerBlock("orange_diamond_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block ORANGE_EMERALD_STAINED_GLASS = registerBlock("orange_emerald_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block ORANGE_SQUARE_STAINED_GLASS = registerBlock("orange_square_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block YELLOW_CATHEDRAL_STAINED_GLASS = registerBlock("yellow_cathedral_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block YELLOW_DIAMOND_STAINED_GLASS = registerBlock("yellow_diamond_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block YELLOW_EMERALD_STAINED_GLASS = registerBlock("yellow_emerald_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block YELLOW_SQUARE_STAINED_GLASS = registerBlock("yellow_square_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block LIME_CATHEDRAL_STAINED_GLASS = registerBlock("lime_cathedral_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block LIME_DIAMOND_STAINED_GLASS = registerBlock("lime_diamond_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block LIME_EMERALD_STAINED_GLASS = registerBlock("lime_emerald_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block LIME_SQUARE_STAINED_GLASS = registerBlock("lime_square_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block GREEN_CATHEDRAL_STAINED_GLASS = registerBlock("green_cathedral_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block GREEN_DIAMOND_STAINED_GLASS = registerBlock("green_diamond_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block GREEN_EMERALD_STAINED_GLASS = registerBlock("green_emerald_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block GREEN_SQUARE_STAINED_GLASS = registerBlock("green_square_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block CYAN_CATHEDRAL_STAINED_GLASS = registerBlock("cyan_cathedral_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block CYAN_DIAMOND_STAINED_GLASS = registerBlock("cyan_diamond_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block CYAN_EMERALD_STAINED_GLASS = registerBlock("cyan_emerald_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block CYAN_SQUARE_STAINED_GLASS = registerBlock("cyan_square_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block LIGHT_BLUE_CATHEDRAL_STAINED_GLASS = registerBlock("light_blue_cathedral_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block LIGHT_BLUE_DIAMOND_STAINED_GLASS = registerBlock("light_blue_diamond_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block LIGHT_BLUE_EMERALD_STAINED_GLASS = registerBlock("light_blue_emerald_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block LIGHT_BLUE_SQUARE_STAINED_GLASS = registerBlock("light_blue_square_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block BLUE_CATHEDRAL_STAINED_GLASS = registerBlock("blue_cathedral_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block BLUE_DIAMOND_STAINED_GLASS = registerBlock("blue_diamond_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block BLUE_EMERALD_STAINED_GLASS = registerBlock("blue_emerald_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block BLUE_SQUARE_STAINED_GLASS = registerBlock("blue_square_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block PURPLE_CATHEDRAL_STAINED_GLASS = registerBlock("purple_cathedral_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block PURPLE_DIAMOND_STAINED_GLASS = registerBlock("purple_diamond_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block PURPLE_EMERALD_STAINED_GLASS = registerBlock("purple_emerald_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block PURPLE_SQUARE_STAINED_GLASS = registerBlock("purple_square_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block MAGENTA_CATHEDRAL_STAINED_GLASS = registerBlock("magenta_cathedral_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block MAGENTA_DIAMOND_STAINED_GLASS = registerBlock("magenta_diamond_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block MAGENTA_EMERALD_STAINED_GLASS = registerBlock("magenta_emerald_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block MAGENTA_SQUARE_STAINED_GLASS = registerBlock("magenta_square_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block PINK_CATHEDRAL_STAINED_GLASS = registerBlock("pink_cathedral_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block PINK_DIAMOND_STAINED_GLASS = registerBlock("pink_diamond_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block PINK_EMERALD_STAINED_GLASS = registerBlock("pink_emerald_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block PINK_SQUARE_STAINED_GLASS = registerBlock("pink_square_stained_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));

    public static final Block WHITE_PATTERN_WOOL = registerBlock("white_pattern_wool",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_PATTERN_WOOL = registerBlock("light_gray_pattern_wool",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_PATTERN_WOOL = registerBlock("gray_pattern_wool",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_PATTERN_WOOL = registerBlock("black_pattern_wool",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_PATTERN_WOOL = registerBlock("brown_pattern_wool",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_PATTERN_WOOL = registerBlock("red_pattern_wool",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_PATTERN_WOOL = registerBlock("orange_pattern_wool",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_PATTERN_WOOL = registerBlock("yellow_pattern_wool",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_PATTERN_WOOL = registerBlock("lime_pattern_wool",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_PATTERN_WOOL = registerBlock("green_pattern_wool",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_PATTERN_WOOL = registerBlock("cyan_pattern_wool",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_PATTERN_WOOL = registerBlock("light_blue_pattern_wool",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_PATTERN_WOOL = registerBlock("blue_pattern_wool",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_PATTERN_WOOL = registerBlock("purple_pattern_wool",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_PATTERN_WOOL = registerBlock("magenta_pattern_wool",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_PATTERN_WOOL = registerBlock("pink_pattern_wool",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GRAY_GLAZED_TERRACOTTA).sounds(BlockSoundGroup.WOOL)));

    public static final Block WHITE_PATTERN_CARPET = registerBlock("white_pattern_carpet",
            new TurnCarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));
    public static final Block LIGHT_GRAY_PATTERN_CARPET = registerBlock("light_gray_pattern_carpet",
            new TurnCarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));
    public static final Block GRAY_PATTERN_CARPET = registerBlock("gray_pattern_carpet",
            new TurnCarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));
    public static final Block BLACK_PATTERN_CARPET = registerBlock("black_pattern_carpet",
            new TurnCarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));
    public static final Block BROWN_PATTERN_CARPET = registerBlock("brown_pattern_carpet",
            new TurnCarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));
    public static final Block RED_PATTERN_CARPET = registerBlock("red_pattern_carpet",
            new TurnCarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));
    public static final Block ORANGE_PATTERN_CARPET = registerBlock("orange_pattern_carpet",
            new TurnCarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));
    public static final Block YELLOW_PATTERN_CARPET = registerBlock("yellow_pattern_carpet",
            new TurnCarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));
    public static final Block LIME_PATTERN_CARPET = registerBlock("lime_pattern_carpet",
            new TurnCarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));
    public static final Block GREEN_PATTERN_CARPET = registerBlock("green_pattern_carpet",
            new TurnCarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));
    public static final Block CYAN_PATTERN_CARPET = registerBlock("cyan_pattern_carpet",
            new TurnCarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));
    public static final Block LIGHT_BLUE_PATTERN_CARPET = registerBlock("light_blue_pattern_carpet",
            new TurnCarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));
    public static final Block BLUE_PATTERN_CARPET = registerBlock("blue_pattern_carpet",
            new TurnCarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));
    public static final Block PURPLE_PATTERN_CARPET = registerBlock("purple_pattern_carpet",
            new TurnCarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));
    public static final Block MAGENTA_PATTERN_CARPET = registerBlock("magenta_pattern_carpet",
            new TurnCarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));
    public static final Block PINK_PATTERN_CARPET = registerBlock("pink_pattern_carpet",
            new TurnCarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));

    public static final Block BLANK_WALL = registerBlock("blank_wall",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));

    public static final Block BLUE_CHAIN_LINKS_WALLPAPER = registerBlock("blue_chain_links_wallpaper",
            new BlueChainLinksWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_CHECKERED_WALLPAPER = registerBlock("blue_checkered_wallpaper",
            new BlueCheckeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_CIRCULAR_WALLPAPER = registerBlock("blue_circular_wallpaper",
            new BlueCircularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_CROSSED_WALLPAPER = registerBlock("blue_crossed_wallpaper",
            new BlueCrossedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_DIAMOND_WALLPAPER = registerBlock("blue_diamond_wallpaper",
            new BlueDiamondWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_GRASS_WALLPAPER = registerBlock("blue_grass_wallpaper",
            new BlueGrassWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_INTERLINKED_WALLPAPER = registerBlock("blue_interlinked_wallpaper",
            new BlueInterlinkedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_LAYERED_WALLPAPER = registerBlock("blue_layered_wallpaper",
            new BlueLayeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_LILY_FLOWER_WALLPAPER = registerBlock("blue_lily_flower_wallpaper",
            new BlueLilyFlowerWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_OCULAR_WALLPAPER = registerBlock("blue_ocular_wallpaper",
            new BlueOcularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_OVAL_WALLPAPER = registerBlock("blue_oval_wallpaper",
            new BlueOvalWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_PYRIFORM_WALLPAPER = registerBlock("blue_pyriform_wallpaper",
            new BluePyriformWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_SCALES_WALLPAPER = registerBlock("blue_scales_wallpaper",
            new BlueScalesWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_TWISTED_WALLPAPER = registerBlock("blue_twisted_wallpaper",
            new BlueTwistedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_TWO_STARRED_WALLPAPER = registerBlock("blue_two_starred_wallpaper",
            new BlueTwoStarredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_ZIPPER_WALLPAPER = registerBlock("blue_zipper_wallpaper",
            new BlueZipperWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_CHAIN_LINKS_WALLPAPER = registerBlock("brown_chain_links_wallpaper",
            new BrownChainLinksWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_CHECKERED_WALLPAPER = registerBlock("brown_checkered_wallpaper",
            new BrownCheckeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_CIRCULAR_WALLPAPER = registerBlock("brown_circular_wallpaper",
            new BrownCircularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_CROSSED_WALLPAPER = registerBlock("brown_crossed_wallpaper",
            new BrownCrossedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_DIAMOND_WALLPAPER = registerBlock("brown_diamond_wallpaper",
            new BrownDiamondWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_GRASS_WALLPAPER = registerBlock("brown_grass_wallpaper",
            new BrownGrassWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_INTERLINKED_WALLPAPER = registerBlock("brown_interlinked_wallpaper",
            new BrownInterlinkedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_LAYERED_WALLPAPER = registerBlock("brown_layered_wallpaper",
            new BrownLayeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_LILY_FLOWER_WALLPAPER = registerBlock("brown_lily_flower_wallpaper",
            new BrownLilyFlowerWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_OCULAR_WALLPAPER = registerBlock("brown_ocular_wallpaper",
            new BrownOcularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_OVAL_WALLPAPER = registerBlock("brown_oval_wallpaper",
            new BrownOvalWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_PYRIFORM_WALLPAPER = registerBlock("brown_pyriform_wallpaper",
            new BrownPyriformWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_SCALES_WALLPAPER = registerBlock("brown_scales_wallpaper",
            new BrownScalesWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_TWISTED_WALLPAPER = registerBlock("brown_twisted_wallpaper",
            new BrownTwistedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_TWO_STARRED_WALLPAPER = registerBlock("brown_two_starred_wallpaper",
            new BrownTwoStarredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_ZIPPER_WALLPAPER = registerBlock("brown_zipper_wallpaper",
            new BrownZipperWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
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
    public static final Block CYAN_CHAIN_LINKS_WALLPAPER = registerBlock("cyan_chain_links_wallpaper",
            new CyanChainLinksWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_CHECKERED_WALLPAPER = registerBlock("cyan_checkered_wallpaper",
            new CyanCheckeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_CIRCULAR_WALLPAPER = registerBlock("cyan_circular_wallpaper",
            new CyanCircularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_CROSSED_WALLPAPER = registerBlock("cyan_crossed_wallpaper",
            new CyanCrossedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_DIAMOND_WALLPAPER = registerBlock("cyan_diamond_wallpaper",
            new CyanDiamondWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_GRASS_WALLPAPER = registerBlock("cyan_grass_wallpaper",
            new CyanGrassWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_INTERLINKED_WALLPAPER = registerBlock("cyan_interlinked_wallpaper",
            new CyanInterlinkedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_LAYERED_WALLPAPER = registerBlock("cyan_layered_wallpaper",
            new CyanLayeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_LILY_FLOWER_WALLPAPER = registerBlock("cyan_lily_flower_wallpaper",
            new CyanLilyFlowerWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_OCULAR_WALLPAPER = registerBlock("cyan_ocular_wallpaper",
            new CyanOcularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_OVAL_WALLPAPER = registerBlock("cyan_oval_wallpaper",
            new CyanOvalWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_PYRIFORM_WALLPAPER = registerBlock("cyan_pyriform_wallpaper",
            new CyanPyriformWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_SCALES_WALLPAPER = registerBlock("cyan_scales_wallpaper",
            new CyanScalesWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_TWISTED_WALLPAPER = registerBlock("cyan_twisted_wallpaper",
            new CyanTwistedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_TWO_STARRED_WALLPAPER = registerBlock("cyan_two_starred_wallpaper",
            new CyanTwoStarredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_ZIPPER_WALLPAPER = registerBlock("cyan_zipper_wallpaper",
            new CyanZipperWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_CHAIN_LINKS_WALLPAPER = registerBlock("gray_chain_links_wallpaper",
            new GrayChainLinksWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_CHECKERED_WALLPAPER = registerBlock("gray_checkered_wallpaper",
            new GrayCheckeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_CIRCULAR_WALLPAPER = registerBlock("gray_circular_wallpaper",
            new GrayCircularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_CROSSED_WALLPAPER = registerBlock("gray_crossed_wallpaper",
            new GrayCrossedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_DIAMOND_WALLPAPER = registerBlock("gray_diamond_wallpaper",
            new GrayDiamondWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_GRASS_WALLPAPER = registerBlock("gray_grass_wallpaper",
            new GrayGrassWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_INTERLINKED_WALLPAPER = registerBlock("gray_interlinked_wallpaper",
            new GrayInterlinkedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_LAYERED_WALLPAPER = registerBlock("gray_layered_wallpaper",
            new GrayLayeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_LILY_FLOWER_WALLPAPER = registerBlock("gray_lily_flower_wallpaper",
            new GrayLilyFlowerWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_OCULAR_WALLPAPER = registerBlock("gray_ocular_wallpaper",
            new GrayOcularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_OVAL_WALLPAPER = registerBlock("gray_oval_wallpaper",
            new GrayOvalWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_PYRIFORM_WALLPAPER = registerBlock("gray_pyriform_wallpaper",
            new GrayPyriformWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_SCALES_WALLPAPER = registerBlock("gray_scales_wallpaper",
            new GrayScalesWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_TWISTED_WALLPAPER = registerBlock("gray_twisted_wallpaper",
            new GrayTwistedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_TWO_STARRED_WALLPAPER = registerBlock("gray_two_starred_wallpaper",
            new GrayTwoStarredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_ZIPPER_WALLPAPER = registerBlock("gray_zipper_wallpaper",
            new GrayZipperWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_CHAIN_LINKS_WALLPAPER = registerBlock("green_chain_links_wallpaper",
            new GreenChainLinksWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_CHECKERED_WALLPAPER = registerBlock("green_checkered_wallpaper",
            new GreenCheckeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_CIRCULAR_WALLPAPER = registerBlock("green_circular_wallpaper",
            new GreenCircularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_CROSSED_WALLPAPER = registerBlock("green_crossed_wallpaper",
            new GreenCrossedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_DIAMOND_WALLPAPER = registerBlock("green_diamond_wallpaper",
            new GreenDiamondWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_GRASS_WALLPAPER = registerBlock("green_grass_wallpaper",
            new GreenGrassWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_INTERLINKED_WALLPAPER = registerBlock("green_interlinked_wallpaper",
            new GreenInterlinkedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_LAYERED_WALLPAPER = registerBlock("green_layered_wallpaper",
            new GreenLayeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_LILY_FLOWER_WALLPAPER = registerBlock("green_lily_flower_wallpaper",
            new GreenLilyFlowerWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_OCULAR_WALLPAPER = registerBlock("green_ocular_wallpaper",
            new GreenOcularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_OVAL_WALLPAPER = registerBlock("green_oval_wallpaper",
            new GreenOvalWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_PYRIFORM_WALLPAPER = registerBlock("green_pyriform_wallpaper",
            new GreenPyriformWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_SCALES_WALLPAPER = registerBlock("green_scales_wallpaper",
            new GreenScalesWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_TWISTED_WALLPAPER = registerBlock("green_twisted_wallpaper",
            new GreenTwistedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_TWO_STARRED_WALLPAPER = registerBlock("green_two_starred_wallpaper",
            new GreenTwoStarredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_ZIPPER_WALLPAPER = registerBlock("green_zipper_wallpaper",
            new GreenZipperWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_CHAIN_LINKS_WALLPAPER = registerBlock("light_blue_chain_links_wallpaper",
            new LightBlueChainLinksWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_CHECKERED_WALLPAPER = registerBlock("light_blue_checkered_wallpaper",
            new LightBlueCheckeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_CIRCULAR_WALLPAPER = registerBlock("light_blue_circular_wallpaper",
            new LightBlueCircularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_CROSSED_WALLPAPER = registerBlock("light_blue_crossed_wallpaper",
            new LightBlueCrossedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_DIAMOND_WALLPAPER = registerBlock("light_blue_diamond_wallpaper",
            new LightBlueDiamondWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_GRASS_WALLPAPER = registerBlock("light_blue_grass_wallpaper",
            new LightBlueGrassWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_INTERLINKED_WALLPAPER = registerBlock("light_blue_interlinked_wallpaper",
            new LightBlueInterlinkedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_LAYERED_WALLPAPER = registerBlock("light_blue_layered_wallpaper",
            new LightBlueLayeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_LILY_FLOWER_WALLPAPER = registerBlock("light_blue_lily_flower_wallpaper",
            new LightBlueLilyFlowerWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_OCULAR_WALLPAPER = registerBlock("light_blue_ocular_wallpaper",
            new LightBlueOcularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_OVAL_WALLPAPER = registerBlock("light_blue_oval_wallpaper",
            new LightBlueOvalWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_PYRIFORM_WALLPAPER = registerBlock("light_blue_pyriform_wallpaper",
            new LightBluePyriformWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_SCALES_WALLPAPER = registerBlock("light_blue_scales_wallpaper",
            new LightBlueScalesWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_TWISTED_WALLPAPER = registerBlock("light_blue_twisted_wallpaper",
            new LightBlueTwistedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_TWO_STARRED_WALLPAPER = registerBlock("light_blue_two_starred_wallpaper",
            new LightBlueTwoStarredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_ZIPPER_WALLPAPER = registerBlock("light_blue_zipper_wallpaper",
            new LightBlueZipperWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_CHAIN_LINKS_WALLPAPER = registerBlock("light_gray_chain_links_wallpaper",
            new LightGrayChainLinksWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_CHECKERED_WALLPAPER = registerBlock("light_gray_checkered_wallpaper",
            new LightGrayCheckeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_CIRCULAR_WALLPAPER = registerBlock("light_gray_circular_wallpaper",
            new LightGrayCircularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_CROSSED_WALLPAPER = registerBlock("light_gray_crossed_wallpaper",
            new LightGrayCrossedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_DIAMOND_WALLPAPER = registerBlock("light_gray_diamond_wallpaper",
            new LightGrayDiamondWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_GRASS_WALLPAPER = registerBlock("light_gray_grass_wallpaper",
            new LightGrayGrassWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_INTERLINKED_WALLPAPER = registerBlock("light_gray_interlinked_wallpaper",
            new LightGrayInterlinkedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_LAYERED_WALLPAPER = registerBlock("light_gray_layered_wallpaper",
            new LightGrayLayeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_LILY_FLOWER_WALLPAPER = registerBlock("light_gray_lily_flower_wallpaper",
            new LightGrayLilyFlowerWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_OCULAR_WALLPAPER = registerBlock("light_gray_ocular_wallpaper",
            new LightGrayOcularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_OVAL_WALLPAPER = registerBlock("light_gray_oval_wallpaper",
            new LightGrayOvalWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_PYRIFORM_WALLPAPER = registerBlock("light_gray_pyriform_wallpaper",
            new LightGrayPyriformWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_SCALES_WALLPAPER = registerBlock("light_gray_scales_wallpaper",
            new LightGrayScalesWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_TWISTED_WALLPAPER = registerBlock("light_gray_twisted_wallpaper",
            new LightGrayTwistedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_TWO_STARRED_WALLPAPER = registerBlock("light_gray_two_starred_wallpaper",
            new LightGrayTwoStarredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_ZIPPER_WALLPAPER = registerBlock("light_gray_zipper_wallpaper",
            new LightGrayZipperWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_CHAIN_LINKS_WALLPAPER = registerBlock("lime_chain_links_wallpaper",
            new LimeChainLinksWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_CHECKERED_WALLPAPER = registerBlock("lime_checkered_wallpaper",
            new LimeCheckeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_CIRCULAR_WALLPAPER = registerBlock("lime_circular_wallpaper",
            new LimeCircularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_CROSSED_WALLPAPER = registerBlock("lime_crossed_wallpaper",
            new LimeCrossedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_DIAMOND_WALLPAPER = registerBlock("lime_diamond_wallpaper",
            new LimeDiamondWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_GRASS_WALLPAPER = registerBlock("lime_grass_wallpaper",
            new LimeGrassWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_INTERLINKED_WALLPAPER = registerBlock("lime_interlinked_wallpaper",
            new LimeInterlinkedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_LAYERED_WALLPAPER = registerBlock("lime_layered_wallpaper",
            new LimeLayeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_LILY_FLOWER_WALLPAPER = registerBlock("lime_lily_flower_wallpaper",
            new LimeLilyFlowerWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_OCULAR_WALLPAPER = registerBlock("lime_ocular_wallpaper",
            new LimeOcularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_OVAL_WALLPAPER = registerBlock("lime_oval_wallpaper",
            new LimeOvalWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_PYRIFORM_WALLPAPER = registerBlock("lime_pyriform_wallpaper",
            new LimePyriformWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_SCALES_WALLPAPER = registerBlock("lime_scales_wallpaper",
            new LimeScalesWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_TWISTED_WALLPAPER = registerBlock("lime_twisted_wallpaper",
            new LimeTwistedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_TWO_STARRED_WALLPAPER = registerBlock("lime_two_starred_wallpaper",
            new LimeTwoStarredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_ZIPPER_WALLPAPER = registerBlock("lime_zipper_wallpaper",
            new LimeZipperWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_CHAIN_LINKS_WALLPAPER = registerBlock("magenta_chain_links_wallpaper",
            new MagentaChainLinksWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_CHECKERED_WALLPAPER = registerBlock("magenta_checkered_wallpaper",
            new MagentaCheckeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_CIRCULAR_WALLPAPER = registerBlock("magenta_circular_wallpaper",
            new MagentaCircularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_CROSSED_WALLPAPER = registerBlock("magenta_crossed_wallpaper",
            new MagentaCrossedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_DIAMOND_WALLPAPER = registerBlock("magenta_diamond_wallpaper",
            new MagentaDiamondWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_GRASS_WALLPAPER = registerBlock("magenta_grass_wallpaper",
            new MagentaGrassWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_INTERLINKED_WALLPAPER = registerBlock("magenta_interlinked_wallpaper",
            new MagentaInterlinkedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_LAYERED_WALLPAPER = registerBlock("magenta_layered_wallpaper",
            new MagentaLayeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_LILY_FLOWER_WALLPAPER = registerBlock("magenta_lily_flower_wallpaper",
            new MagentaLilyFlowerWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_OCULAR_WALLPAPER = registerBlock("magenta_ocular_wallpaper",
            new MagentaOcularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_OVAL_WALLPAPER = registerBlock("magenta_oval_wallpaper",
            new MagentaOvalWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_PYRIFORM_WALLPAPER = registerBlock("magenta_pyriform_wallpaper",
            new MagentaPyriformWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_SCALES_WALLPAPER = registerBlock("magenta_scales_wallpaper",
            new MagentaScalesWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_TWISTED_WALLPAPER = registerBlock("magenta_twisted_wallpaper",
            new MagentaTwistedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_TWO_STARRED_WALLPAPER = registerBlock("magenta_two_starred_wallpaper",
            new MagentaTwoStarredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_ZIPPER_WALLPAPER = registerBlock("magenta_zipper_wallpaper",
            new MagentaZipperWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_CHAIN_LINKS_WALLPAPER = registerBlock("orange_chain_links_wallpaper",
            new OrangeChainLinksWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_CHECKERED_WALLPAPER = registerBlock("orange_checkered_wallpaper",
            new OrangeCheckeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_CIRCULAR_WALLPAPER = registerBlock("orange_circular_wallpaper",
            new OrangeCircularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_CROSSED_WALLPAPER = registerBlock("orange_crossed_wallpaper",
            new OrangeCrossedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_DIAMOND_WALLPAPER = registerBlock("orange_diamond_wallpaper",
            new OrangeDiamondWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_GRASS_WALLPAPER = registerBlock("orange_grass_wallpaper",
            new OrangeGrassWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_INTERLINKED_WALLPAPER = registerBlock("orange_interlinked_wallpaper",
            new OrangeInterlinkedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_LAYERED_WALLPAPER = registerBlock("orange_layered_wallpaper",
            new OrangeLayeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_LILY_FLOWER_WALLPAPER = registerBlock("orange_lily_flower_wallpaper",
            new OrangeLilyFlowerWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_OCULAR_WALLPAPER = registerBlock("orange_ocular_wallpaper",
            new OrangeOcularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_OVAL_WALLPAPER = registerBlock("orange_oval_wallpaper",
            new OrangeOvalWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_PYRIFORM_WALLPAPER = registerBlock("orange_pyriform_wallpaper",
            new OrangePyriformWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_SCALES_WALLPAPER = registerBlock("orange_scales_wallpaper",
            new OrangeScalesWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_TWISTED_WALLPAPER = registerBlock("orange_twisted_wallpaper",
            new OrangeTwistedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_TWO_STARRED_WALLPAPER = registerBlock("orange_two_starred_wallpaper",
            new OrangeTwoStarredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_ZIPPER_WALLPAPER = registerBlock("orange_zipper_wallpaper",
            new OrangeZipperWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_CHAIN_LINKS_WALLPAPER = registerBlock("pink_chain_links_wallpaper",
            new PinkChainLinksWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_CHECKERED_WALLPAPER = registerBlock("pink_checkered_wallpaper",
            new PinkCheckeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_CIRCULAR_WALLPAPER = registerBlock("pink_circular_wallpaper",
            new PinkCircularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_CROSSED_WALLPAPER = registerBlock("pink_crossed_wallpaper",
            new PinkCrossedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_DIAMOND_WALLPAPER = registerBlock("pink_diamond_wallpaper",
            new PinkDiamondWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_GRASS_WALLPAPER = registerBlock("pink_grass_wallpaper",
            new PinkGrassWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_INTERLINKED_WALLPAPER = registerBlock("pink_interlinked_wallpaper",
            new PinkInterlinkedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_LAYERED_WALLPAPER = registerBlock("pink_layered_wallpaper",
            new PinkLayeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_LILY_FLOWER_WALLPAPER = registerBlock("pink_lily_flower_wallpaper",
            new PinkLilyFlowerWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_OCULAR_WALLPAPER = registerBlock("pink_ocular_wallpaper",
            new PinkOcularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_OVAL_WALLPAPER = registerBlock("pink_oval_wallpaper",
            new PinkOvalWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_PYRIFORM_WALLPAPER = registerBlock("pink_pyriform_wallpaper",
            new PinkPyriformWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_SCALES_WALLPAPER = registerBlock("pink_scales_wallpaper",
            new PinkScalesWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_TWISTED_WALLPAPER = registerBlock("pink_twisted_wallpaper",
            new PinkTwistedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_TWO_STARRED_WALLPAPER = registerBlock("pink_two_starred_wallpaper",
            new PinkTwoStarredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_ZIPPER_WALLPAPER = registerBlock("pink_zipper_wallpaper",
            new PinkZipperWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_CHAIN_LINKS_WALLPAPER = registerBlock("purple_chain_links_wallpaper",
            new PurpleChainLinksWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_CHECKERED_WALLPAPER = registerBlock("purple_checkered_wallpaper",
            new PurpleCheckeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_CIRCULAR_WALLPAPER = registerBlock("purple_circular_wallpaper",
            new PurpleCircularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_CROSSED_WALLPAPER = registerBlock("purple_crossed_wallpaper",
            new PurpleCrossedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_DIAMOND_WALLPAPER = registerBlock("purple_diamond_wallpaper",
            new PurpleDiamondWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_GRASS_WALLPAPER = registerBlock("purple_grass_wallpaper",
            new PurpleGrassWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_INTERLINKED_WALLPAPER = registerBlock("purple_interlinked_wallpaper",
            new PurpleInterlinkedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_LAYERED_WALLPAPER = registerBlock("purple_layered_wallpaper",
            new PurpleLayeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_LILY_FLOWER_WALLPAPER = registerBlock("purple_lily_flower_wallpaper",
            new PurpleLilyFlowerWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_OCULAR_WALLPAPER = registerBlock("purple_ocular_wallpaper",
            new PurpleOcularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_OVAL_WALLPAPER = registerBlock("purple_oval_wallpaper",
            new PurpleOvalWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_PYRIFORM_WALLPAPER = registerBlock("purple_pyriform_wallpaper",
            new PurplePyriformWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_SCALES_WALLPAPER = registerBlock("purple_scales_wallpaper",
            new PurpleScalesWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_TWISTED_WALLPAPER = registerBlock("purple_twisted_wallpaper",
            new PurpleTwistedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_TWO_STARRED_WALLPAPER = registerBlock("purple_two_starred_wallpaper",
            new PurpleTwoStarredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_ZIPPER_WALLPAPER = registerBlock("purple_zipper_wallpaper",
            new PurpleZipperWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_CHAIN_LINKS_WALLPAPER = registerBlock("red_chain_links_wallpaper",
            new RedChainLinksWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_CHECKERED_WALLPAPER = registerBlock("red_checkered_wallpaper",
            new RedCheckeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_CIRCULAR_WALLPAPER = registerBlock("red_circular_wallpaper",
            new RedCircularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_CROSSED_WALLPAPER = registerBlock("red_crossed_wallpaper",
            new RedCrossedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_DIAMOND_WALLPAPER = registerBlock("red_diamond_wallpaper",
            new RedDiamondWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_GRASS_WALLPAPER = registerBlock("red_grass_wallpaper",
            new RedGrassWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_INTERLINKED_WALLPAPER = registerBlock("red_interlinked_wallpaper",
            new RedInterlinkedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_LAYERED_WALLPAPER = registerBlock("red_layered_wallpaper",
            new RedLayeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_LILY_FLOWER_WALLPAPER = registerBlock("red_lily_flower_wallpaper",
            new RedLilyFlowerWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_OCULAR_WALLPAPER = registerBlock("red_ocular_wallpaper",
            new RedOcularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_OVAL_WALLPAPER = registerBlock("red_oval_wallpaper",
            new RedOvalWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_PYRIFORM_WALLPAPER = registerBlock("red_pyriform_wallpaper",
            new RedPyriformWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_SCALES_WALLPAPER = registerBlock("red_scales_wallpaper",
            new RedScalesWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_TWISTED_WALLPAPER = registerBlock("red_twisted_wallpaper",
            new RedTwistedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_TWO_STARRED_WALLPAPER = registerBlock("red_two_starred_wallpaper",
            new RedTwoStarredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_ZIPPER_WALLPAPER = registerBlock("red_zipper_wallpaper",
            new RedZipperWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_CHAIN_LINKS_WALLPAPER = registerBlock("white_chain_links_wallpaper",
            new WhiteChainLinksWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_CHECKERED_WALLPAPER = registerBlock("white_checkered_wallpaper",
            new WhiteCheckeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_CIRCULAR_WALLPAPER = registerBlock("white_circular_wallpaper",
            new WhiteCircularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_CROSSED_WALLPAPER = registerBlock("white_crossed_wallpaper",
            new WhiteCrossedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_DIAMOND_WALLPAPER = registerBlock("white_diamond_wallpaper",
            new WhiteDiamondWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_GRASS_WALLPAPER = registerBlock("white_grass_wallpaper",
            new WhiteGrassWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_INTERLINKED_WALLPAPER = registerBlock("white_interlinked_wallpaper",
            new WhiteInterlinkedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_LAYERED_WALLPAPER = registerBlock("white_layered_wallpaper",
            new WhiteLayeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_LILY_FLOWER_WALLPAPER = registerBlock("white_lily_flower_wallpaper",
            new WhiteLilyFlowerWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_OCULAR_WALLPAPER = registerBlock("white_ocular_wallpaper",
            new WhiteOcularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_OVAL_WALLPAPER = registerBlock("white_oval_wallpaper",
            new WhiteOvalWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_PYRIFORM_WALLPAPER = registerBlock("white_pyriform_wallpaper",
            new WhitePyriformWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_SCALES_WALLPAPER = registerBlock("white_scales_wallpaper",
            new WhiteScalesWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_TWISTED_WALLPAPER = registerBlock("white_twisted_wallpaper",
            new WhiteTwistedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_TWO_STARRED_WALLPAPER = registerBlock("white_two_starred_wallpaper",
            new WhiteTwoStarredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_ZIPPER_WALLPAPER = registerBlock("white_zipper_wallpaper",
            new WhiteZipperWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_CHAIN_LINKS_WALLPAPER = registerBlock("yellow_chain_links_wallpaper",
            new YellowChainLinksWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_CHECKERED_WALLPAPER = registerBlock("yellow_checkered_wallpaper",
            new YellowCheckeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_CIRCULAR_WALLPAPER = registerBlock("yellow_circular_wallpaper",
            new YellowCircularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_CROSSED_WALLPAPER = registerBlock("yellow_crossed_wallpaper",
            new YellowCrossedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_DIAMOND_WALLPAPER = registerBlock("yellow_diamond_wallpaper",
            new YellowDiamondWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_GRASS_WALLPAPER = registerBlock("yellow_grass_wallpaper",
            new YellowGrassWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_INTERLINKED_WALLPAPER = registerBlock("yellow_interlinked_wallpaper",
            new YellowInterlinkedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_LAYERED_WALLPAPER = registerBlock("yellow_layered_wallpaper",
            new YellowLayeredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_LILY_FLOWER_WALLPAPER = registerBlock("yellow_lily_flower_wallpaper",
            new YellowLilyFlowerWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_OCULAR_WALLPAPER = registerBlock("yellow_ocular_wallpaper",
            new YellowOcularWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_OVAL_WALLPAPER = registerBlock("yellow_oval_wallpaper",
            new YellowOvalWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_PYRIFORM_WALLPAPER = registerBlock("yellow_pyriform_wallpaper",
            new YellowPyriformWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_SCALES_WALLPAPER = registerBlock("yellow_scales_wallpaper",
            new YellowScalesWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_TWISTED_WALLPAPER = registerBlock("yellow_twisted_wallpaper",
            new YellowTwistedWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_TWO_STARRED_WALLPAPER = registerBlock("yellow_two_starred_wallpaper",
            new YellowTwoStarredWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_ZIPPER_WALLPAPER = registerBlock("yellow_zipper_wallpaper",
            new YellowZipperWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));

    public static final Block ANDESITE_PILLAR = registerBlock("andesite_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block GRANITE_PILLAR = registerBlock("granite_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block DIORITE_PILLAR = registerBlock("diorite_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block DEEPSLATE_PILLAR = registerBlock("deepslate_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block BASALT_PILLAR = registerBlock("basalt_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE).sounds(BlockSoundGroup.BASALT)));
    public static final Block BLACKSTONE_PILLAR = registerBlock("blackstone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block GILDED_BLACKSTONE_PILLAR = registerBlock("gilded_blackstone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block END_STONE_PILLAR = registerBlock("end_stone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block TUFF_PILLAR = registerBlock("tuff_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE).sounds(BlockSoundGroup.TUFF)));
    public static final Block CALCITE_PILLAR = registerBlock("calcite_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE).sounds(BlockSoundGroup.CALCITE)));
    public static final Block PORCELAIN_PILLAR = registerBlock("porcelain_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE).sounds(BlockSoundGroup.BONE)));
    public static final Block STONE_PILLAR = registerBlock("stone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)));

    public static final Block CHECKERED_PORCELAIN_TERRACOTTA = registerBlock("checkered_porcelain_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_WHITE_TERRACOTTA = registerBlock("checkered_porcelain_white_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_LIGHT_GRAY_TERRACOTTA = registerBlock("checkered_porcelain_light_gray_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_GRAY_TERRACOTTA = registerBlock("checkered_porcelain_gray_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_BLACK_TERRACOTTA = registerBlock("checkered_porcelain_black_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_BROWN_TERRACOTTA = registerBlock("checkered_porcelain_brown_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_RED_TERRACOTTA = registerBlock("checkered_porcelain_red_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_ORANGE_TERRACOTTA = registerBlock("checkered_porcelain_orange_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_YELLOW_TERRACOTTA = registerBlock("checkered_porcelain_yellow_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_LIME_TERRACOTTA = registerBlock("checkered_porcelain_lime_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_GREEN_TERRACOTTA = registerBlock("checkered_porcelain_green_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_CYAN_TERRACOTTA = registerBlock("checkered_porcelain_cyan_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_LIGHT_BLUE_TERRACOTTA = registerBlock("checkered_porcelain_light_blue_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_BLUE_TERRACOTTA = registerBlock("checkered_porcelain_blue_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_PURPLE_TERRACOTTA = registerBlock("checkered_porcelain_purple_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_MAGENTA_TERRACOTTA = registerBlock("checkered_porcelain_magenta_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_PINK_TERRACOTTA = registerBlock("checkered_porcelain_pink_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));

    public static final Block STARRED_PORCELAIN_TERRACOTTA = registerBlock("starred_porcelain_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_WHITE_TERRACOTTA = registerBlock("starred_porcelain_white_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_LIGHT_GRAY_TERRACOTTA = registerBlock("starred_porcelain_light_gray_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_GRAY_TERRACOTTA = registerBlock("starred_porcelain_gray_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_BLACK_TERRACOTTA = registerBlock("starred_porcelain_black_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_BROWN_TERRACOTTA = registerBlock("starred_porcelain_brown_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_RED_TERRACOTTA = registerBlock("starred_porcelain_red_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_ORANGE_TERRACOTTA = registerBlock("starred_porcelain_orange_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_YELLOW_TERRACOTTA = registerBlock("starred_porcelain_yellow_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_LIME_TERRACOTTA = registerBlock("starred_porcelain_lime_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_GREEN_TERRACOTTA = registerBlock("starred_porcelain_green_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_CYAN_TERRACOTTA = registerBlock("starred_porcelain_cyan_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_LIGHT_BLUE_TERRACOTTA = registerBlock("starred_porcelain_light_blue_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_BLUE_TERRACOTTA = registerBlock("starred_porcelain_blue_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_PURPLE_TERRACOTTA = registerBlock("starred_porcelain_purple_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_MAGENTA_TERRACOTTA = registerBlock("starred_porcelain_magenta_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_PINK_TERRACOTTA = registerBlock("starred_porcelain_pink_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));

    public static final Block CHECKERED_PORCELAIN_WHITE_CONCRETE = registerBlock("checkered_porcelain_white_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_LIGHT_GRAY_CONCRETE = registerBlock("checkered_porcelain_light_gray_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_GRAY_CONCRETE = registerBlock("checkered_porcelain_gray_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_BLACK_CONCRETE = registerBlock("checkered_porcelain_black_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_BROWN_CONCRETE = registerBlock("checkered_porcelain_brown_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_RED_CONCRETE = registerBlock("checkered_porcelain_red_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_ORANGE_CONCRETE = registerBlock("checkered_porcelain_orange_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_YELLOW_CONCRETE = registerBlock("checkered_porcelain_yellow_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_LIME_CONCRETE = registerBlock("checkered_porcelain_lime_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_GREEN_CONCRETE = registerBlock("checkered_porcelain_green_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_CYAN_CONCRETE = registerBlock("checkered_porcelain_cyan_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_LIGHT_BLUE_CONCRETE = registerBlock("checkered_porcelain_light_blue_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_BLUE_CONCRETE = registerBlock("checkered_porcelain_blue_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_PURPLE_CONCRETE = registerBlock("checkered_porcelain_purple_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_MAGENTA_CONCRETE = registerBlock("checkered_porcelain_magenta_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block CHECKERED_PORCELAIN_PINK_CONCRETE = registerBlock("checkered_porcelain_pink_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));

    public static final Block STARRED_PORCELAIN_WHITE_CONCRETE = registerBlock("starred_porcelain_white_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_LIGHT_GRAY_CONCRETE = registerBlock("starred_porcelain_light_gray_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_GRAY_CONCRETE = registerBlock("starred_porcelain_gray_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_BLACK_CONCRETE = registerBlock("starred_porcelain_black_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_BROWN_CONCRETE = registerBlock("starred_porcelain_brown_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_RED_CONCRETE = registerBlock("starred_porcelain_red_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_ORANGE_CONCRETE = registerBlock("starred_porcelain_orange_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_YELLOW_CONCRETE = registerBlock("starred_porcelain_yellow_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_LIME_CONCRETE = registerBlock("starred_porcelain_lime_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_GREEN_CONCRETE = registerBlock("starred_porcelain_green_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_CYAN_CONCRETE = registerBlock("starred_porcelain_cyan_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_LIGHT_BLUE_CONCRETE = registerBlock("starred_porcelain_light_blue_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_BLUE_CONCRETE = registerBlock("starred_porcelain_blue_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_PURPLE_CONCRETE = registerBlock("starred_porcelain_purple_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_MAGENTA_CONCRETE = registerBlock("starred_porcelain_magenta_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));
    public static final Block STARRED_PORCELAIN_PINK_CONCRETE = registerBlock("starred_porcelain_pink_concrete",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK).sounds(BlockSoundGroup.BONE)));

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
    public static final Block STEEL_DOOR_FLOWER = registerBlock("steel_door_flower",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).sounds(BlockSoundGroup.NETHERITE), BlockSetType.IRON));
    public static final Block STEEL_DOOR_MOON = registerBlock("steel_door_moon",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).sounds(BlockSoundGroup.NETHERITE), BlockSetType.IRON));
    public static final Block STEEL_DOOR_SUN = registerBlock("steel_door_sun",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).sounds(BlockSoundGroup.NETHERITE), BlockSetType.IRON));
    public static final Block STEEL_TRAPDOOR = registerBlock("steel_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).sounds(BlockSoundGroup.NETHERITE), BlockSetType.IRON));

    public static final Block IRON_DOOR_MOON = registerBlock("iron_door_moon",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).sounds(BlockSoundGroup.METAL), BlockSetType.IRON));
    public static final Block IRON_DOOR_SUN = registerBlock("iron_door_sun",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).sounds(BlockSoundGroup.METAL), BlockSetType.IRON));
    public static final Block IRON_DOOR_FLOWER = registerBlock("iron_door_flower",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).sounds(BlockSoundGroup.METAL), BlockSetType.IRON));

    public static final Block GOLD_DOOR = registerBlock("gold_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.METAL), BlockSetType.GOLD));
    public static final Block GOLD_DOOR_FLOWER = registerBlock("gold_door_flower",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.METAL), BlockSetType.GOLD));
    public static final Block GOLD_DOOR_MOON = registerBlock("gold_door_moon",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.METAL), BlockSetType.GOLD));
    public static final Block GOLD_DOOR_SUN = registerBlock("gold_door_sun",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.METAL), BlockSetType.GOLD));
    public static final Block GOLD_TRAPDOOR = registerBlock("gold_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_TRAPDOOR).sounds(BlockSoundGroup.METAL), BlockSetType.GOLD));

    public static final Block OAK_CHAIR = registerBlock("oak_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block SPRUCE_CHAIR = registerBlock("spruce_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block BIRCH_CHAIR = registerBlock("birch_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block JUNGLE_CHAIR = registerBlock("jungle_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block ACACIA_CHAIR = registerBlock("acacia_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block DARK_OAK_CHAIR = registerBlock("dark_oak_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block MANGROVE_CHAIR = registerBlock("mangrove_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block CHERRY_CHAIR = registerBlock("cherry_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.CHERRY_WOOD).nonOpaque()));
    public static final Block BAMBOO_CHAIR = registerBlock("bamboo_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.BAMBOO).nonOpaque()));
    public static final Block CRIMSON_CHAIR = registerBlock("crimson_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.NETHER_WOOD).nonOpaque()));
    public static final Block WARPED_CHAIR = registerBlock("warped_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.NETHER_WOOD).nonOpaque()));

    public static final Block OAK_ARM_CHAIR = registerBlock("oak_arm_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block SPRUCE_ARM_CHAIR = registerBlock("spruce_arm_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block BIRCH_ARM_CHAIR = registerBlock("birch_arm_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block JUNGLE_ARM_CHAIR = registerBlock("jungle_arm_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block ACACIA_ARM_CHAIR = registerBlock("acacia_arm_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block DARK_OAK_ARM_CHAIR = registerBlock("dark_oak_arm_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block MANGROVE_ARM_CHAIR = registerBlock("mangrove_arm_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block CHERRY_ARM_CHAIR = registerBlock("cherry_arm_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.CHERRY_WOOD).nonOpaque()));
    public static final Block BAMBOO_ARM_CHAIR = registerBlock("bamboo_arm_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.BAMBOO).nonOpaque()));
    public static final Block CRIMSON_ARM_CHAIR = registerBlock("crimson_arm_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.NETHER_WOOD).nonOpaque()));
    public static final Block WARPED_ARM_CHAIR = registerBlock("warped_arm_chair",
            new ChairBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.NETHER_WOOD).nonOpaque()));

    public static final Block OAK_STOOL = registerBlock("oak_stool",
            new StoolBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block SPRUCE_STOOL = registerBlock("spruce_stool",
            new StoolBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block BIRCH_STOOL = registerBlock("birch_stool",
            new StoolBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block JUNGLE_STOOL = registerBlock("jungle_stool",
            new StoolBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block ACACIA_STOOL = registerBlock("acacia_stool",
            new StoolBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block DARK_OAK_STOOL = registerBlock("dark_oak_stool",
            new StoolBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block MANGROVE_STOOL = registerBlock("mangrove_stool",
            new StoolBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block CHERRY_STOOL = registerBlock("cherry_stool",
            new StoolBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.CHERRY_WOOD).nonOpaque()));
    public static final Block BAMBOO_STOOL = registerBlock("bamboo_stool",
            new StoolBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).nonOpaque()));
    public static final Block CRIMSON_STOOL = registerBlock("crimson_stool",
            new StoolBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.NETHER_WOOD).nonOpaque()));
    public static final Block WARPED_STOOL = registerBlock("warped_stool",
            new StoolBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.NETHER_WOOD).nonOpaque()));


    public static final Block PURPLE_EYE_DAISY = registerBlock("purple_eye_daisy",
            new FlowerBlock(StatusEffects.ABSORPTION, 10,
                    FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY).nonOpaque().noCollision().breakInstantly()));
    public static final Block POTTED_PURPLE_EYE_DAISY = Registry.register(Registries.BLOCK, new Identifier(FlamesVictorianMadness.MOD_ID, "potted_purple_eye_daisy"),
            new FlowerPotBlock(PURPLE_EYE_DAISY, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block CAMELLIA = registerBlock("camellia",
            new FlowerBlock(StatusEffects.ABSORPTION, 10,
                    FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY).nonOpaque().noCollision().breakInstantly()));
    public static final Block POTTED_CAMELLIA = Registry.register(Registries.BLOCK, new Identifier(FlamesVictorianMadness.MOD_ID, "potted_camellia"),
            new FlowerPotBlock(CAMELLIA, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block CANTERBURY_BELLS = registerBlock("canterbury_bells",
            new FlowerBlock(StatusEffects.ABSORPTION, 10,
                    FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY).nonOpaque().noCollision().breakInstantly()));
    public static final Block POTTED_CANTERBURY_BELLS = Registry.register(Registries.BLOCK, new Identifier(FlamesVictorianMadness.MOD_ID, "potted_canterbury_bells"),
            new FlowerPotBlock(CANTERBURY_BELLS, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block SHORT_LILAC = registerBlock("short_lilac",
            new FlowerBlock(StatusEffects.ABSORPTION, 10,
                    FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY).nonOpaque().noCollision().breakInstantly()));
    public static final Block POTTED_SHORT_LILAC = Registry.register(Registries.BLOCK, new Identifier(FlamesVictorianMadness.MOD_ID, "potted_short_lilac"),
            new FlowerPotBlock(SHORT_LILAC, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
        public static final Block SHORT_ROSE_BUSH = registerBlock("short_rose_bush",
            new FlowerBlock(StatusEffects.ABSORPTION, 10,
                    FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY).nonOpaque().noCollision().breakInstantly()));
    public static final Block POTTED_SHORT_ROSE_BUSH = Registry.register(Registries.BLOCK, new Identifier(FlamesVictorianMadness.MOD_ID, "potted_short_rose_bush"),
            new FlowerPotBlock(SHORT_ROSE_BUSH, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block SHORT_PONEY_BUSH = registerBlock("short_poney_bush",
            new FlowerBlock(StatusEffects.ABSORPTION, 10,
                    FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY).nonOpaque().noCollision().breakInstantly()));
    public static final Block POTTED_SHORT_PONEY_BUSH = Registry.register(Registries.BLOCK, new Identifier(FlamesVictorianMadness.MOD_ID, "potted_short_poney_bush"),
            new FlowerPotBlock(SHORT_PONEY_BUSH, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block BLUE_FOXGLOVES = registerBlock("blue_foxgloves",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision().breakInstantly()));
    public static final Block WHITE_FOXGLOVES = registerBlock("white_foxgloves",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision().breakInstantly()));
    public static final Block PURPLE_FOXGLOVES = registerBlock("purple_foxgloves",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision().breakInstantly()));
    public static final Block PINK_FOXGLOVES = registerBlock("pink_foxgloves",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision().breakInstantly()));
    public static final Block FORGET_ME_NOTS = registerBlock("forget_me_nots",
            new FlowerbedBlock(FabricBlockSettings.copyOf(Blocks.PINK_PETALS).nonOpaque().noCollision().breakInstantly()));
    public static final Block CROCUSES = registerBlock("crocuses",
            new FlowerbedBlock(FabricBlockSettings.copyOf(Blocks.PINK_PETALS).nonOpaque().noCollision().breakInstantly()));

    public static final Block OAK_DOOR_FLOWER = registerBlock("oak_door_flower",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.OAK));
    public static final Block OAK_DOOR_MOON = registerBlock("oak_door_moon",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.OAK));
    public static final Block OAK_DOOR_SUN = registerBlock("oak_door_sun",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.OAK));
    public static final Block BIRCH_DOOR_FLOWER = registerBlock("birch_door_flower",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.BIRCH));
    public static final Block BIRCH_DOOR_MOON = registerBlock("birch_door_moon",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.BIRCH));
    public static final Block BIRCH_DOOR_SUN = registerBlock("birch_door_sun",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.BIRCH));
    public static final Block JUNGLE_DOOR_FLOWER = registerBlock("jungle_door_flower",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.JUNGLE));
    public static final Block JUNGLE_DOOR_MOON = registerBlock("jungle_door_moon",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.JUNGLE));
    public static final Block JUNGLE_DOOR_SUN = registerBlock("jungle_door_sun",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.JUNGLE));
    public static final Block ACACIA_DOOR_FLOWER = registerBlock("acacia_door_flower",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.ACACIA));
    public static final Block ACACIA_DOOR_MOON = registerBlock("acacia_door_moon",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.ACACIA));
    public static final Block ACACIA_DOOR_SUN = registerBlock("acacia_door_sun",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.ACACIA));
    public static final Block DARK_OAK_DOOR_FLOWER = registerBlock("dark_oak_door_flower",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.DARK_OAK));
    public static final Block DARK_OAK_DOOR_MOON = registerBlock("dark_oak_door_moon",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.DARK_OAK));
    public static final Block DARK_OAK_DOOR_SUN = registerBlock("dark_oak_door_sun",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.DARK_OAK));
    public static final Block MANGROVE_DOOR_FLOWER = registerBlock("mangrove_door_flower",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.MANGROVE));
    public static final Block MANGROVE_DOOR_MOON = registerBlock("mangrove_door_moon",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.MANGROVE));
    public static final Block MANGROVE_DOOR_SUN = registerBlock("mangrove_door_sun",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.MANGROVE));
    public static final Block CHERRY_DOOR_FLOWER = registerBlock("cherry_door_flower",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.CHERRY_WOOD), BlockSetType.CHERRY));
    public static final Block CHERRY_DOOR_MOON = registerBlock("cherry_door_moon",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.CHERRY_WOOD), BlockSetType.CHERRY));
    public static final Block CHERRY_DOOR_SUN = registerBlock("cherry_door_sun",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.CHERRY_WOOD), BlockSetType.CHERRY));
    public static final Block BAMBOO_DOOR_FLOWER = registerBlock("bamboo_door_flower",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.BAMBOO_WOOD), BlockSetType.BAMBOO));
    public static final Block BAMBOO_DOOR_MOON = registerBlock("bamboo_door_moon",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.BAMBOO_WOOD), BlockSetType.BAMBOO));
    public static final Block BAMBOO_DOOR_SUN = registerBlock("bamboo_door_sun",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.BAMBOO_WOOD), BlockSetType.BAMBOO));
    public static final Block CRIMSON_DOOR_FLOWER = registerBlock("crimson_door_flower",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.NETHER_WOOD), BlockSetType.CRIMSON));
    public static final Block CRIMSON_DOOR_MOON = registerBlock("crimson_door_moon",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.NETHER_WOOD), BlockSetType.CRIMSON));
    public static final Block CRIMSON_DOOR_SUN = registerBlock("crimson_door_sun",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.NETHER_WOOD), BlockSetType.CRIMSON));
    public static final Block WARPED_DOOR_FLOWER = registerBlock("warped_door_flower",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.NETHER_WOOD), BlockSetType.WARPED));
    public static final Block WARPED_DOOR_MOON = registerBlock("warped_door_moon",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.NETHER_WOOD), BlockSetType.WARPED));
    public static final Block WARPED_DOOR_SUN = registerBlock("warped_door_sun",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.NETHER_WOOD), BlockSetType.WARPED));
    public static final Block SPRUCE_DOOR_FLOWER = registerBlock("spruce_door_flower",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.SPRUCE));
    public static final Block SPRUCE_DOOR_MOON = registerBlock("spruce_door_moon",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.SPRUCE));
    public static final Block SPRUCE_DOOR_SUN = registerBlock("spruce_door_sun",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR).sounds(BlockSoundGroup.WOOD), BlockSetType.SPRUCE));

    public static final Block BLACK_FLOWER_CHARGE = registerBlock("black_flower_charge",
            new BlackFlowerChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_FLOWER_CHARGE = registerBlock("blue_flower_charge",
            new BlueFlowerChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_FLOWER_CHARGE = registerBlock("brown_flower_charge",
            new BrownFlowerChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_FLOWER_CHARGE = registerBlock("cyan_flower_charge",
            new CyanFlowerChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_FLOWER_CHARGE = registerBlock("gray_flower_charge",
            new GrayFlowerChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_FLOWER_CHARGE = registerBlock("green_flower_charge",
            new GreenFlowerChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_FLOWER_CHARGE = registerBlock("light_blue_flower_charge",
            new LightBlueFlowerChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_FLOWER_CHARGE = registerBlock("light_gray_flower_charge",
            new LightGrayFlowerChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_FLOWER_CHARGE = registerBlock("lime_flower_charge",
            new LimeFlowerChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_FLOWER_CHARGE = registerBlock("magenta_flower_charge",
            new MagentaFlowerChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_FLOWER_CHARGE = registerBlock("orange_flower_charge",
            new OrangeFlowerChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_FLOWER_CHARGE = registerBlock("pink_flower_charge",
            new PinkFlowerChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_FLOWER_CHARGE = registerBlock("purple_flower_charge",
            new PurpleFlowerChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_FLOWER_CHARGE = registerBlock("red_flower_charge",
            new RedFlowerChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_FLOWER_CHARGE = registerBlock("white_flower_charge",
            new WhiteFlowerChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_FLOWER_CHARGE = registerBlock("yellow_flower_charge",
            new YellowFlowerChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_CREEPER_CHARGE = registerBlock("black_creeper_charge",
            new BlackCreeperChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_CREEPER_CHARGE = registerBlock("blue_creeper_charge",
            new BlueCreeperChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_CREEPER_CHARGE = registerBlock("brown_creeper_charge",
            new BrownCreeperChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_CREEPER_CHARGE = registerBlock("cyan_creeper_charge",
            new CyanCreeperChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_CREEPER_CHARGE = registerBlock("gray_creeper_charge",
            new GrayCreeperChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_CREEPER_CHARGE = registerBlock("green_creeper_charge",
            new GreenCreeperChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_CREEPER_CHARGE = registerBlock("light_blue_creeper_charge",
            new LightBlueCreeperChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_CREEPER_CHARGE = registerBlock("light_gray_creeper_charge",
            new LightGrayCreeperChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_CREEPER_CHARGE = registerBlock("lime_creeper_charge",
            new LimeCreeperChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_CREEPER_CHARGE = registerBlock("magenta_creeper_charge",
            new MagentaCreeperChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_CREEPER_CHARGE = registerBlock("orange_creeper_charge",
            new OrangeCreeperChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_CREEPER_CHARGE = registerBlock("pink_creeper_charge",
            new PinkCreeperChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_CREEPER_CHARGE = registerBlock("purple_creeper_charge",
            new PurpleCreeperChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_CREEPER_CHARGE = registerBlock("red_creeper_charge",
            new RedCreeperChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_CREEPER_CHARGE = registerBlock("white_creeper_charge",
            new WhiteCreeperChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_CREEPER_CHARGE = registerBlock("yellow_creeper_charge",
            new YellowCreeperChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));

    public static final Block BLACK_SKULL_CHARGE = registerBlock("black_skull_charge",
            new BlackSkullChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_SKULL_CHARGE = registerBlock("blue_skull_charge",
            new BlueSkullChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_SKULL_CHARGE = registerBlock("brown_skull_charge",
            new BrownSkullChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_SKULL_CHARGE = registerBlock("cyan_skull_charge",
            new CyanSkullChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_SKULL_CHARGE = registerBlock("gray_skull_charge",
            new GraySkullChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_SKULL_CHARGE = registerBlock("green_skull_charge",
            new GreenSkullChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_SKULL_CHARGE = registerBlock("light_blue_skull_charge",
            new LightBlueSkullChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_SKULL_CHARGE = registerBlock("light_gray_skull_charge",
            new LightGraySkullChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_SKULL_CHARGE = registerBlock("lime_skull_charge",
            new LimeSkullChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_SKULL_CHARGE = registerBlock("magenta_skull_charge",
            new MagentaSkullChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_SKULL_CHARGE = registerBlock("orange_skull_charge",
            new OrangeSkullChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_SKULL_CHARGE = registerBlock("pink_skull_charge",
            new PinkSkullChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_SKULL_CHARGE = registerBlock("purple_skull_charge",
            new PurpleSkullChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_SKULL_CHARGE = registerBlock("red_skull_charge",
            new RedSkullChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_SKULL_CHARGE = registerBlock("white_skull_charge",
            new WhiteSkullChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_SKULL_CHARGE = registerBlock("yellow_skull_charge",
            new YellowSkullChargeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));

    public static final Block BLACK_THING = registerBlock("black_thing",
            new BlackThingWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_THING = registerBlock("blue_thing",
            new BlueThingWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_THING = registerBlock("brown_thing",
            new BrownThingWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_THING = registerBlock("cyan_thing",
            new CyanThingWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_THING = registerBlock("gray_thing",
            new GrayThingWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_THING = registerBlock("green_thing",
            new GreenThingWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_THING = registerBlock("light_blue_thing",
            new LightBlueThingWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_THING = registerBlock("light_gray_thing",
            new LightGrayThingWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_THING = registerBlock("lime_thing",
            new LimeThingWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_THING = registerBlock("magenta_thing",
            new MagentaThingWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_THING = registerBlock("orange_thing",
            new OrangeThingWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_THING = registerBlock("pink_thing",
            new PinkThingWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_THING = registerBlock("purple_thing",
            new PurpleThingWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_THING = registerBlock("red_thing",
            new RedThingWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_THING = registerBlock("white_thing",
            new WhiteThingWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_THING = registerBlock("yellow_thing",
            new YellowThingWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));

    public static final Block BLACK_GLOBE = registerBlock("black_globe",
            new BlackGlobeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_GLOBE = registerBlock("blue_globe",
            new BlueGlobeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_GLOBE = registerBlock("brown_globe",
            new BrownGlobeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_GLOBE = registerBlock("cyan_globe",
            new CyanGlobeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_GLOBE = registerBlock("gray_globe",
            new GrayGlobeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_GLOBE = registerBlock("green_globe",
            new GreenGlobeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_GLOBE = registerBlock("light_blue_globe",
            new LightBlueGlobeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_GLOBE = registerBlock("light_gray_globe",
            new LightGrayGlobeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_GLOBE = registerBlock("lime_globe",
            new LimeGlobeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_GLOBE = registerBlock("magenta_globe",
            new MagentaGlobeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_GLOBE = registerBlock("orange_globe",
            new OrangeGlobeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_GLOBE = registerBlock("pink_globe",
            new PinkGlobeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_GLOBE = registerBlock("purple_globe",
            new PurpleGlobeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_GLOBE = registerBlock("red_globe",
            new RedGlobeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_GLOBE = registerBlock("white_globe",
            new WhiteGlobeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_GLOBE = registerBlock("yellow_globe",
            new YellowGlobeWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));

    public static final Block BLACK_SNOUT = registerBlock("black_snout",
            new BlackSnoutWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_SNOUT = registerBlock("blue_snout",
            new BlueSnoutWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_SNOUT = registerBlock("brown_snout",
            new BrownSnoutWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_SNOUT = registerBlock("cyan_snout",
            new CyanSnoutWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_SNOUT = registerBlock("gray_snout",
            new GraySnoutWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_SNOUT = registerBlock("green_snout",
            new GreenSnoutWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_SNOUT = registerBlock("light_blue_snout",
            new LightBlueSnoutWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_SNOUT = registerBlock("light_gray_snout",
            new LightGraySnoutWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_SNOUT = registerBlock("lime_snout",
            new LimeSnoutWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_SNOUT = registerBlock("magenta_snout",
            new MagentaSnoutWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_SNOUT = registerBlock("orange_snout",
            new OrangeSnoutWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_SNOUT = registerBlock("pink_snout",
            new PinkSnoutWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_SNOUT = registerBlock("purple_snout",
            new PurpleSnoutWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block RED_SNOUT = registerBlock("red_snout",
            new RedSnoutWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_SNOUT = registerBlock("white_snout",
            new WhiteSnoutWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_SNOUT = registerBlock("yellow_snout",
            new YellowSnoutWallpaperBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOL)));

    public static final Block OAK_CIRCLE_WAINSCOTTING = registerBlock("oak_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block OAK_RECTANGLE_WAINSCOTTING = registerBlock("oak_rectangle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block OAK_ARCH_WAINSCOTTING = registerBlock("oak_arch_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block SPRUCE_CIRCLE_WAINSCOTTING = registerBlock("spruce_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block SPRUCE_RECTANGLE_WAINSCOTTING = registerBlock("spruce_rectangle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block SPRUCE_ARCH_WAINSCOTTING = registerBlock("spruce_arch_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BIRCH_CIRCLE_WAINSCOTTING = registerBlock("birch_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BIRCH_RECTANGLE_WAINSCOTTING = registerBlock("birch_rectangle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BIRCH_ARCH_WAINSCOTTING = registerBlock("birch_arch_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block JUNGLE_CIRCLE_WAINSCOTTING = registerBlock("jungle_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block JUNGLE_RECTANGLE_WAINSCOTTING = registerBlock("jungle_rectangle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block JUNGLE_ARCH_WAINSCOTTING = registerBlock("jungle_arch_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block ACACIA_CIRCLE_WAINSCOTTING = registerBlock("acacia_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block ACACIA_RECTANGLE_WAINSCOTTING = registerBlock("acacia_rectangle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block ACACIA_ARCH_WAINSCOTTING = registerBlock("acacia_arch_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block DARK_OAK_CIRCLE_WAINSCOTTING = registerBlock("dark_oak_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block DARK_OAK_RECTANGLE_WAINSCOTTING = registerBlock("dark_oak_rectangle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block DARK_OAK_ARCH_WAINSCOTTING = registerBlock("dark_oak_arch_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block MANGROVE_CIRCLE_WAINSCOTTING = registerBlock("mangrove_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block MANGROVE_RECTANGLE_WAINSCOTTING = registerBlock("mangrove_rectangle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block MANGROVE_ARCH_WAINSCOTTING = registerBlock("mangrove_arch_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CHERRY_CIRCLE_WAINSCOTTING = registerBlock("cherry_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CHERRY_RECTANGLE_WAINSCOTTING = registerBlock("cherry_rectangle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CHERRY_ARCH_WAINSCOTTING = registerBlock("cherry_arch_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BAMBOO_CIRCLE_WAINSCOTTING = registerBlock("bamboo_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BAMBOO_RECTANGLE_WAINSCOTTING = registerBlock("bamboo_rectangle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block BAMBOO_ARCH_WAINSCOTTING = registerBlock("bamboo_arch_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CRIMSON_CIRCLE_WAINSCOTTING = registerBlock("crimson_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CRIMSON_RECTANGLE_WAINSCOTTING = registerBlock("crimson_rectangle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block CRIMSON_ARCH_WAINSCOTTING = registerBlock("crimson_arch_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block WARPED_CIRCLE_WAINSCOTTING = registerBlock("warped_circle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block WARPED_RECTANGLE_WAINSCOTTING = registerBlock("warped_rectangle_wainscotting",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)));
    public static final Block WARPED_ARCH_WAINSCOTTING = registerBlock("warped_arch_wainscotting",
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
