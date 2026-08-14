package net.flamesparks4143.item.client;

import net.flamesparks4143.item.custom.HuntersHatItem;
import net.flamesparks4143.victorian_madess.FlamesVictorianMadness;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class HuntersHatModel extends GeoModel<HuntersHatItem> {
    @Override
    public Identifier getModelResource(HuntersHatItem animatable) {
        return new Identifier(FlamesVictorianMadness.MOD_ID, "geo/hunters_hat.geo.json");
    }

    @Override
    public Identifier getTextureResource(HuntersHatItem animatable) {
        return new Identifier(FlamesVictorianMadness.MOD_ID, "textures/armor/hunters_hat.png");
    }

    @Override
    public Identifier getAnimationResource(HuntersHatItem animatable) {
        return new Identifier(FlamesVictorianMadness.MOD_ID, "animations/hunters_hat.animation.json");
    }
}
