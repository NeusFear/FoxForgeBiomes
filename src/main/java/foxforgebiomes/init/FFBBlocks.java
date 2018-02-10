package foxforgebiomes.init;

import foxforgebiomes.blocks.BlockMapleWoodLog;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class FFBBlocks {

    public static Block maple_log = new BlockMapleWoodLog().setUnlocalizedName("maple_log").setCreativeTab(FFBTabs.tabFoxForgeBiomes);
    public static Item maple_log_item = new ItemBlock(maple_log).setRegistryName(maple_log.getRegistryName());

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(maple_log);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(maple_log_item);
    }
}
