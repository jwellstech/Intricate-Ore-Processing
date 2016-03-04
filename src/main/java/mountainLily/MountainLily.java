package mountainLily;

import java.util.List;
import java.util.Random;

import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MountainLily extends BlockBush {

	protected PropertyEnum<BlockFlower.EnumFlowerType> type;
	
	public MountainLily(Material materialIn) {
		
		
		
		setCreativeTab(CreativeTabs.tabDecorations);
		setStepSound(soundTypeGrass);
       

		}
	
	public Item getItemDropped(int par1, Random random, int par2) {
		return Item.getItemFromBlock(this);
	}
	
	public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
    {
        BlockPos down = pos.down();
        Block soil = worldIn.getBlockState(down).getBlock();
        if (state.getBlock() != this) return this.canPlaceBlockOn(soil); //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
        return soil.canSustainPlant(worldIn, down, net.minecraft.util.EnumFacing.UP, this);
    }
	@SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer()
   {
      return EnumWorldBlockLayer.CUTOUT; 
   }
   
   public boolean isFullCube()
    {
        return false;
    }



   
    public boolean isOpaqueCube()
    {
        return false;
    }
    
   
   

	
	
	
	
	
	
	
}