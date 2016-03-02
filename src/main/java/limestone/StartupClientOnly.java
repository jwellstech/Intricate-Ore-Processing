package limestone;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupClientOnly {

	public static void preInitClientOnly()
	{
		
	}
	
	public static void initClientOnly() {
		
		Item itemLimestone = GameRegistry.findItem("intricateoreprocessing", "limestone");
		ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("intricateoreprocessing:limestone", "inventory");
		final int DEFAULT_ITEM_SUBTYPE = 0;
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemLimestone, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);;
		
		
		
		
	}
	
	
	public static void postInitClientOnly() {
		
	}
	
	
	
	
	
	
	
	
	
}
