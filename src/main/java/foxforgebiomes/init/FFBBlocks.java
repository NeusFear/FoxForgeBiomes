package foxforgebiomes.init;

import foxforgebiomes.blocks.BlockAspenWoodLog;
import foxforgebiomes.blocks.BlockDeadGrass;
import foxforgebiomes.blocks.BlockMapleWoodLog;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
public class FFBBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block DEAD_GRASS = new BlockDeadGrass();
    public static final Block MAPLE_LOG = new BlockMapleWoodLog();
    public static final Block ASPEN_LOG = new BlockAspenWoodLog();
}
