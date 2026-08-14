package net.flamesparks4143.item.client;

import net.flamesparks4143.item.custom.NewsPaperBoyHatItem;
import net.flamesparks4143.victorian_madess.FlamesVictorianMadness;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class NewsPaperBoyHatModel extends GeoModel<NewsPaperBoyHatItem> {
    @Override
    public Identifier getModelResource(NewsPaperBoyHatItem animatable) {
        return new Identifier(FlamesVictorianMadness.MOD_ID, "geo/newspaper_boy_hat.geo.json");
    }

    @Override
    public Identifier getTextureResource(NewsPaperBoyHatItem animatable) {
        return new Identifier(FlamesVictorianMadness.MOD_ID, "textures/armor/newspaper_boy_hat.png");
    }

    @Override
    public Identifier getAnimationResource(NewsPaperBoyHatItem animatable) {
        return new Identifier(FlamesVictorianMadness.MOD_ID, "animations/newspaper_boy_hat.animation.json");
    }
}
