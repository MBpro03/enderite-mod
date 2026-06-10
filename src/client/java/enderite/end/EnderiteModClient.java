package enderite.end;

import net.fabricmc.api.ClientModInitializer;

public class EnderiteModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EnderiteMod.LOGGER.info("Enderite client mod loaded!");
    }
}
