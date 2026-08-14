package net.flamesparks4143.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.flamesparks4143.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.STEEL_BLOCK)
                .add(ModBlocks.STEEL_DOOR)
                .add(ModBlocks.STEEL_TRAPDOOR)
                .add(ModBlocks.STEEL_PRESSURE_PLATE)



                .add(ModBlocks.GOLD_DOOR)
                .add(ModBlocks.GOLD_TRAPDOOR)

                .add(ModBlocks.PORCELAIN_BLOCK)
                .add(ModBlocks.PORCELAIN_BRICKS)

                .add(ModBlocks.CRACKED_PORCELAIN_BRICKS)
                .add(ModBlocks.CHISELED_PORCELAIN)

                .add(ModBlocks.CHECKERED_PORCELAIN_WHITE_CONCRETE)
                .add(ModBlocks.CHECKERED_PORCELAIN_LIGHT_GRAY_CONCRETE)
                .add(ModBlocks.CHECKERED_PORCELAIN_GRAY_CONCRETE)
                .add(ModBlocks.CHECKERED_PORCELAIN_BLACK_CONCRETE)
                .add(ModBlocks.CHECKERED_PORCELAIN_BROWN_CONCRETE)
                .add(ModBlocks.CHECKERED_PORCELAIN_RED_CONCRETE)
                .add(ModBlocks.CHECKERED_PORCELAIN_ORANGE_CONCRETE)
                .add(ModBlocks.CHECKERED_PORCELAIN_YELLOW_CONCRETE)
                .add(ModBlocks.CHECKERED_PORCELAIN_LIME_CONCRETE)
                .add(ModBlocks.CHECKERED_PORCELAIN_GREEN_CONCRETE)
                .add(ModBlocks.CHECKERED_PORCELAIN_CYAN_CONCRETE)
                .add(ModBlocks.CHECKERED_PORCELAIN_LIGHT_BLUE_CONCRETE)
                .add(ModBlocks.CHECKERED_PORCELAIN_BLUE_CONCRETE)
                .add(ModBlocks.CHECKERED_PORCELAIN_PURPLE_CONCRETE)
                .add(ModBlocks.CHECKERED_PORCELAIN_MAGENTA_CONCRETE)
                .add(ModBlocks.CHECKERED_PORCELAIN_PINK_CONCRETE)

                .add(ModBlocks.STARRED_PORCELAIN_WHITE_CONCRETE)
                .add(ModBlocks.STARRED_PORCELAIN_LIGHT_GRAY_CONCRETE)
                .add(ModBlocks.STARRED_PORCELAIN_GRAY_CONCRETE)
                .add(ModBlocks.STARRED_PORCELAIN_BLACK_CONCRETE)
                .add(ModBlocks.STARRED_PORCELAIN_BROWN_CONCRETE)
                .add(ModBlocks.STARRED_PORCELAIN_RED_CONCRETE)
                .add(ModBlocks.STARRED_PORCELAIN_ORANGE_CONCRETE)
                .add(ModBlocks.STARRED_PORCELAIN_YELLOW_CONCRETE)
                .add(ModBlocks.STARRED_PORCELAIN_LIME_CONCRETE)
                .add(ModBlocks.STARRED_PORCELAIN_GREEN_CONCRETE)
                .add(ModBlocks.STARRED_PORCELAIN_CYAN_CONCRETE)
                .add(ModBlocks.STARRED_PORCELAIN_LIGHT_BLUE_CONCRETE)
                .add(ModBlocks.STARRED_PORCELAIN_BLUE_CONCRETE)
                .add(ModBlocks.STARRED_PORCELAIN_PURPLE_CONCRETE)
                .add(ModBlocks.STARRED_PORCELAIN_MAGENTA_CONCRETE)
                .add(ModBlocks.STARRED_PORCELAIN_PINK_CONCRETE)

                .add(ModBlocks.CHECKERED_PORCELAIN_TERRACOTTA)
                .add(ModBlocks.CHECKERED_PORCELAIN_WHITE_TERRACOTTA)
                .add(ModBlocks.CHECKERED_PORCELAIN_LIGHT_GRAY_TERRACOTTA)
                .add(ModBlocks.CHECKERED_PORCELAIN_GRAY_TERRACOTTA)
                .add(ModBlocks.CHECKERED_PORCELAIN_BLACK_TERRACOTTA)
                .add(ModBlocks.CHECKERED_PORCELAIN_BROWN_TERRACOTTA)
                .add(ModBlocks.CHECKERED_PORCELAIN_RED_TERRACOTTA)
                .add(ModBlocks.CHECKERED_PORCELAIN_ORANGE_TERRACOTTA)
                .add(ModBlocks.CHECKERED_PORCELAIN_YELLOW_TERRACOTTA)
                .add(ModBlocks.CHECKERED_PORCELAIN_LIME_TERRACOTTA)
                .add(ModBlocks.CHECKERED_PORCELAIN_GREEN_TERRACOTTA)
                .add(ModBlocks.CHECKERED_PORCELAIN_CYAN_TERRACOTTA)
                .add(ModBlocks.CHECKERED_PORCELAIN_LIGHT_BLUE_TERRACOTTA)
                .add(ModBlocks.CHECKERED_PORCELAIN_BLUE_TERRACOTTA)
                .add(ModBlocks.CHECKERED_PORCELAIN_PURPLE_TERRACOTTA)
                .add(ModBlocks.CHECKERED_PORCELAIN_MAGENTA_TERRACOTTA)
                .add(ModBlocks.CHECKERED_PORCELAIN_PINK_TERRACOTTA)

                .add(ModBlocks.STARRED_PORCELAIN_TERRACOTTA)
                .add(ModBlocks.STARRED_PORCELAIN_WHITE_TERRACOTTA)
                .add(ModBlocks.STARRED_PORCELAIN_LIGHT_GRAY_TERRACOTTA)
                .add(ModBlocks.STARRED_PORCELAIN_GRAY_TERRACOTTA)
                .add(ModBlocks.STARRED_PORCELAIN_BLACK_TERRACOTTA)
                .add(ModBlocks.STARRED_PORCELAIN_BROWN_TERRACOTTA)
                .add(ModBlocks.STARRED_PORCELAIN_RED_TERRACOTTA)
                .add(ModBlocks.STARRED_PORCELAIN_ORANGE_TERRACOTTA)
                .add(ModBlocks.STARRED_PORCELAIN_YELLOW_TERRACOTTA)
                .add(ModBlocks.STARRED_PORCELAIN_LIME_TERRACOTTA)
                .add(ModBlocks.STARRED_PORCELAIN_GREEN_TERRACOTTA)
                .add(ModBlocks.STARRED_PORCELAIN_CYAN_TERRACOTTA)
                .add(ModBlocks.STARRED_PORCELAIN_LIGHT_BLUE_TERRACOTTA)
                .add(ModBlocks.STARRED_PORCELAIN_BLUE_TERRACOTTA)
                .add(ModBlocks.STARRED_PORCELAIN_PURPLE_TERRACOTTA)
                .add(ModBlocks.STARRED_PORCELAIN_MAGENTA_TERRACOTTA)
                .add(ModBlocks.STARRED_PORCELAIN_PINK_TERRACOTTA)
                .add(ModBlocks.ANDESITE_PILLAR)
                .add(ModBlocks.GILDED_BLACKSTONE_PILLAR)
                .add(ModBlocks.BLACKSTONE_PILLAR)
                .add(ModBlocks.CALCITE_PILLAR)
                .add(ModBlocks.PORCELAIN_PILLAR)
                .add(ModBlocks.DEEPSLATE_PILLAR)
                .add(ModBlocks.DIORITE_PILLAR)
                .add(ModBlocks.GRANITE_PILLAR)
                .add(ModBlocks.BASALT_PILLAR)
                .add(ModBlocks.END_STONE_PILLAR)
                .add(ModBlocks.TUFF_PILLAR)
                .add(ModBlocks.STONE_PILLAR);


        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.BLANK_WALL)
                .add(ModBlocks.BLACK_CHAIN_LINKS_WALLPAPER)


                .add(ModBlocks.OAK_CIRCLE_WAINSCOTTING)
                .add(ModBlocks.OAK_CORNERS_WAINSCOTTING)
                .add(ModBlocks.OAK_LINES_WAINSCOTTING)
                .add(ModBlocks.OAK_SQUARE_WAINSCOTTING)

                .add(ModBlocks.SPRUCE_CIRCLE_WAINSCOTTING)
                .add(ModBlocks.SPRUCE_CORNERS_WAINSCOTTING)
                .add(ModBlocks.SPRUCE_LINES_WAINSCOTTING)
                .add(ModBlocks.SPRUCE_SQUARE_WAINSCOTTING)

                .add(ModBlocks.BIRCH_CIRCLE_WAINSCOTTING)
                .add(ModBlocks.BIRCH_CORNERS_WAINSCOTTING)
                .add(ModBlocks.BIRCH_LINES_WAINSCOTTING)
                .add(ModBlocks.BIRCH_SQUARE_WAINSCOTTING)

                .add(ModBlocks.JUNGLE_CIRCLE_WAINSCOTTING)
                .add(ModBlocks.JUNGLE_CORNERS_WAINSCOTTING)
                .add(ModBlocks.JUNGLE_LINES_WAINSCOTTING)
                .add(ModBlocks.JUNGLE_SQUARE_WAINSCOTTING)

                .add(ModBlocks.ACACIA_CIRCLE_WAINSCOTTING)
                .add(ModBlocks.ACACIA_CORNERS_WAINSCOTTING)
                .add(ModBlocks.ACACIA_LINES_WAINSCOTTING)
                .add(ModBlocks.ACACIA_SQUARE_WAINSCOTTING)

                .add(ModBlocks.DARK_OAK_CIRCLE_WAINSCOTTING)
                .add(ModBlocks.DARK_OAK_CORNERS_WAINSCOTTING)
                .add(ModBlocks.DARK_OAK_LINES_WAINSCOTTING)
                .add(ModBlocks.DARK_OAK_SQUARE_WAINSCOTTING)

                .add(ModBlocks.MANGROVE_CIRCLE_WAINSCOTTING)
                .add(ModBlocks.MANGROVE_CORNERS_WAINSCOTTING)
                .add(ModBlocks.MANGROVE_LINES_WAINSCOTTING)
                .add(ModBlocks.MANGROVE_SQUARE_WAINSCOTTING)

                .add(ModBlocks.CHERRY_CIRCLE_WAINSCOTTING)
                .add(ModBlocks.CHERRY_CORNERS_WAINSCOTTING)
                .add(ModBlocks.CHERRY_LINES_WAINSCOTTING)
                .add(ModBlocks.CHERRY_SQUARE_WAINSCOTTING)

                .add(ModBlocks.BAMBOO_CIRCLE_WAINSCOTTING)
                .add(ModBlocks.BAMBOO_CORNERS_WAINSCOTTING)
                .add(ModBlocks.BAMBOO_LINES_WAINSCOTTING)
                .add(ModBlocks.BAMBOO_SQUARE_WAINSCOTTING)

                .add(ModBlocks.CRIMSON_CIRCLE_WAINSCOTTING)
                .add(ModBlocks.CRIMSON_CORNERS_WAINSCOTTING)
                .add(ModBlocks.CRIMSON_LINES_WAINSCOTTING)
                .add(ModBlocks.CRIMSON_SQUARE_WAINSCOTTING)

                .add(ModBlocks.WARPED_CIRCLE_WAINSCOTTING)
                .add(ModBlocks.WARPED_CORNERS_WAINSCOTTING)
                .add(ModBlocks.WARPED_LINES_WAINSCOTTING)
                .add(ModBlocks.WARPED_SQUARE_WAINSCOTTING);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.STEEL_BLOCK);

    }
}
