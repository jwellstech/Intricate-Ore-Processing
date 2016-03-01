package richLapisOre;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupClientOnly {

	public static void preInitClientOnly()
	{
		
	}
	
	public static void initClientOnly() {
		
		Item itemRichLapisOre = GameRegistry.findItem("intricateoreprocessing", "richLapisOre");
		ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("intricateoreprocessing:richLapisOre", "inventory");
		final int DEFAULT_ITEM_SUBTYPE = 0;
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemRichLapisOre, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);;
		
		
		
		
	}
	
	
	public static void postInitClientOnly() {
		
	}
	
	
	
	
	
	
	
	
	
}
