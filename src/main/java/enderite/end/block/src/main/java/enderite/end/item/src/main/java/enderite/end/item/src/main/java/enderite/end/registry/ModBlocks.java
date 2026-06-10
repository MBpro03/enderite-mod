package enderite.end.registry;

import enderite.end.EnderiteMod;
import enderite.end.block.EnderiteOreBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ENDERITE_ORE = new EnderiteOreBlock();

    public static void register() {
        Registry.register(
            Registries.BLOCK,
            Identifier.of(EnderiteMod.MOD_ID, "enderite_ore"),
            ENDERITE_ORE
        );
        EnderiteMod.LOGGER.info("Registered Enderite blocks.");
    }
}
