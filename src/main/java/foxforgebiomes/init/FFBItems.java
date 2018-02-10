package foxforgebiomes.init;

import foxforgebiomes.items.ItemRuby;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
public class FFBItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item RUBY = new ItemRuby();
}
