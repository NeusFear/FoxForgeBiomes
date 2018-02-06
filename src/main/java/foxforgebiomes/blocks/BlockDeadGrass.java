package foxforgebiomes.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockDeadGrass extends Block {
    public BlockDeadGrass() {
        super(Material.GRASS);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setHardness();

    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.SOLID;
    }
}
