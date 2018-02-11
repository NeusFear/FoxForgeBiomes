package foxforgebiomes.init;

import foxforgebiomes.blocks.*;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
public class FFBBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //Grasses
    public static final Block DEAD_GRASS = new BlockDeadGrass();

    //Logs
    public static final Block ASH_LOG = new BlockAshLog();
    public static final Block ASPEN_LOG = new BlockAspenLog();
    public static final Block BEECH_LOG = new BlockBeechLog();
    public static final Block ELM_LOG = new BlockElmLog();
    public static final Block MAPLE_LOG = new BlockMapleLog();
    public static final Block PALM_LOG = new BlockPalmLog();
    public static final Block REDWOOD_LOG = new BlockRedwoodLog();

    //Planks
    public static final Block ASH_PLANKS = new BlockAshPlanks();
    public static final Block ASPEN_PLANKS = new BlockAspenPlanks();
    public static final Block BEECH_PLANKS = new BlockBeechPlanks();
    public static final Block MAPLE_PLANKS = new BlockMaplePlanks();
}
