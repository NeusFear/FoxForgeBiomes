package foxforgebiomes.api;

import foxforgebiomes.FoxForgeBiomes;
import foxforgebiomes.init.FFBBlocks;
import foxforgebiomes.init.FFBTabs;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BasicBlock extends Block implements IHasModel{
    public BasicBlock(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(FFBTabs.tabFoxForgeBiomes);

        FFBBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        FoxForgeBiomes.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
