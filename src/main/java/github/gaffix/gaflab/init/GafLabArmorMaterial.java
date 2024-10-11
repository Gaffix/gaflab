package github.gaffix.gaflab.init;

import github.gaffix.gaflab.init.tiers.ModArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class GafLabArmorMaterial {
    public static final ModArmorMaterial SHADOWRITE = new ModArmorMaterial(
            new int[] { 3200, 4000, 3600, 2800},
            new int[] {24, 32, 28, 22},
            20,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(GafLabItems.SHADOWRITE_INGOT::get),
            "shadowrite",
            0.5f,
            1f
    );
}
