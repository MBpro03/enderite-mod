package enderite.end.registry;

import enderite.end.EnderiteMod;
import enderite.end.item.ModArmorMaterial;
import enderite.end.item.ModToolMaterial;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RAW_ENDERITE = new Item(new Item.Settings());
    public static final Item ENDERITE_INGOT = new Item(new Item.Settings());

    public static final Item ENDERITE_PICKAXE =
        new PickaxeItem(ModToolMaterial.ENDERITE, new Item.Settings());
    public static final Item ENDERITE_AXE =
        new AxeItem(ModToolMaterial.ENDERITE, new Item.Settings());
    public static final Item ENDERITE_SHOVEL =
        new ShovelItem(ModToolMaterial.ENDERITE, new Item.Settings());
    public static final Item ENDERITE_HOE =
        new HoeItem(ModToolMaterial.ENDERITE, new Item.Settings());
    public static final Item ENDER
