package foxforgebiomes.blocks;

import foxforgebiomes.api.BasicSlab;
import foxforgebiomes.api.ItemBlockSlab;
import foxforgebiomes.init.FFBBlocks;
import foxforgebiomes.init.FFBItems;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class ReinforcedSandstoneSlab extends BasicSlab{
    public ReinforcedSandstoneSlab(boolean full) {
        super(full, Material.ROCK, "reinforced_sandstone_slab");
    }

    @Override
    public BlockSlab getFullBlock() {
        return (BlockSlab) FFBBlocks.REINFORCED_SANDSTONE_SLAB_FULL;
    }

    @Override
    public BlockSlab getSingleBlock() {
        return (BlockSlab) FFBBlocks.REINFORCED_SANDSTONE_SLAB;
    }
}
