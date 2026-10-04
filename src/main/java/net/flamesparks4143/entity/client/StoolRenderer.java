package net.flamesparks4143.entity.client;

import net.flamesparks4143.entity.custom.ChairEntity;
import net.flamesparks4143.entity.custom.StoolEntity;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class StoolRenderer extends EntityRenderer<StoolEntity> {
    public StoolRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(StoolEntity entity) {
        return null;
    }

    @Override
    public boolean shouldRender(StoolEntity entity, Frustum frustum, double x, double y, double z) {
        return true;
    }
}
