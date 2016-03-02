package basicCrusher;

import java.util.Random;


import intricateoreprocessing.Intricateoreprocessing;
import intricateoreprocessing.Intricateoreprocessing.GUI_ENUM;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import basicCrusher.TileEntityBasicCrusher;
import ibxm.Player;

public class BasicCrusher extends BlockContainer {

	public final boolean isCrushing;
	private static boolean keepInventory;

	public BasicCrusher(boolean isCrushing) {
		super(Material.rock);
		setCreativeTab(CreativeTabs.tabDecorations);
		setHarvestLevel("pickaxe", 0);
		setHardness(3.5F);
		setResistance(17.5F);
		setStepSound(soundTypePiston);
		this.setDefaultState(this.blockState.getBaseState());
		this.isCrushing = isCrushing;
	}
	
	@Override
    public Item getItemDropped(
          IBlockState state, 
          Random rand, 
          int fortune)
    {
        return Item.getItemFromBlock(this);
    }
	
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, float x, float y, float z)
	{
		System.out.println("Does this file even load");
		if (!world.isRemote)
        {
			player.openGui(intricateoreprocessing.Intricateoreprocessing.instance, intricateoreprocessing.Intricateoreprocessing.GUI_ENUM.BasicCrusher.ordinal(), world, pos.getX(), pos.getY(), pos.getZ());
			
        }
        else
        {
			TileEntity tileentity = world.getTileEntity(pos);
				
        }
		return true;
	}
	
	
	public static void setState(boolean active, World worldIn, BlockPos pos)
	{
		IBlockState iblockstate = worldIn.getBlockState(pos);
		TileEntity tileentity = worldIn.getTileEntity(pos);
		keepInventory = true;
		
		if(active) {
			worldIn.setBlockState(pos, basicCrusher.StartupCommon.blockBasicCrusherLit.getDefaultState());
		}
		else {
			worldIn.setBlockState(pos, basicCrusher.StartupCommon.blockBasicCrusher.getDefaultState());
		}
		
		keepInventory = false;
		
		if (tileentity != null)
		{
			tileentity.validate();
			worldIn.setTileEntity(pos, tileentity);
		}
		
	}
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityBasicCrusher();
	}
	
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase player) {
		return this.getDefaultState();
	}

	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		if(!keepInventory) {
			TileEntity tileentity = worldIn.getTileEntity(pos);
			
			if(tileentity instanceof TileEntityFurnace) {
				InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntityFurnace)tileentity);
				worldIn.updateComparatorOutputLevel(pos, this);
			}
		}

		super.breakBlock(worldIn, pos, state);
	}
	
	public boolean hasComparatorInputOverride() {
		return true;
	}
	
	public int getComparatorInputOverride(World worldIn,BlockPos pos) {
		return Container.calcRedstone(worldIn.getTileEntity(pos));
	}
	
	@SideOnly(Side.CLIENT)
	public Item getItem(World worldIn, BlockPos pos) {
		return Item.getItemFromBlock(basicCrusher.StartupCommon.blockBasicCrusher);
	}
	

//    @Override
//    @SideOnly(Side.CLIENT)
//    public Item getItem(World worldIn, BlockPos pos)
//    {
//        return Item.getItemFromBlock(this);
//    }

	@Override
	public boolean isOpaqueCube() {
		return true;
	}
	
	@Override
	public boolean isFullCube() {
		return true;
	}
	
	@Override
	public int getRenderType() {
		return 3;
	}

	
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World worldIn, BlockPos pos, Random rand)
	{
	            double d0 = (double)pos.getX() + 0.5D;
	            double d1 = (double)pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
	            double d2 = (double)pos.getZ() + 0.5D;
	            double d3 = 0.52D;
	            double d4 = rand.nextDouble() * 0.6D - 0.3D;
	            
	            worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1 + 1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
	            worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 - d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
	            worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
	            worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 - d3, 0.0D, 0.0D, 0.0D, new int[0]);
	            worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 + d3, 0.0D, 0.0D, 0.0D, new int[0]);

	}
}
		