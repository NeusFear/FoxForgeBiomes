package foxforgebiomes.blocks;

import foxforgebiomes.api.BasicBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockDeadGrass extends BasicBlock {
    public BlockDeadGrass() {
        super("dead_grass", Material.GRASS, true);
        setSoundType(SoundType.PLANT);

    }
}
