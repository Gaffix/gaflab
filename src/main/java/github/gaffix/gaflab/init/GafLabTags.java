package github.gaffix.gaflab.init;

import github.gaffix.gaflab.GafLab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class GafLabTags {
    public static final TagKey<Block> NEEDS_SHADOWRITE_TOOL = tag();

    private static TagKey<Block> tag () {
        return BlockTags.create(new ResourceLocation(GafLab.MOD_ID, "needs_shadowrite_tool"));
    }
}
