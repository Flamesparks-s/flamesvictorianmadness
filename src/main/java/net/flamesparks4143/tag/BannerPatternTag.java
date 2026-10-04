package net.flamesparks4143.tag;

import net.flamesparks4143.victorian_madess.FlamesVictorianMadness;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class BannerPatternTag {

    public static final TagKey<BannerPattern> CHAIN_LINKS_BANNER_PATTERN = of("chain_links_banner_pattern");

    private static TagKey<BannerPattern> of ( String name ) {
        return TagKey.of(RegistryKeys.BANNER_PATTERN, Identifier.of(FlamesVictorianMadness.MOD_ID, name));
    }

}
