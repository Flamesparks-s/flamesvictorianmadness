package net.flamesparks4143.item.client;

import net.flamesparks4143.item.custom.HuntersHatItem;
import net.flamesparks4143.item.custom.TopHatItem;
import net.flamesparks4143.victorian_madess.FlamesVictorianMadness;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class TopHatModel extends GeoModel<TopHatItem> {
    @Override
    public Identifier getModelResource(TopHatItem animatable) {
        return new Identifier(FlamesVictorianMadness.MOD_ID, "geo/top_hat.geo.json");
    }

    @Override
    public Identifier getTextureResource(TopHatItem animatable) {
        return new Identifier(FlamesVictorianMadness.MOD_ID, "textures/armor/top_hat.png");
    }

    @Override
    public Identifier getAnimationResource(TopHatItem animatable) {
        return new Identifier(FlamesVictorianMadness.MOD_ID, "animations/top_hat.animation.json");
    }
}
