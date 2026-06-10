package enderite.end.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

public class ModToolMaterial {

    public static final ToolMaterial ENDERITE = new ToolMaterial(
        BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
        2031,
        9.5f,
        3.0f,
        15,
        ItemTags.NETHERITE_TOOL_MATERIALS
    );
}
