package github.gaffix.gaflab.init;

import github.gaffix.gaflab.GafLab;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static github.gaffix.gaflab.init.GafLabCreativeTab.*;

public class GafLabItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GafLab.MOD_ID);

    //MATERIALS ORE AND RANDOM SHIT LIKE THAT
    public static final RegistryObject<Item> SHADOWRITE_INGOT = addToMaterials (ITEMS.register("shadowrite_ingot",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON))));

    public static final RegistryObject<Item> RAW_SHADOWRITE = addToMaterials (ITEMS.register("raw_shadowrite",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON))));

    //RARE MATERIAL THINGS, USEFUL SHIT
    public static final RegistryObject<Item> ASSEMBLER = addToUtilities (ITEMS.register("assembler",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE))));

    public static final RegistryObject<Item> PHARAOHS_BOOK = ITEMS.register("pharaohs_book",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> WARDEN_HEART = addToUtilities (ITEMS.register("warden_heart",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC))));

    public static final RegistryObject<Item> DIAMOND_HANDLE = addToUtilities (ITEMS.register("diamond_handle",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE))));

    public static final RegistryObject<Item> DRAGON_ESSENCE = addToUtilities (ITEMS.register("dragon_essence",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC))));

    public static final RegistryObject<Item> FLAME_RING = addToUtilities (ITEMS.register("flame_ring",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC))));

    //FOODS AND EATABLE SHIT THAT IS NOT FOOD
    public static final RegistryObject<Item> ZAZA = addToFood (ITEMS.register("zaza",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON))));

    //SWORD WEAPONS AND EQUIPMENT AND TOOLS AND SHIT
    public static final RegistryObject<SwordItem> SHADOWRITE_SWORD = addToCombat(ITEMS.register("shadowrite_sword",
            () -> new SwordItem(
                    GafLabTiers.SHADOWRITE,
                    7,
                    2.5f,
                    new Item.Properties()
                    .rarity(Rarity.EPIC))));

    public static final RegistryObject<PickaxeItem> SHADOWRITE_PICKAXE = addToUtilities(ITEMS.register("shadowrite_pickaxe",
            () -> new PickaxeItem(
                    GafLabTiers.SHADOWRITE,
                    1,
                    2.5f,
                    new Item.Properties()
                    .rarity(Rarity.EPIC))));

    //ARMOR EQUIPMENT AND WEARABLE GOOFY SHIT
    public static final RegistryObject<ArmorItem> SHADOWRITE_HELMET = addToCombat(ITEMS.register("shadowrite_helmet",
            () -> new ArmorItem(
                    GafLabArmorMaterial.SHADOWRITE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final RegistryObject<ArmorItem> SHADOWRITE_CHESTPLATE = addToCombat(ITEMS.register("shadowrite_chestplate",
            () -> new ArmorItem(
                    GafLabArmorMaterial.SHADOWRITE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final RegistryObject<ArmorItem> SHADOWRITE_LEGGINGS = addToCombat(ITEMS.register("shadowrite_leggings",
            () -> new ArmorItem(
                    GafLabArmorMaterial.SHADOWRITE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final RegistryObject<ArmorItem> SHADOWRITE_BOOTS = addToCombat(ITEMS.register("shadowrite_boots",
            () -> new ArmorItem(
                    GafLabArmorMaterial.SHADOWRITE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    //BLOCK ITEMS AND BLOCK SHITS
    public static final RegistryObject<BlockItem> ASSEMBLING_TABLE_ITEM = addToBlocks (ITEMS.register("assembling_table",
            () -> new BlockItem(GafLabBlocks.ASSEMBLING_TABLE.get(), new Item.Properties()
                    .rarity(Rarity.RARE))
            ));

    public static final RegistryObject<BlockItem> SHADOWRITE_ORE_ITEM = addToBlocks (ITEMS.register("shadowrite_ore",
            () -> new BlockItem(GafLabBlocks.SHADOWRITE_ORE.get(), new Item.Properties()
                    .rarity(Rarity.RARE))
            ));

    public static final RegistryObject<BlockItem> CHEESE_BLOCK_ITEM = addToBlocks (ITEMS.register("cheese_block",
            () -> new BlockItem(GafLabBlocks.CHEESE_BLOCK.get(), new Item.Properties()
                    .rarity(Rarity.RARE))
            ));
}
