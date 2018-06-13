package foxforgebiomes.blocks;

import foxforgebiomes.api.BasicBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockDeadGrass extends BasicBlock {
    public BlockDeadGrass() {
        super("dead_grass", Material.GRASS, true);
        this.setSoundType(SoundType.PLANT);
        this.setHarvestLevel("shovel", 0);
        this.setHardness((float) .5);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(Blocks.DIRT);
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }

}
