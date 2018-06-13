package foxforgebiomes.blocks;

import foxforgebiomes.FoxForgeBiomes;
import foxforgebiomes.init.FFBBlocks;
import foxforgebiomes.init.FFBItems;
import foxforgebiomes.util.IHasModel;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ReinforcedSandstoneSingleSlab extends ReinforcedSandstoneSlab implements IHasModel{
    public ReinforcedSandstoneSingleSlab() {
        super("reinforced_sandstone_single_slab", Material.ROCK);
        this.setHarvestLevel("pickaxe", 3);
        this.setHardness(1);
        this.setSoundType(SoundType.STONE);
        FFBItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        FFBBlocks.BLOCKS.add(this);
    }

    @Override
    public boolean isDouble() {
        return false;
    }

    @Override
    public void registerModels() {
        FoxForgeBiomes.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
