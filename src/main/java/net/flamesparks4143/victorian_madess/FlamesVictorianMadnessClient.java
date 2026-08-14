package net.flamesparks4143.victorian_madess;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.flamesparks4143.block.ModBlocks;
import net.flamesparks4143.item.ModItems;
import net.minecraft.client.render.RenderLayer;

public class FlamesVictorianMadnessClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STEEL_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STEEL_TRAPDOOR, RenderLayer.getCutout());


    }
}
