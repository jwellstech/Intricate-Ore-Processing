package richRedstoneOre;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RichRedstoneOre extends Block{
	
	
	public RichRedstoneOre() {
		super(Material.rock);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe", 2);
		setHardness(5.0F);
		setResistance(7.0F);
		setStepSound(soundTypePiston);
	}
	
	
    
    
	public Item getItemDropped(int par1, Random random, int par2) {
		return Item.getItemFromBlock(this);
	}
	
   
	
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.SOLID;
	}
	
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
	
	
}
