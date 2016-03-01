package newBlock;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static NewBlock blockNewBlock;
	
	
	
	public static void preInitCommon() {
		
		blockNewBlock = (NewBlock)(new NewBlock().setUnlocalizedName("newBlock"));
		GameRegistry.registerBlock(blockNewBlock, "newBlock");
		
		
	}
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
