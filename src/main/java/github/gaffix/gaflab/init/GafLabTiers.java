package github.gaffix.gaflab.init;

import github.gaffix.gaflab.GafLab;
import github.gaffix.gaflab.init.GafLabItems;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class GafLabTiers {
    public static final ForgeTier SHADOWRITE = new ForgeTier(
            5,
            3800,
            4.5f,
            3,
            15,
            GafLabTags.NEEDS_SHADOWRITE_TOOL,
            () -> Ingredient.of(GafLabItems.SHADOWRITE_INGOT::get)
    );
}
