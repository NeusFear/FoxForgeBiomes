package foxforgebiomes.api;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ItemBlockSlab extends ItemSlab {
    public ItemBlockSlab(Block par1) {
        super(par1, ((BasicSlab)par1).getSingleBlock(), ((BasicSlab)par1).getFullBlock());
    }

    @Nonnull
    @Override
    public String getUnlocalizedName(ItemStack par1ItemStack) {
        return block.getUnlocalizedName();
    }
}
