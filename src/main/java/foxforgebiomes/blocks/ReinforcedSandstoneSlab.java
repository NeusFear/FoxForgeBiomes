package foxforgebiomes.blocks;

import foxforgebiomes.api.BasicSlab;
import foxforgebiomes.init.FFBBlocks;
import net.minecraft.block.material.Material;

public class ReinforcedSandstoneSlab extends BasicSlab{
    public ReinforcedSandstoneSlab(boolean full) {
        super("reinforced_sandstone_slab", Material.ROCK, full);
    }

    @Override
    public BasicSlab getFullBlock() {
        return (BasicSlab) FFBBlocks.REINFORCED_SANDSTONE_SLAB_FULL;
    }

    @Override
    public BasicSlab getSingleBlock() {
        return (BasicSlab) FFBBlocks.REINFORCED_SANDSTONE_SLAB;
    }
}
