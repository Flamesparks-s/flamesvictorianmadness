package net.flamesparks4143.item.client;

import net.flamesparks4143.item.custom.HuntersHatItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HunterHatRenderer extends GeoArmorRenderer<HuntersHatItem> {

    public HunterHatRenderer() {
        super(new HuntersHatModel());
    }
}
