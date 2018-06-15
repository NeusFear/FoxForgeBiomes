package foxforgebiomes.api;

import foxforgebiomes.init.FFBBlocks;
import foxforgebiomes.init.FFBTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import java.util.Random;

public abstract class BasicSlab extends BasicBlock {

    private final boolean doubleSlab;

    public static final PropertyEnum<BasicSlab.EnumBlockHalf> HALF = PropertyEnum.<BasicSlab.EnumBlockHalf>create("half", BasicSlab.EnumBlockHalf.class);
    protected static final AxisAlignedBB AABB_BOTTOM_HALF = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
    protected static final AxisAlignedBB AABB_TOP_HALF = new AxisAlignedBB(0.0D, 0.5D, 0.0D, 1.0D, 1.0D, 1.0D);

    public BasicSlab(String name, Material material, boolean full) {
        super(name, material, !full);
        doubleSlab = full;
        if(!full) {
            setCreativeTab(FFBTabs.tabFoxForgeBiomes);
            useNeighborBrightness = true;
            FFBBlocks.BLOCKS.add(this);
        }
        setDefaultState(blockState.getBaseState().withProperty(HALF, EnumBlockHalf.BOTTOM));
    }

    @Nonnull
    @Override
    public IBlockState getStateFromMeta(int meta) {
        if (doubleSlab) {
            return getDefaultState();
        } else {
            return getDefaultState().withProperty(HALF, meta == 8 ? EnumBlockHalf.TOP : EnumBlockHalf.BOTTOM);
        }
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        if (doubleSlab) {
            return 0;
        } else {
            return state.getValue(HALF) == EnumBlockHalf.TOP ? 8 : 0;
        }
    }

    public abstract Block getFullBlock();

    public abstract Block getSingleBlock();

    @Nonnull
    @Override
    public ItemStack getPickBlock(@Nonnull IBlockState state, RayTraceResult target, @Nonnull World world, @Nonnull BlockPos pos, EntityPlayer player) {
        return new ItemStack(getSingleBlock());
    }

    @Nonnull
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(getSingleBlock());
    }

    @Nonnull
    @Override
    public ItemStack getSilkTouchDrop(@Nonnull IBlockState par1) {
        return new ItemStack(getSingleBlock());
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
        if (doubleSlab)
        {
            return FULL_BLOCK_AABB;
        }
        else
        {
            return state.getValue(HALF) == EnumBlockHalf.TOP ? AABB_TOP_HALF : AABB_BOTTOM_HALF;
        }
    }

    public static enum EnumBlockHalf implements IStringSerializable {
        TOP("top"),
        BOTTOM("bottom");

        private final String name;

        private EnumBlockHalf(String name) { this.name = name; }

        public String toString() { return this.name; }

        public String getName() { return this.name; }
    }
}
