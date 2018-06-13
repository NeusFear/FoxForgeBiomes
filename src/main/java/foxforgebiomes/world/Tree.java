package foxforgebiomes.world;

import foxforgebiomes.api.BasicTree;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class Tree extends BasicTree{

    public Tree() {
        super(true);
    }

    @Override
    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return false;
    }
}
