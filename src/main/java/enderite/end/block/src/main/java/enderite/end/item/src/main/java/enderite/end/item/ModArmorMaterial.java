package enderite.end.item;

import enderite.end.EnderiteMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import java.util.List;
import java.util.Map;

public class ModArmorMaterial {

    public static final RegistryEntry<ArmorMaterial> ENDERITE = Registry.registerReference(
        Registries.ARMOR_MATERIAL,
        Identifier.of(EnderiteMod.MOD_ID, "enderite"),
        new ArmorMaterial(
            Map.of(
                ArmorItem.Type.BOOTS,      3,
                ArmorItem.Type.LEGGINGS,   6,
                ArmorItem.Type.CHESTPLATE, 8,
                ArmorItem.Type.HELMET,     3
            ),
            15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ModItems.ENDERITE_INGOT),
            List.of(new ArmorMaterial.Layer(
                Identifier.of(EnderiteMod.MOD_ID, "enderite")
            )),
            3.0f,
            0.1f
        )
    );

    public static void register() {}
}
