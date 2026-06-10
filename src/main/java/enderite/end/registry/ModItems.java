package enderite.end.registry;

import enderite.end.EnderiteMod;
import enderite.end.item.ModArmorMaterial;
import enderite.end.item.ModToolMaterial;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RAW_ENDERITE = new Item(new Item.Settings().fireproof());
    public static final Item ENDERITE_INGOT = new Item(new Item.Settings().fireproof());

    public static final Item ENDERITE_PICKAXE =
        new PickaxeItem(ModToolMaterial.ENDERITE, new Item.Settings().fireproof());
    public static final Item ENDERITE_AXE =
        new AxeItem(ModToolMaterial.ENDERITE, new Item.Settings().fireproof());
    public static final Item ENDERITE_SHOVEL =
        new ShovelItem(ModToolMaterial.ENDERITE, new Item.Settings().fireproof());
    public static final Item ENDERITE_HOE =
        new HoeItem(ModToolMaterial.ENDERITE, new Item.Settings().fireproof());
    public static final Item ENDERITE_SWORD =
        new SwordItem(ModToolMaterial.ENDERITE, 3, -2.4f, new Item.Settings().fireproof());

    public static final Item ENDERITE_HELMET =
        new ArmorItem(ModArmorMaterial.ENDERITE, ArmorItem.Type.HELMET, new Item.Settings().fireproof());
    public static final Item ENDERITE_CHESTPLATE =
        new ArmorItem(ModArmorMaterial.ENDERITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof());
    public static final Item ENDERITE_LEGGINGS =
        new ArmorItem(ModArmorMaterial.ENDERITE, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof());
    public static final Item ENDERITE_BOOTS =
        new ArmorItem(ModArmorMaterial.ENDERITE, ArmorItem.Type.BOOTS, new Item.Settings().fireproof());

    public static final Item ENDERITE_UPGRADE_SMITHING_TEMPLATE = new Item(new Item.Settings());
    public static final Item ENDERITE_ORE_ITEM =
        new BlockItem(ModBlocks.ENDERITE_ORE, new Item.Settings());

    public static void register() {
        reg("raw_enderite",                       RAW_ENDERITE);
        reg("enderite_ingot",                     ENDERITE_INGOT);
        reg("enderite_upgrade_smithing_template", ENDERITE_UPGRADE_SMITHING_TEMPLATE);
        reg("enderite_pickaxe",    ENDERITE_PICKAXE);
        reg("enderite_axe",        ENDERITE_AXE);
        reg("enderite_shovel",     ENDERITE_SHOVEL);
        reg("enderite_hoe",        ENDERITE_HOE);
        reg("enderite_sword",      ENDERITE_SWORD);
        reg("enderite_helmet",     ENDERITE_HELMET);
        reg("enderite_chestplate", ENDERITE_CHESTPLATE);
        reg("enderite_leggings",   ENDERITE_LEGGINGS);
        reg("enderite_boots",      ENDERITE_BOOTS);
        reg("enderite_ore",        ENDERITE_ORE_ITEM);
        EnderiteMod.LOGGER.info("Registered Enderite items.");
    }

    private static void reg(String id, Item item) {
        Registry.register(Registries.ITEM, Identifier.of(EnderiteMod.MOD_ID, id), item);
    }
}
