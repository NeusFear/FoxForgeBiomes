package foxforgebiomes.blocks;

import foxforgebiomes.api.BasicBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockReinforcedSandstone extends BasicBlock {
    public BlockReinforcedSandstone() {
        super("reinforced_sandstone", Material.ROCK, true);
        this.setHarvestLevel("pickaxe", 3);
        this.setHardness(1);
        this.setSoundType(SoundType.STONE);
    }
}
