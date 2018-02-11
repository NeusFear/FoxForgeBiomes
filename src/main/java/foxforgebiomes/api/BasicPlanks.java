package foxforgebiomes.api;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BasicPlanks extends BasicBlock {
    public BasicPlanks(String name) {
        super(name, Material.WOOD, true);
        this.setHarvestLevel("axe", 0);
        this.setHardness(1);
        this.setSoundType(SoundType.WOOD);
    }

    @Override
    public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
        return 5;
    }

    @Override
    public boolean isWood(IBlockAccess world, BlockPos pos) {
        return true;
    }
}
