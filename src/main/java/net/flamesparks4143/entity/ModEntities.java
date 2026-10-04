package net.flamesparks4143.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.flamesparks4143.entity.custom.ChairEntity;
import net.flamesparks4143.entity.custom.StoolEntity;
import net.flamesparks4143.victorian_madess.FlamesVictorianMadness;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<ChairEntity> CHAIR_ENTITY = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(FlamesVictorianMadness.MOD_ID, "chair_entity"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, ChairEntity::new)
                    .dimensions(new EntityDimensions(0.0f,0.4f, true))
                    .fireImmune()
                    .disableSummon()
                    .build());
    public static final EntityType<StoolEntity> STOOL_ENTITY = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(FlamesVictorianMadness.MOD_ID, "stool_entity"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, StoolEntity::new)
                    .dimensions(new EntityDimensions(0.0f,0.4f, true))
                    .fireImmune()
                    .disableSummon()
                    .build());



    public static void registerModEntities() {
        FlamesVictorianMadness.LOGGER.info("Registering Mod Enitites for " + FlamesVictorianMadness.MOD_ID);
    }
}
