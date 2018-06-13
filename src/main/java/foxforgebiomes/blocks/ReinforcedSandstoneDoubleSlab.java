package foxforgebiomes.blocks;

import foxforgebiomes.init.FFBBlocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedSandstoneDoubleSlab extends ReinforcedSandstoneSlab{
    public ReinforcedSandstoneDoubleSlab() {
        super("reinforced_sandstone_double_slab", Material.ROCK);
        this.setHarvestLevel("pickaxe", 3);
        this.setHardness(1);
        this.setSoundType(SoundType.STONE);
        FFBBlocks.BLOCKS.add(this);
    }

    @Override
    public boolean isDouble() {
        return true;
    }
}
