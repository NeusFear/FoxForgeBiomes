package foxforgebiomes.api;

import foxforgebiomes.FoxForgeBiomes;
import foxforgebiomes.init.FFBItems;
import foxforgebiomes.init.FFBTabs;
import foxforgebiomes.util.IHasModel;
import net.minecraft.item.Item;

public class BasicItem extends Item implements IHasModel{

    public BasicItem(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(FFBTabs.tabFoxForgeBiomes);

        FFBItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        FoxForgeBiomes.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
