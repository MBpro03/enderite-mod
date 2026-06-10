package enderite.end;

import enderite.end.registry.ModBlocks;
import enderite.end.registry.ModItems;
import enderite.end.worldgen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnderiteMod implements ModInitializer {

    public static final String MOD_ID = "enderite";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModBlocks.register();
        ModItems.register();
        ModWorldGeneration.register();
        LOGGER.info("Enderite mod loaded!");
    }
}
