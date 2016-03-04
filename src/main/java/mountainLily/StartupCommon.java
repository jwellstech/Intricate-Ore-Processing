package mountainLily;

import intricateoreprocessing.Intricateoreprocessing;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static MountainLily blockMountainLily;
	
	
	
	public static void preInitCommon() {
		
		blockMountainLily = (MountainLily)(new MountainLily(Material.plants).setUnlocalizedName("mountainLily"));
		GameRegistry.registerBlock(blockMountainLily, "mountainLily");
		
		
	}
	
	
	
	
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
