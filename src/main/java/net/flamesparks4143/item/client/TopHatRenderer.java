package net.flamesparks4143.item.client;

import net.flamesparks4143.item.custom.HuntersHatItem;
import net.flamesparks4143.item.custom.TopHatItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class TopHatRenderer extends GeoArmorRenderer<TopHatItem> {

    public TopHatRenderer() {
        super(new TopHatModel());
    }
}
