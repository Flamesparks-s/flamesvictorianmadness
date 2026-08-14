package net.flamesparks4143.item.client;

import net.flamesparks4143.item.custom.NewsPaperBoyHatItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class NewsPaperBoyHatRenderer extends GeoArmorRenderer<NewsPaperBoyHatItem> {

    public NewsPaperBoyHatRenderer() {
        super(new NewsPaperBoyHatModel());
    }
}
