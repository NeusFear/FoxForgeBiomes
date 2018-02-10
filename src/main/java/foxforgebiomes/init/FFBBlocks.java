package foxforgebiomes.init;

import foxforgebiomes.blocks.BlockMapleWoodLog;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
public class FFBBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block MAPLE_LOG = new BlockMapleWoodLog();
}
