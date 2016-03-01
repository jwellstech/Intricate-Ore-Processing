package basicCrusher;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupClientOnly {

	public static boolean isCrushing = true;

	
	
	public static void preInitClientOnly()
	{
		
	}
	public static void initClientOnly() {
		Item itemBasicCrusher = GameRegistry.findItem("intricateoreprocessing", "basicCrusher");
    	ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("intricateoreprocessing:basicCrusher", "inventory");
		final int DEFAULT_ITEM_SUBTYPE = 0;
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBasicCrusher, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
		
		Item itemBasicCrusherLit = GameRegistry.findItem("intricateoreprocessing", "basicCrusherLit");
		ModelResourceLocation itemModelResourceLocationLit = new ModelResourceLocation("intricateoreprocessing:basicCrusherLit", "inventory");
		final int DEFAULT_ITEM_SUBTYPE2 = 0;
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBasicCrusherLit, DEFAULT_ITEM_SUBTYPE2, itemModelResourceLocationLit);
		
	}

	public static void postInitClientOnly() {
	}
}
