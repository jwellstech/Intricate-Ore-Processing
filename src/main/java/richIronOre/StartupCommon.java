package richIronOre;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static RichIronOre blockRichIronOre;
	
	
	
	public static void preInitCommon() {
		
		blockRichIronOre = (RichIronOre)(new RichIronOre().setUnlocalizedName("richIronOre"));
		GameRegistry.registerBlock(blockRichIronOre, "richIronOre");
		
		
	}
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
