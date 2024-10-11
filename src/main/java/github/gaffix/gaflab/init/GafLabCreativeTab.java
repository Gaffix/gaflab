package github.gaffix.gaflab.init;

import github.gaffix.gaflab.GafLab;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class GafLabCreativeTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GafLab.MOD_ID);

    public static final List<Supplier<? extends ItemLike>> GAFLAB_UTILITIES_ITEMS = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> GAFLAB_FOOD_ITEMS = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> GAFLAB_COMBAT_ITEMS = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> GAFLAB_MATERIALS_ITEMS = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> GAFLAB_BLOCKS_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> GAFLAB_UTILITIES = TABS.register("gaflab_utilities",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.gaflab.GAFLAB_UTILITIES"))
                    .icon(GafLabItems.DRAGON_ESSENCE.get()::getDefaultInstance)
                    .displayItems((displayParams, output) ->
                            GAFLAB_UTILITIES_ITEMS.forEach(itemUtilities -> output.accept(itemUtilities.get())))
                    .build()
        );

    public static final RegistryObject<CreativeModeTab> GAFLAB_FOOD = TABS.register("gaflab_food",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.gaflab.GAFLAB_FOOD"))
                    .icon(GafLabItems.ZAZA.get()::getDefaultInstance)
                    .displayItems((displayParams, output) ->
                            GAFLAB_FOOD_ITEMS.forEach(itemFood -> output.accept(itemFood.get())))
                    .build()
        );

    public static final RegistryObject<CreativeModeTab> GAFLAB_COMBAT = TABS.register("gaflab_combat",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.gaflab.GAFLAB_COMBAT"))
                    .icon(GafLabItems.SHADOWRITE_HELMET.get()::getDefaultInstance)
                    .displayItems((displayParams, output) ->
                            GAFLAB_COMBAT_ITEMS.forEach(itemCombat -> output.accept(itemCombat.get())))
                    .build()
        );

    public static final RegistryObject<CreativeModeTab> GAFLAB_MATERIALS = TABS.register("gaflab_materials",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.gaflab.GAFLAB_MATERIALS"))
                    .icon(GafLabItems.SHADOWRITE_INGOT.get()::getDefaultInstance)
                    .displayItems((displayParams, output) ->
                            GAFLAB_MATERIALS_ITEMS.forEach(itemMaterials -> output.accept(itemMaterials.get())))
                    .build()
        );
    public static final RegistryObject<CreativeModeTab> GAFLAB_BLOCKS = TABS.register("gaflab_blocks",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.gaflab.GAFLAB_BLOCKS"))
                    .icon(GafLabItems.SHADOWRITE_ORE_ITEM.get()::getDefaultInstance)
                    .displayItems((displayParams, output) ->
                            GAFLAB_BLOCKS_ITEMS.forEach(itemBlocks -> output.accept(itemBlocks.get())))
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToFood(RegistryObject<T> itemFood) {
        GAFLAB_FOOD_ITEMS.add(itemFood);
        return itemFood;
    }

    public static <T extends Item> RegistryObject<T> addToUtilities(RegistryObject<T> itemUtilities) {
        GAFLAB_UTILITIES_ITEMS.add(itemUtilities);
        return itemUtilities;
    }

    public static <T extends Item> RegistryObject<T> addToCombat(RegistryObject<T> itemCombat) {
        GAFLAB_COMBAT_ITEMS.add(itemCombat);
        return itemCombat;
    }

    public static <T extends Item> RegistryObject<T> addToMaterials(RegistryObject<T> itemMaterials) {
        GAFLAB_MATERIALS_ITEMS.add(itemMaterials);
        return itemMaterials;
    }
    public static <T extends Item> RegistryObject<T> addToBlocks(RegistryObject<T> itemBlocks) {
        GAFLAB_BLOCKS_ITEMS.add(itemBlocks);
        return itemBlocks;
    }
}
