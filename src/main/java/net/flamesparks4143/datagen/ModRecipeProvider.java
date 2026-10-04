package net.flamesparks4143.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.flamesparks4143.block.ModBlocks;
import net.flamesparks4143.item.ModItems;
import net.flamesparks4143.victorian_madess.FlamesVictorianMadness;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.*;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> STEEL_SMELTABLES = List.of(Items.IRON_INGOT);
    private static final List<ItemConvertible> PORCELAIN_SMELTABLES = List.of(ModItems.RAW_PORCELAIN);
    private static final List<ItemConvertible> PORCELAIN_BRICKS_SMELTABLES = List.of(ModBlocks.PORCELAIN_BRICKS);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerBlasting(exporter, STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.STEEL_INGOT,
                0.0f, 125, "steel");
        offerSmelting(exporter, PORCELAIN_SMELTABLES, RecipeCategory.MISC, ModItems.PORCELAIN_BRICK,
                0.0f, 200, "porcelain");
        offerSmelting(exporter, PORCELAIN_BRICKS_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PORCELAIN_BRICKS,
                0.0f, 200, "porcelain");



        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_RAPIER, 1)
                .pattern("  #")
                .pattern(" # ")
                .pattern("|  ")
                .input('#', Items.IRON_INGOT)
                .input('|', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_RAPIER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLD_RAPIER, 1)
                .pattern("  #")
                .pattern(" # ")
                .pattern("|  ")
                .input('#', Items.GOLD_INGOT)
                .input('|', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLD_RAPIER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_RAPIER, 1)
                .pattern("  #")
                .pattern(" # ")
                .pattern("|  ")
                .input('#', Items.COPPER_INGOT)
                .input('|', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_RAPIER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_RAPIER, 1)
                .pattern("  #")
                .pattern(" # ")
                .pattern("|  ")
                .input('#', ModItems.STEEL_INGOT)
                .input('|', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_RAPIER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_RAPIER, 1)
                .pattern("  #")
                .pattern(" # ")
                .pattern("|  ")
                .input('#', Items.DIAMOND)
                .input('|', Items.STICK)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_RAPIER)));
       // offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_RAPIER, RecipeCategory.COMBAT, ModItems.NETHERITE_RAPIER);
          offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_RAPIER, RecipeCategory.COMBAT, ModItems.NETHERITE_RAPIER);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SHORT_PONEY_BUSH, 4)
                .pattern("## ")
                .input('#', Blocks.PEONY)
                .criterion(hasItem(Blocks.PEONY), conditionsFromItem(Blocks.PEONY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SHORT_PONEY_BUSH)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SHORT_ROSE_BUSH, 4)
                .pattern("## ")
                .input('#', Blocks.ROSE_BUSH)
                .criterion(hasItem(Blocks.ROSE_BUSH), conditionsFromItem(Blocks.ROSE_BUSH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SHORT_ROSE_BUSH)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SHORT_LILAC, 4)
                .pattern("## ")
                .input('#', Blocks.LILAC)
                .criterion(hasItem(Blocks.LILAC), conditionsFromItem(Blocks.LILAC))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SHORT_LILAC)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WHITE_DYE, 2)
                        .input(ModBlocks.WHITE_FOXGLOVES)
                                .criterion(hasItem(ModBlocks.WHITE_FOXGLOVES), conditionsFromItem(ModBlocks.WHITE_FOXGLOVES))
                .offerTo(exporter, new Identifier
                        (FlamesVictorianMadness.MOD_ID,getItemPath(Items.WHITE_DYE)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE, 2)
                        .input(ModBlocks.PURPLE_FOXGLOVES)
                                .criterion(hasItem(ModBlocks.PURPLE_FOXGLOVES), conditionsFromItem(ModBlocks.PURPLE_FOXGLOVES))
                .offerTo(exporter, new Identifier
                        (FlamesVictorianMadness.MOD_ID,getItemPath(Items.PURPLE_DYE)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLUE_DYE, 2)
                        .input(ModBlocks.BLUE_FOXGLOVES)
                                .criterion(hasItem(ModBlocks.BLUE_FOXGLOVES), conditionsFromItem(ModBlocks.BLUE_FOXGLOVES))
                .offerTo(exporter, new Identifier
                        (FlamesVictorianMadness.MOD_ID,getItemPath(Items.BLUE_DYE)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE, 2)
                        .input(ModBlocks.PINK_FOXGLOVES)
                                .criterion(hasItem(ModBlocks.PINK_FOXGLOVES), conditionsFromItem(ModBlocks.PINK_FOXGLOVES))
                .offerTo(exporter, new Identifier
                        (FlamesVictorianMadness.MOD_ID,getItemPath(Items.PINK_DYE)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE, 1)
                        .input(ModBlocks.FORGET_ME_NOTS)
                                .criterion(hasItem(ModBlocks.FORGET_ME_NOTS), conditionsFromItem(ModBlocks.FORGET_ME_NOTS))
                .offerTo(exporter, new Identifier
                        (FlamesVictorianMadness.MOD_ID,getItemPath(Items.LIGHT_BLUE_DYE)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE, 1)
                        .input(ModBlocks.PURPLE_EYE_DAISY)
                                .criterion(hasItem(ModBlocks.PURPLE_EYE_DAISY), conditionsFromItem(ModBlocks.PURPLE_EYE_DAISY))
                .offerTo(exporter, new Identifier
                        (FlamesVictorianMadness.MOD_ID,getItemPath(Items.YELLOW_DYE)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RED_DYE, 1)
                        .input(ModBlocks.SHORT_ROSE_BUSH)
                                .criterion(hasItem(ModBlocks.SHORT_ROSE_BUSH), conditionsFromItem(ModBlocks.SHORT_ROSE_BUSH))
                .offerTo(exporter, new Identifier
                        (FlamesVictorianMadness.MOD_ID,getItemPath(Items.RED_DYE)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MAGENTA_DYE, 1)
                        .input(ModBlocks.SHORT_LILAC)
                                .criterion(hasItem(ModBlocks.SHORT_LILAC), conditionsFromItem(ModBlocks.SHORT_LILAC))
                .offerTo(exporter, new Identifier
                        (FlamesVictorianMadness.MOD_ID,getItemPath(Items.MAGENTA_DYE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BLOCK, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STEEL_BLOCK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_INGOT, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.STEEL_NUGGET)
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_INGOT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_DOOR_FLOWER, 1)
                .pattern("!#")
                .input('#', ModBlocks.FLOWER_PANE)
                .input('!', Blocks.OAK_DOOR)
                .criterion(hasItem(ModBlocks.FLOWER_PANE), conditionsFromItem(ModBlocks.FLOWER_PANE))
                .criterion(hasItem(Blocks.OAK_DOOR), conditionsFromItem(Blocks.OAK_DOOR))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OAK_DOOR_FLOWER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_DOOR_MOON, 1)
                .pattern("!#")
                .input('#', ModBlocks.MOON_PANE)
                .input('!', Blocks.OAK_DOOR)
                .criterion(hasItem(ModBlocks.MOON_PANE), conditionsFromItem(ModBlocks.MOON_PANE))
                .criterion(hasItem(Blocks.OAK_DOOR), conditionsFromItem(Blocks.OAK_DOOR))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OAK_DOOR_MOON)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_DOOR_SUN, 1)
                .pattern("!#")
                .input('#', ModBlocks.SUN_PANE)
                .input('!', Blocks.OAK_DOOR)
                .criterion(hasItem(ModBlocks.SUN_PANE), conditionsFromItem(ModBlocks.SUN_PANE))
                .criterion(hasItem(Blocks.OAK_DOOR), conditionsFromItem(Blocks.OAK_DOOR))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OAK_DOOR_SUN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GOLD_DOOR, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.GOLD_INGOT)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GOLD_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GOLD_TRAPDOOR, 1)
                .pattern("##")
                .pattern("##")
                .input('#', Items.GOLD_INGOT)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GOLD_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STEEL_DOOR, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STEEL_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLANK_WALL, 2)
                .pattern("|#|")
                .pattern("|#|")
                .pattern("|#|")
                .input('#', Blocks.WHITE_WOOL)
                .input('|', Items.STICK)
                .criterion(hasItem(Blocks.WHITE_WOOL), conditionsFromItem(Blocks.WHITE_WOOL))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLANK_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORCELAIN_BRICKS_SLAB, 6)
                .pattern("###")
                .input('#', ModBlocks.PORCELAIN_BRICKS)
                .criterion(hasItem(ModBlocks.PORCELAIN_BRICKS), conditionsFromItem(ModBlocks.PORCELAIN_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PORCELAIN_BRICKS_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORCELAIN_BRICKS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ModBlocks.PORCELAIN_BRICKS)
                .criterion(hasItem(ModBlocks.PORCELAIN_BRICKS), conditionsFromItem(ModBlocks.PORCELAIN_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PORCELAIN_BRICKS_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORCELAIN_BRICKS_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.PORCELAIN_BRICKS)
                .criterion(hasItem(ModBlocks.PORCELAIN_BRICKS), conditionsFromItem(ModBlocks.PORCELAIN_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PORCELAIN_BRICKS_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORCELAIN_SLAB, 6)
                .pattern("###")
                .input('#', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PORCELAIN_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORCELAIN_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PORCELAIN_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORCELAIN_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PORCELAIN_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STEEL_TRAPDOOR, 1)
                .pattern("##")
                .pattern("##")
                .input('#', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STEEL_TRAPDOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_SLAB, 6)
                .pattern("###")
                .input('#', ModBlocks.STEEL_BLOCK)
                .criterion(hasItem(ModBlocks.STEEL_BLOCK), conditionsFromItem(ModBlocks.STEEL_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STEEL_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ModBlocks.STEEL_BLOCK)
                .criterion(hasItem(ModBlocks.STEEL_BLOCK), conditionsFromItem(ModBlocks.STEEL_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STEEL_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STEEL_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STEEL_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CHISEL, 1)
                .pattern("X")
                .pattern("#")
                .input('#', Items.STICK)
                .input('X', Blocks.STONE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHISEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GLASS_CUTTER, 1)
                .pattern("X")
                .pattern("#")
                .input('#', Items.STICK)
                .input('X', ModItems.STEEL_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GLASS_CUTTER)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORCELAIN_BRICKS, ModBlocks.PORCELAIN_BLOCK, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PORCELAIN, ModBlocks.PORCELAIN_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORCELAIN_BRICKS_SLAB, ModBlocks.PORCELAIN_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORCELAIN_BRICKS_STAIRS, ModBlocks.PORCELAIN_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORCELAIN_BRICKS_WALL, ModBlocks.PORCELAIN_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORCELAIN_SLAB, ModBlocks.PORCELAIN_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORCELAIN_STAIRS, ModBlocks.PORCELAIN_BLOCK, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORCELAIN_WALL, ModBlocks.PORCELAIN_BLOCK, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORCELAIN_PILLAR, ModBlocks.PORCELAIN_BLOCK, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_PILLAR, Blocks.STONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_PILLAR, Blocks.CALCITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_PILLAR, Blocks.TUFF, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_PILLAR, Blocks.END_STONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_PILLAR, Blocks.GILDED_BLACKSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_PILLAR, Blocks.POLISHED_BLACKSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASALT_PILLAR, Blocks.POLISHED_BASALT, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_PILLAR, Blocks.POLISHED_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_PILLAR, Blocks.POLISHED_GRANITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_PILLAR, Blocks.POLISHED_DIORITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_PILLAR, Blocks.POLISHED_ANDESITE, 1);


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORCELAIN_PILLAR, 1)
                .pattern("#")
                .pattern("#")
                .input('#', ModBlocks.PORCELAIN_SLAB)
                .criterion(hasItem(ModBlocks.PORCELAIN_SLAB), conditionsFromItem(ModBlocks.PORCELAIN_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PORCELAIN_PILLAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_PILLAR, 1)
                .pattern("#")
                .pattern("#")
                .input('#', Blocks.STONE_SLAB)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONE_PILLAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_PILLAR, 2)
                .pattern("#")
                .pattern("#")
                .input('#', Blocks.CALCITE)
                .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CALCITE_PILLAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_PILLAR, 2)
                .pattern("#")
                .pattern("#")
                .input('#', Blocks.TUFF)
                .criterion(hasItem(Blocks.TUFF), conditionsFromItem(Blocks.TUFF))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TUFF_PILLAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_PILLAR, 2)
                .pattern("#")
                .pattern("#")
                .input('#', Blocks.END_STONE)
                .criterion(hasItem(Blocks.END_STONE), conditionsFromItem(Blocks.END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.END_STONE_PILLAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKSTONE_PILLAR, 1)
                .pattern("#")
                .pattern("#")
                .input('#', Blocks.BLACKSTONE_SLAB)
                .criterion(hasItem(Blocks.BLACKSTONE_SLAB), conditionsFromItem(Blocks.BLACKSTONE_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACKSTONE_PILLAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASALT_PILLAR, 2)
                .pattern("#")
                .pattern("#")
                .input('#', Blocks.POLISHED_BASALT)
                .criterion(hasItem(Blocks.POLISHED_BASALT), conditionsFromItem(Blocks.POLISHED_BASALT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BASALT_PILLAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_PILLAR, 1)
                .pattern("#")
                .pattern("#")
                .input('#', Blocks.POLISHED_DEEPSLATE_SLAB)
                .criterion(hasItem(Blocks.POLISHED_DEEPSLATE_SLAB), conditionsFromItem(Blocks.POLISHED_DEEPSLATE_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPSLATE_PILLAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_PILLAR, 1)
                .pattern("#")
                .pattern("#")
                .input('#', Blocks.POLISHED_GRANITE_SLAB)
                .criterion(hasItem(Blocks.POLISHED_GRANITE_SLAB), conditionsFromItem(Blocks.POLISHED_GRANITE_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRANITE_PILLAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_PILLAR, 1)
                .pattern("#")
                .pattern("#")
                .input('#', Blocks.POLISHED_DIORITE_SLAB)
                .criterion(hasItem(Blocks.POLISHED_DIORITE_SLAB), conditionsFromItem(Blocks.POLISHED_DIORITE_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DIORITE_PILLAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_PILLAR, 1)
                .pattern("#")
                .pattern("#")
                .input('#', Blocks.POLISHED_ANDESITE_SLAB)
                .criterion(hasItem(Blocks.POLISHED_ANDESITE_SLAB), conditionsFromItem(Blocks.POLISHED_ANDESITE_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANDESITE_PILLAR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORCELAIN_BLOCK, 1)
                .pattern("##")
                .pattern("##")
                .input('#', ModItems.PORCELAIN_BRICK)
                .criterion(hasItem(ModItems.PORCELAIN_BRICK), conditionsFromItem(ModItems.PORCELAIN_BRICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PORCELAIN_BLOCK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORCELAIN_BRICKS, 4)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PORCELAIN_BRICKS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_PORCELAIN, 2)
                .pattern("#$")
                .pattern("$#")
                .input('#', Items.CLAY_BALL)
                .input('$', Items.BONE)
                .criterion(hasItem(Items.CLAY_BALL), conditionsFromItem(Items.CLAY_BALL))
                .criterion(hasItem(Items.BONE), conditionsFromItem(Items.BONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAW_PORCELAIN)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_WHITE_CONCRETE, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.WHITE_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.WHITE_CONCRETE), conditionsFromItem(Items.WHITE_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_WHITE_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_LIGHT_GRAY_CONCRETE, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.LIGHT_GRAY_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.LIGHT_GRAY_CONCRETE), conditionsFromItem(Items.LIGHT_GRAY_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_LIGHT_GRAY_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_GRAY_CONCRETE, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.GRAY_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.GRAY_CONCRETE), conditionsFromItem(Items.GRAY_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_GRAY_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_BLACK_CONCRETE, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.BLACK_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.BLACK_CONCRETE), conditionsFromItem(Items.BLACK_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_BLACK_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_BROWN_CONCRETE, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.BROWN_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.BROWN_CONCRETE), conditionsFromItem(Items.BROWN_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_BROWN_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_RED_CONCRETE, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.RED_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.RED_CONCRETE), conditionsFromItem(Items.RED_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_RED_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_ORANGE_CONCRETE, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.ORANGE_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.ORANGE_CONCRETE), conditionsFromItem(Items.ORANGE_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_ORANGE_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_YELLOW_CONCRETE, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.YELLOW_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.YELLOW_CONCRETE), conditionsFromItem(Items.YELLOW_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_YELLOW_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_LIME_CONCRETE, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.LIME_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.LIME_CONCRETE), conditionsFromItem(Items.LIME_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_LIME_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_GREEN_CONCRETE, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.GREEN_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.GREEN_CONCRETE), conditionsFromItem(Items.GREEN_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_GREEN_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_CYAN_CONCRETE, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.CYAN_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.CYAN_CONCRETE), conditionsFromItem(Items.CYAN_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_CYAN_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_LIGHT_BLUE_CONCRETE, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.LIGHT_BLUE_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.LIGHT_BLUE_CONCRETE), conditionsFromItem(Items.LIGHT_BLUE_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_LIGHT_BLUE_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_BLUE_CONCRETE, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.BLUE_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.BLUE_CONCRETE), conditionsFromItem(Items.BLUE_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_BLUE_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_PURPLE_CONCRETE, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.PURPLE_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.PURPLE_CONCRETE), conditionsFromItem(Items.PURPLE_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_PURPLE_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_MAGENTA_CONCRETE, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.MAGENTA_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.MAGENTA_CONCRETE), conditionsFromItem(Items.MAGENTA_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_MAGENTA_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_PINK_CONCRETE, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.PINK_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.PINK_CONCRETE), conditionsFromItem(Items.PINK_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_PINK_CONCRETE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_WHITE_CONCRETE, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.WHITE_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.WHITE_CONCRETE), conditionsFromItem(Items.WHITE_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_WHITE_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_LIGHT_GRAY_CONCRETE, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.LIGHT_GRAY_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.LIGHT_GRAY_CONCRETE), conditionsFromItem(Items.LIGHT_GRAY_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_LIGHT_GRAY_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_GRAY_CONCRETE, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.GRAY_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.GRAY_CONCRETE), conditionsFromItem(Items.GRAY_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_GRAY_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_BLACK_CONCRETE, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.BLACK_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.BLACK_CONCRETE), conditionsFromItem(Items.BLACK_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_BLACK_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_BROWN_CONCRETE, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.BROWN_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.BROWN_CONCRETE), conditionsFromItem(Items.BROWN_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_BROWN_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_RED_CONCRETE, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.RED_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.RED_CONCRETE), conditionsFromItem(Items.RED_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_RED_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_ORANGE_CONCRETE, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.ORANGE_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.ORANGE_CONCRETE), conditionsFromItem(Items.ORANGE_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_ORANGE_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_YELLOW_CONCRETE, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.YELLOW_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.YELLOW_CONCRETE), conditionsFromItem(Items.YELLOW_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_YELLOW_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_LIME_CONCRETE, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.LIME_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.LIME_CONCRETE), conditionsFromItem(Items.LIME_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_LIME_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_GREEN_CONCRETE, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.GREEN_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.GREEN_CONCRETE), conditionsFromItem(Items.GREEN_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_GREEN_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_CYAN_CONCRETE, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.CYAN_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.CYAN_CONCRETE), conditionsFromItem(Items.CYAN_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_CYAN_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_LIGHT_BLUE_CONCRETE, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.LIGHT_BLUE_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.LIGHT_BLUE_CONCRETE), conditionsFromItem(Items.LIGHT_BLUE_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_LIGHT_BLUE_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_BLUE_CONCRETE, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.BLUE_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.BLUE_CONCRETE), conditionsFromItem(Items.BLUE_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_BLUE_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_PURPLE_CONCRETE, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.PURPLE_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.PURPLE_CONCRETE), conditionsFromItem(Items.PURPLE_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_PURPLE_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_MAGENTA_CONCRETE, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.MAGENTA_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.MAGENTA_CONCRETE), conditionsFromItem(Items.MAGENTA_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_MAGENTA_CONCRETE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_PINK_CONCRETE, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.PINK_CONCRETE)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.PINK_CONCRETE), conditionsFromItem(Items.PINK_CONCRETE))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_PINK_CONCRETE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.TERRACOTTA), conditionsFromItem(Items.TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_WHITE_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.WHITE_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.WHITE_TERRACOTTA), conditionsFromItem(Items.WHITE_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_WHITE_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_LIGHT_GRAY_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.LIGHT_GRAY_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.LIGHT_GRAY_TERRACOTTA), conditionsFromItem(Items.LIGHT_GRAY_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_LIGHT_GRAY_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_GRAY_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.GRAY_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.GRAY_TERRACOTTA), conditionsFromItem(Items.GRAY_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_GRAY_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_BLACK_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.BLACK_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.BLACK_TERRACOTTA), conditionsFromItem(Items.BLACK_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_BLACK_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_BROWN_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.BROWN_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.BROWN_TERRACOTTA), conditionsFromItem(Items.BROWN_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_BROWN_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_RED_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.RED_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.RED_TERRACOTTA), conditionsFromItem(Items.RED_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_RED_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_ORANGE_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.ORANGE_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.ORANGE_TERRACOTTA), conditionsFromItem(Items.ORANGE_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_ORANGE_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_YELLOW_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.YELLOW_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.YELLOW_TERRACOTTA), conditionsFromItem(Items.YELLOW_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_YELLOW_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_LIME_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.LIME_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.LIME_TERRACOTTA), conditionsFromItem(Items.LIME_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_LIME_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_GREEN_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.GREEN_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.GREEN_TERRACOTTA), conditionsFromItem(Items.GREEN_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_GREEN_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_CYAN_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.CYAN_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.CYAN_TERRACOTTA), conditionsFromItem(Items.CYAN_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_CYAN_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_LIGHT_BLUE_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.LIGHT_BLUE_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.LIGHT_BLUE_TERRACOTTA), conditionsFromItem(Items.LIGHT_BLUE_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_LIGHT_BLUE_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_BLUE_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.BLUE_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.BLUE_TERRACOTTA), conditionsFromItem(Items.BLUE_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_BLUE_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_PURPLE_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.PURPLE_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.PURPLE_TERRACOTTA), conditionsFromItem(Items.PURPLE_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_PURPLE_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_MAGENTA_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.MAGENTA_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.MAGENTA_TERRACOTTA), conditionsFromItem(Items.MAGENTA_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_MAGENTA_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERED_PORCELAIN_PINK_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("%#")
                .input('#', Items.PINK_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.PINK_TERRACOTTA), conditionsFromItem(Items.PINK_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHECKERED_PORCELAIN_PINK_TERRACOTTA)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.TERRACOTTA), conditionsFromItem(Items.TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_WHITE_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.WHITE_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.WHITE_TERRACOTTA), conditionsFromItem(Items.WHITE_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_WHITE_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_LIGHT_GRAY_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.LIGHT_GRAY_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.LIGHT_GRAY_TERRACOTTA), conditionsFromItem(Items.LIGHT_GRAY_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_LIGHT_GRAY_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_GRAY_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.GRAY_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.GRAY_TERRACOTTA), conditionsFromItem(Items.GRAY_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_GRAY_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_BLACK_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.BLACK_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.BLACK_TERRACOTTA), conditionsFromItem(Items.BLACK_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_BLACK_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_BROWN_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.BROWN_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.BROWN_TERRACOTTA), conditionsFromItem(Items.BROWN_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_BROWN_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_RED_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.RED_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.RED_TERRACOTTA), conditionsFromItem(Items.RED_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_RED_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_ORANGE_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.ORANGE_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.ORANGE_TERRACOTTA), conditionsFromItem(Items.ORANGE_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_ORANGE_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_YELLOW_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.YELLOW_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.YELLOW_TERRACOTTA), conditionsFromItem(Items.YELLOW_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_YELLOW_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_LIME_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.LIME_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.LIME_TERRACOTTA), conditionsFromItem(Items.LIME_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_LIME_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_GREEN_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.GREEN_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.GREEN_TERRACOTTA), conditionsFromItem(Items.GREEN_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_GREEN_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_CYAN_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.CYAN_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.CYAN_TERRACOTTA), conditionsFromItem(Items.CYAN_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_CYAN_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_LIGHT_BLUE_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.LIGHT_BLUE_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.LIGHT_BLUE_TERRACOTTA), conditionsFromItem(Items.LIGHT_BLUE_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_LIGHT_BLUE_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_BLUE_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.BLUE_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.BLUE_TERRACOTTA), conditionsFromItem(Items.BLUE_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_BLUE_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_PURPLE_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.PURPLE_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.PURPLE_TERRACOTTA), conditionsFromItem(Items.PURPLE_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_PURPLE_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_MAGENTA_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.MAGENTA_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.MAGENTA_TERRACOTTA), conditionsFromItem(Items.MAGENTA_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_MAGENTA_TERRACOTTA)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STARRED_PORCELAIN_PINK_TERRACOTTA, 4)
                .pattern("#%")
                .pattern("#%")
                .input('#', Items.PINK_TERRACOTTA)
                .input('%', ModBlocks.PORCELAIN_BLOCK)
                .criterion(hasItem(Items.PINK_TERRACOTTA), conditionsFromItem(Items.PINK_TERRACOTTA))
                .criterion(hasItem(ModBlocks.PORCELAIN_BLOCK), conditionsFromItem(ModBlocks.PORCELAIN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STARRED_PORCELAIN_PINK_TERRACOTTA)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CATHEDRAL_STAINED_GLASS, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', ModItems.STEEL_NUGGET)
                .input('%', Blocks.WHITE_STAINED_GLASS)
                .criterion(hasItem(Blocks.WHITE_STAINED_GLASS), conditionsFromItem(Blocks.WHITE_STAINED_GLASS))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_CATHEDRAL_STAINED_GLASS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CATHEDRAL_STAINED_GLASS, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', ModItems.STEEL_NUGGET)
                .input('%', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .criterion(hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS), conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GRAY_CATHEDRAL_STAINED_GLASS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CATHEDRAL_STAINED_GLASS, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', ModItems.STEEL_NUGGET)
                .input('%', Blocks.GRAY_STAINED_GLASS)
                .criterion(hasItem(Blocks.GRAY_STAINED_GLASS), conditionsFromItem(Blocks.GRAY_STAINED_GLASS))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRAY_CATHEDRAL_STAINED_GLASS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CATHEDRAL_STAINED_GLASS, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', ModItems.STEEL_NUGGET)
                .input('%', Blocks.BLACK_STAINED_GLASS)
                .criterion(hasItem(Blocks.BLACK_STAINED_GLASS), conditionsFromItem(Blocks.BLACK_STAINED_GLASS))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_CATHEDRAL_STAINED_GLASS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CATHEDRAL_STAINED_GLASS, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', ModItems.STEEL_NUGGET)
                .input('%', Blocks.BROWN_STAINED_GLASS)
                .criterion(hasItem(Blocks.BROWN_STAINED_GLASS), conditionsFromItem(Blocks.BROWN_STAINED_GLASS))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_CATHEDRAL_STAINED_GLASS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CATHEDRAL_STAINED_GLASS, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', ModItems.STEEL_NUGGET)
                .input('%', Blocks.RED_STAINED_GLASS)
                .criterion(hasItem(Blocks.RED_STAINED_GLASS), conditionsFromItem(Blocks.RED_STAINED_GLASS))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_CATHEDRAL_STAINED_GLASS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CATHEDRAL_STAINED_GLASS, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', ModItems.STEEL_NUGGET)
                .input('%', Blocks.ORANGE_STAINED_GLASS)
                .criterion(hasItem(Blocks.ORANGE_STAINED_GLASS), conditionsFromItem(Blocks.ORANGE_STAINED_GLASS))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_CATHEDRAL_STAINED_GLASS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CATHEDRAL_STAINED_GLASS, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', ModItems.STEEL_NUGGET)
                .input('%', Blocks.YELLOW_STAINED_GLASS)
                .criterion(hasItem(Blocks.YELLOW_STAINED_GLASS), conditionsFromItem(Blocks.YELLOW_STAINED_GLASS))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_CATHEDRAL_STAINED_GLASS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CATHEDRAL_STAINED_GLASS, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', ModItems.STEEL_NUGGET)
                .input('%', Blocks.LIME_STAINED_GLASS)
                .criterion(hasItem(Blocks.LIME_STAINED_GLASS), conditionsFromItem(Blocks.LIME_STAINED_GLASS))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_CATHEDRAL_STAINED_GLASS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CATHEDRAL_STAINED_GLASS, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', ModItems.STEEL_NUGGET)
                .input('%', Blocks.GREEN_STAINED_GLASS)
                .criterion(hasItem(Blocks.GREEN_STAINED_GLASS), conditionsFromItem(Blocks.GREEN_STAINED_GLASS))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_CATHEDRAL_STAINED_GLASS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CATHEDRAL_STAINED_GLASS, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', ModItems.STEEL_NUGGET)
                .input('%', Blocks.CYAN_STAINED_GLASS)
                .criterion(hasItem(Blocks.CYAN_STAINED_GLASS), conditionsFromItem(Blocks.CYAN_STAINED_GLASS))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_CATHEDRAL_STAINED_GLASS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CATHEDRAL_STAINED_GLASS, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', ModItems.STEEL_NUGGET)
                .input('%', Blocks.BLUE_STAINED_GLASS)
                .criterion(hasItem(Blocks.BLUE_STAINED_GLASS), conditionsFromItem(Blocks.BLUE_STAINED_GLASS))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_CATHEDRAL_STAINED_GLASS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CATHEDRAL_STAINED_GLASS, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', ModItems.STEEL_NUGGET)
                .input('%', Blocks.BLUE_STAINED_GLASS)
                .criterion(hasItem(Blocks.BLUE_STAINED_GLASS), conditionsFromItem(Blocks.BLUE_STAINED_GLASS))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_CATHEDRAL_STAINED_GLASS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CATHEDRAL_STAINED_GLASS, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', ModItems.STEEL_NUGGET)
                .input('%', Blocks.PURPLE_STAINED_GLASS)
                .criterion(hasItem(Blocks.PURPLE_STAINED_GLASS), conditionsFromItem(Blocks.PURPLE_STAINED_GLASS))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_CATHEDRAL_STAINED_GLASS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CATHEDRAL_STAINED_GLASS, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', ModItems.STEEL_NUGGET)
                .input('%', Blocks.MAGENTA_STAINED_GLASS)
                .criterion(hasItem(Blocks.MAGENTA_STAINED_GLASS), conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_CATHEDRAL_STAINED_GLASS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CATHEDRAL_STAINED_GLASS, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', ModItems.STEEL_NUGGET)
                .input('%', Blocks.PINK_STAINED_GLASS)
                .criterion(hasItem(Blocks.PINK_STAINED_GLASS), conditionsFromItem(Blocks.PINK_STAINED_GLASS))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_CATHEDRAL_STAINED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CATHEDRAL_STAINED_PANE, 16)
                .pattern("%%%")
                .pattern("%%%")
                .input('%', ModBlocks.BLACK_CATHEDRAL_STAINED_GLASS)
                .criterion(hasItem(ModBlocks.BLACK_CATHEDRAL_STAINED_GLASS), conditionsFromItem(ModBlocks.BLACK_CATHEDRAL_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_CATHEDRAL_STAINED_PANE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_DIAMOND_STAINED_PANE, 16)
                .pattern("%%%")
                .pattern("%%%")
                .input('%', ModBlocks.BLACK_DIAMOND_STAINED_GLASS)
                .criterion(hasItem(ModBlocks.BLACK_DIAMOND_STAINED_GLASS), conditionsFromItem(ModBlocks.BLACK_DIAMOND_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_DIAMOND_STAINED_PANE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_EMERALD_STAINED_PANE, 16)
                .pattern("%%%")
                .pattern("%%%")
                .input('%', ModBlocks.BLACK_EMERALD_STAINED_GLASS)
                .criterion(hasItem(ModBlocks.BLACK_EMERALD_STAINED_GLASS), conditionsFromItem(ModBlocks.BLACK_EMERALD_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_EMERALD_STAINED_PANE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_SQUARE_STAINED_PANE, 16)
                .pattern("%%%")
                .pattern("%%%")
                .input('%', ModBlocks.BLACK_SQUARE_STAINED_GLASS)
                .criterion(hasItem(ModBlocks.BLACK_SQUARE_STAINED_GLASS), conditionsFromItem(ModBlocks.BLACK_SQUARE_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_SQUARE_STAINED_PANE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CATHEDRAL_STAINED_PANE, 16)
                .pattern("%%%")
                .pattern("%%%")
                .input('%', ModBlocks.BLUE_CATHEDRAL_STAINED_GLASS)
                .criterion(hasItem(ModBlocks.BLUE_CATHEDRAL_STAINED_GLASS), conditionsFromItem(ModBlocks.BLUE_CATHEDRAL_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_CATHEDRAL_STAINED_PANE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_DIAMOND_STAINED_PANE, 16)
                .pattern("%%%")
                .pattern("%%%")
                .input('%', ModBlocks.BLUE_DIAMOND_STAINED_GLASS)
                .criterion(hasItem(ModBlocks.BLUE_DIAMOND_STAINED_GLASS), conditionsFromItem(ModBlocks.BLUE_DIAMOND_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_DIAMOND_STAINED_PANE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_EMERALD_STAINED_PANE, 16)
                .pattern("%%%")
                .pattern("%%%")
                .input('%', ModBlocks.BLUE_EMERALD_STAINED_GLASS)
                .criterion(hasItem(ModBlocks.BLUE_EMERALD_STAINED_GLASS), conditionsFromItem(ModBlocks.BLUE_EMERALD_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_EMERALD_STAINED_PANE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_SQUARE_STAINED_PANE, 16)
                .pattern("%%%")
                .pattern("%%%")
                .input('%', ModBlocks.BLUE_SQUARE_STAINED_GLASS)
                .criterion(hasItem(ModBlocks.BLUE_SQUARE_STAINED_GLASS), conditionsFromItem(ModBlocks.BLUE_SQUARE_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_SQUARE_STAINED_PANE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_PATTERN_WOOL, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', Items.GOLD_NUGGET)
                .input('%', Blocks.BLACK_WOOL)
                .criterion(hasItem(Blocks.BLACK_WOOL), conditionsFromItem(Blocks.BLACK_WOOL))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_PATTERN_WOOL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_PATTERN_CARPET, 3)
                .pattern("%%")
                .input('%', ModBlocks.BLACK_PATTERN_WOOL)
                .criterion(hasItem(ModBlocks.BLACK_PATTERN_WOOL), conditionsFromItem(ModBlocks.BLACK_PATTERN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_PATTERN_CARPET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_PATTERN_WOOL, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', Items.GOLD_NUGGET)
                .input('%', Blocks.BLUE_WOOL)
                .criterion(hasItem(Blocks.BLUE_WOOL), conditionsFromItem(Blocks.BLUE_WOOL))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_PATTERN_WOOL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_PATTERN_CARPET, 3)
                .pattern("%%")
                .input('%', ModBlocks.BLUE_PATTERN_WOOL)
                .criterion(hasItem(ModBlocks.BLUE_PATTERN_WOOL), conditionsFromItem(ModBlocks.BLUE_PATTERN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_PATTERN_CARPET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_PATTERN_WOOL, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', Items.GOLD_NUGGET)
                .input('%', Blocks.WHITE_WOOL)
                .criterion(hasItem(Blocks.WHITE_WOOL), conditionsFromItem(Blocks.WHITE_WOOL))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_PATTERN_WOOL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_PATTERN_CARPET, 3)
                .pattern("%%")
                .input('%', ModBlocks.WHITE_PATTERN_WOOL)
                .criterion(hasItem(ModBlocks.WHITE_PATTERN_WOOL), conditionsFromItem(ModBlocks.WHITE_PATTERN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_PATTERN_CARPET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_PATTERN_WOOL, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', Items.GOLD_NUGGET)
                .input('%', Blocks.LIGHT_GRAY_WOOL)
                .criterion(hasItem(Blocks.LIGHT_GRAY_WOOL), conditionsFromItem(Blocks.LIGHT_GRAY_WOOL))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GRAY_PATTERN_WOOL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_PATTERN_CARPET, 3)
                .pattern("%%")
                .input('%', ModBlocks.LIGHT_GRAY_PATTERN_WOOL)
                .criterion(hasItem(ModBlocks.LIGHT_GRAY_PATTERN_WOOL), conditionsFromItem(ModBlocks.LIGHT_GRAY_PATTERN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GRAY_PATTERN_CARPET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_PATTERN_WOOL, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', Items.GOLD_NUGGET)
                .input('%', Blocks.GRAY_WOOL)
                .criterion(hasItem(Blocks.BLACK_WOOL), conditionsFromItem(Blocks.BLACK_WOOL))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRAY_PATTERN_WOOL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_PATTERN_CARPET, 3)
                .pattern("%%")
                .input('%', ModBlocks.GRAY_PATTERN_WOOL)
                .criterion(hasItem(ModBlocks.GRAY_PATTERN_WOOL), conditionsFromItem(ModBlocks.GRAY_PATTERN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRAY_PATTERN_CARPET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_PATTERN_WOOL, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', Items.GOLD_NUGGET)
                .input('%', Blocks.BROWN_WOOL)
                .criterion(hasItem(Blocks.BROWN_WOOL), conditionsFromItem(Blocks.BROWN_WOOL))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_PATTERN_WOOL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_PATTERN_CARPET, 3)
                .pattern("%%")
                .input('%', ModBlocks.BROWN_PATTERN_WOOL)
                .criterion(hasItem(ModBlocks.BROWN_PATTERN_WOOL), conditionsFromItem(ModBlocks.BROWN_PATTERN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_PATTERN_CARPET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_PATTERN_WOOL, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', Items.GOLD_NUGGET)
                .input('%', Blocks.RED_WOOL)
                .criterion(hasItem(Blocks.RED_WOOL), conditionsFromItem(Blocks.RED_WOOL))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_PATTERN_WOOL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_PATTERN_CARPET, 3)
                .pattern("%%")
                .input('%', ModBlocks.RED_PATTERN_WOOL)
                .criterion(hasItem(ModBlocks.RED_PATTERN_WOOL), conditionsFromItem(ModBlocks.RED_PATTERN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_PATTERN_CARPET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_PATTERN_WOOL, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', Items.GOLD_NUGGET)
                .input('%', Blocks.ORANGE_WOOL)
                .criterion(hasItem(Blocks.BLUE_WOOL), conditionsFromItem(Blocks.BLUE_WOOL))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_PATTERN_WOOL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_PATTERN_CARPET, 3)
                .pattern("%%")
                .input('%', ModBlocks.ORANGE_PATTERN_WOOL)
                .criterion(hasItem(ModBlocks.ORANGE_PATTERN_WOOL), conditionsFromItem(ModBlocks.ORANGE_PATTERN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_PATTERN_CARPET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_PATTERN_WOOL, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', Items.GOLD_NUGGET)
                .input('%', Blocks.YELLOW_WOOL)
                .criterion(hasItem(Blocks.YELLOW_WOOL), conditionsFromItem(Blocks.YELLOW_WOOL))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_PATTERN_WOOL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_PATTERN_CARPET, 3)
                .pattern("%%")
                .input('%', ModBlocks.YELLOW_PATTERN_WOOL)
                .criterion(hasItem(ModBlocks.YELLOW_PATTERN_WOOL), conditionsFromItem(ModBlocks.YELLOW_PATTERN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_PATTERN_CARPET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_PATTERN_WOOL, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', Items.GOLD_NUGGET)
                .input('%', Blocks.LIME_WOOL)
                .criterion(hasItem(Blocks.LIME_WOOL), conditionsFromItem(Blocks.LIME_WOOL))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_PATTERN_WOOL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_PATTERN_CARPET, 3)
                .pattern("%%")
                .input('%', ModBlocks.LIME_PATTERN_WOOL)
                .criterion(hasItem(ModBlocks.LIME_PATTERN_WOOL), conditionsFromItem(ModBlocks.LIME_PATTERN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_PATTERN_CARPET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_PATTERN_WOOL, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', Items.GOLD_NUGGET)
                .input('%', Blocks.GREEN_WOOL)
                .criterion(hasItem(Blocks.GREEN_WOOL), conditionsFromItem(Blocks.GREEN_WOOL))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_PATTERN_WOOL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_PATTERN_CARPET, 3)
                .pattern("%%")
                .input('%', ModBlocks.GREEN_PATTERN_WOOL)
                .criterion(hasItem(ModBlocks.GREEN_PATTERN_WOOL), conditionsFromItem(ModBlocks.GREEN_PATTERN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_PATTERN_CARPET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_PATTERN_WOOL, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', Items.GOLD_NUGGET)
                .input('%', Blocks.CYAN_WOOL)
                .criterion(hasItem(Blocks.CYAN_WOOL), conditionsFromItem(Blocks.CYAN_WOOL))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_PATTERN_WOOL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_PATTERN_CARPET, 3)
                .pattern("%%")
                .input('%', ModBlocks.CYAN_PATTERN_WOOL)
                .criterion(hasItem(ModBlocks.CYAN_PATTERN_WOOL), conditionsFromItem(ModBlocks.CYAN_PATTERN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_PATTERN_CARPET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_PATTERN_WOOL, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', Items.GOLD_NUGGET)
                .input('%', Blocks.LIGHT_BLUE_WOOL)
                .criterion(hasItem(Blocks.LIGHT_BLUE_WOOL), conditionsFromItem(Blocks.LIGHT_BLUE_WOOL))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_PATTERN_WOOL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_PATTERN_CARPET, 3)
                .pattern("%%")
                .input('%', ModBlocks.LIGHT_BLUE_PATTERN_WOOL)
                .criterion(hasItem(ModBlocks.LIGHT_BLUE_PATTERN_WOOL), conditionsFromItem(ModBlocks.LIGHT_BLUE_PATTERN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_PATTERN_CARPET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_PATTERN_WOOL, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', Items.GOLD_NUGGET)
                .input('%', Blocks.PURPLE_WOOL)
                .criterion(hasItem(Blocks.PURPLE_WOOL), conditionsFromItem(Blocks.PURPLE_WOOL))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_PATTERN_WOOL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_PATTERN_CARPET, 3)
                .pattern("%%")
                .input('%', ModBlocks.PURPLE_PATTERN_WOOL)
                .criterion(hasItem(ModBlocks.PURPLE_PATTERN_WOOL), conditionsFromItem(ModBlocks.PURPLE_PATTERN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_PATTERN_CARPET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_PATTERN_WOOL, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', Items.GOLD_NUGGET)
                .input('%', Blocks.MAGENTA_WOOL)
                .criterion(hasItem(Blocks.MAGENTA_WOOL), conditionsFromItem(Blocks.MAGENTA_WOOL))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_PATTERN_WOOL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_PATTERN_CARPET, 3)
                .pattern("%%")
                .input('%', ModBlocks.MAGENTA_PATTERN_WOOL)
                .criterion(hasItem(ModBlocks.MAGENTA_PATTERN_WOOL), conditionsFromItem(ModBlocks.MAGENTA_PATTERN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_PATTERN_CARPET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_PATTERN_WOOL, 4)
                .pattern("#%#")
                .pattern("%#%")
                .pattern("#%#")
                .input('#', Items.GOLD_NUGGET)
                .input('%', Blocks.PINK_WOOL)
                .criterion(hasItem(Blocks.PINK_WOOL), conditionsFromItem(Blocks.PINK_WOOL))
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_PATTERN_WOOL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_PATTERN_CARPET, 3)
                .pattern("%%")
                .input('%', ModBlocks.PINK_PATTERN_WOOL)
                .criterion(hasItem(ModBlocks.PINK_PATTERN_WOOL), conditionsFromItem(ModBlocks.PINK_PATTERN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_PATTERN_CARPET)));


    }

    private void offerReversibleCompactingRecipes(Consumer<RecipeJsonProvider> exporter, RecipeCategory recipeCategory, Item steelIngot, RecipeCategory recipeCategory1, Block steelBlock, String steelBlockFromIngots, String steelIngotFromBlock) {
    }

    private void offerMultipleOptions(Consumer<RecipeJsonProvider> exporter, RecipeSerializer<SmeltingRecipe> smelting, Block porcelainBricks, RecipeCategory recipeCategory, Block crackedPorcelainBricks, double v, int i, String porcelain) {
    }
}
