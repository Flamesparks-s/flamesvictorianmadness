package net.flamesparks4143.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.flamesparks4143.item.custom.*;
import net.flamesparks4143.victorian_madess.FlamesVictorianMadness;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item VICTORIAN_BANNER_PATTERN = registerItem("victorian_banner_pattern", new Item(new FabricItemSettings()));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new FabricItemSettings()));
    public static final Item RAW_PORCELAIN = registerItem("raw_porcelain", new Item(new FabricItemSettings()));
    public static final Item PORCELAIN_BRICK = registerItem("porcelain_brick", new Item(new FabricItemSettings()));
    public static final Item CHISEL = registerItem("chisel_tool", new ChiselTool(new Item.Settings().maxDamage(64)));

    public static final Item BLACK_CHAIN_LINK_PAPER = registerItem("black_chain_link_paper", new BlackChainLinkPaperItem(new Item.Settings()));
    public static final Item BLACK_CHECKERED_PAPER = registerItem("black_checkered_paper", new BlackCheckeredPaperItem(new Item.Settings()));
    public static final Item BLACK_CIRCULAR_PAPER = registerItem("black_circular_paper", new BlackCircularPaperItem(new Item.Settings()));
    public static final Item BLACK_CROSSED_PAPER = registerItem("black_crossed_paper", new BlackCrossedPaperItem(new Item.Settings()));
    public static final Item BLACK_DIAMOND_PAPER = registerItem("black_diamond_paper", new BlackDiamondPaperItem(new Item.Settings()));
    public static final Item BLACK_GRASS_PAPER = registerItem("black_grass_paper", new BlackGrassPaperItem(new Item.Settings()));
    public static final Item BLACK_INTERLINKED_PAPER = registerItem("black_interlinked_paper", new BlackInterlinkedPaperItem(new Item.Settings()));
    public static final Item BLACK_LAYERED_PAPER = registerItem("black_layered_paper", new BlackLayeredPaperItem(new Item.Settings()));
    public static final Item BLACK_LILY_FLOWER_PAPER = registerItem("black_lily_flower_paper", new BlackLilyFlowerPaperItem(new Item.Settings()));
    public static final Item BLACK_OCULAR_PAPER = registerItem("black_ocular_paper", new BlackOcularPaperItem(new Item.Settings()));
    public static final Item BLACK_OVAL_PAPER = registerItem("black_oval_paper", new BlackOvalPaperItem(new Item.Settings()));
    public static final Item BLACK_PYRIFORM_PAPER = registerItem("black_pyriform_paper", new BlackPyriformPaperItem(new Item.Settings()));
    public static final Item BLACK_SCALES_PAPER = registerItem("black_scales_paper", new BlackScalesPaperItem(new Item.Settings()));
    public static final Item BLACK_TWISTED_PAPER = registerItem("black_twisted_paper", new BlackTwistedPaperItem(new Item.Settings()));
    public static final Item BLACK_TWO_STARRED_PAPER = registerItem("black_two_starred_paper", new BlackTwoStarredPaperItem(new Item.Settings()));
    public static final Item BLACK_ZIPPER_PAPER = registerItem("black_zipper_paper", new BlackZipperPaperItem(new Item.Settings()));

    public static final Item HUNTERS_HAT = registerItem("hunters_hat",
            new HuntersHatItem(ModArmorMaterials.HUNTERS_HAT, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item NEWSPAPER_BOY_HAT = registerItem("newspaper_boy_hat",
            new NewsPaperBoyHatItem(ModArmorMaterials.NEWSPAPER_BOY_HAT, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item TOP_HAT = registerItem("top_hat",
            new TopHatItem(ModArmorMaterials.TOP_HAT, ArmorItem.Type.HELMET, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(STEEL_INGOT);
        entries.add(VICTORIAN_BANNER_PATTERN);
        entries.add(STEEL_NUGGET);
        entries.add(RAW_PORCELAIN);
        entries.add(PORCELAIN_BRICK);
        entries.add(HUNTERS_HAT);
        entries.add(NEWSPAPER_BOY_HAT);
        entries.add(TOP_HAT);

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FlamesVictorianMadness.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FlamesVictorianMadness.LOGGER.info("Registering Mod Items for " + FlamesVictorianMadness.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
