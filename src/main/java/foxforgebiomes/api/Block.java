package foxforgebiomes.api;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class Block extends net.minecraft.block.Block {

    private ItemBlock item;

    public Block(String name, Material material, boolean createItemBlock) {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        if ( createItemBlock )
            this.item = new ItemBlock(this);
    }

    public Item item() {
        return this.item;
    }

}
