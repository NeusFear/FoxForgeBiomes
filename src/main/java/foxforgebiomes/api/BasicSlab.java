package foxforgebiomes.api;

import foxforgebiomes.init.FFBBlocks;
import foxforgebiomes.init.FFBItems;
import foxforgebiomes.init.FFBTabs;
import foxforgebiomes.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;

import java.util.Locale;
import java.util.Random;

public abstract class BasicSlab extends BlockSlab implements IHasModel {

    private final String name;
    private final boolean doubleSlab;
    protected static final PropertyEnum<DummyEnum> DUMMY;

    static {
        DUMMY = PropertyEnum.create("dummy", DummyEnum.class);
    }

    public BasicSlab(boolean full, Material mat, String name) {
        super(mat);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        doubleSlab = full;
        if(!full) {
            setCreativeTab(FFBTabs.tabFoxForgeBiomes);
            useNeighborBrightness = true;
            FFBBlocks.BLOCKS.add(this);
        }
        setDefaultState(blockState.getBaseState().withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM).withProperty(DUMMY, DummyEnum.SINGLETON));
    }

    @Nonnull
    @Override
    public BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, HALF, getVariantProperty());
    }

    @Nonnull
    @Override
    public IBlockState getStateFromMeta(int meta) {
        if (doubleSlab) {
            return getDefaultState();
        } else {
            return getDefaultState().withProperty(HALF, meta == 8 ? BlockSlab.EnumBlockHalf.TOP : BlockSlab.EnumBlockHalf.BOTTOM);
        }
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        if (doubleSlab) {
            return 0;
        } else {
            return state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP ? 8 : 0;
        }
    }

    public abstract BlockSlab getFullBlock();

    public abstract BlockSlab getSingleBlock();

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

    @Nonnull
    @Override
    public String getUnlocalizedName(int i) {
        return name;
    }

    @Override
    public final boolean isDouble() {
        return doubleSlab;
    }

    @Nonnull
    @Override
    public final IProperty getVariantProperty() {
        return DUMMY; // Vanilla expects us to store different kinds of slabs into one block ID. Except we don't. We need this dummy property and dummy value to satisfy it.
    }

    @Nonnull
    @Override
    public final Comparable<?> getTypeForItem(@Nonnull ItemStack stack) {
        return DummyEnum.SINGLETON;
    }


    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels() {
    }

    private enum DummyEnum implements IStringSerializable {
        SINGLETON {
            @Nonnull
            @Override
            public String getName() {
                return name().toLowerCase(Locale.ROOT);
            }
        }
    }
}
