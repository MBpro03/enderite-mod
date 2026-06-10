package enderite.end.block;

import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class EnderiteOreBlock extends ExperienceDroppingBlock {

    public EnderiteOreBlock() {
        super(
            UniformIntProvider.create(3, 7),
            AbstractBlock.Settings.create()
                .hardness(5.0f)
                .resistance(1200.0f)
                .requiresTool()
        );
    }
}
