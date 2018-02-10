package foxforgebiomes.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class FFBTabs {

    public static CreativeTabs tabFoxForgeBiomes = new CreativeTabs("tabFoxForgeBiomes"){
        public ItemStack getTabIconItem() {
            return new ItemStack(Blocks.GLASS);
        }
    };
}
