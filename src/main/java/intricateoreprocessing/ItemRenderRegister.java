package intricateoreprocessing;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;

public final class ItemRenderRegister {
	
	public static void registerItemRenderer() {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.calcine, 0, new ModelResourceLocation("intricateoreprocessing:calcine", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.limestoneShard, 0, new ModelResourceLocation("intricateoreprocessing:limestoneShard", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.chalcopyrite, 0, new ModelResourceLocation("intricateoreprocessing:chalcopyrite", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.groundCopper, 0, new ModelResourceLocation("intricateoreprocessing:groundCopper", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.copperIngot, 0, new ModelResourceLocation("intricateoreprocessing:copperIngot", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.copperMatte, 0, new ModelResourceLocation("intricateoreprocessing:copperMatte", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.groundIron, 0, new ModelResourceLocation("intricateoreprocessing:groundIron", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.roughDiamond, 0, new ModelResourceLocation("intricateoreprocessing:roughDiamond", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.uncutDiamond, 0, new ModelResourceLocation("intricateoreprocessing:uncutDiamond", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.sandpaper, 0, new ModelResourceLocation("intricateoreprocessing:sandpaper", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.ironSlag, 0, new ModelResourceLocation("intricateoreprocessing:ironSlag", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.ironLump, 0, new ModelResourceLocation("intricateoreprocessing:ironLump", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.hammer, 0, new ModelResourceLocation("intricateoreprocessing:hammer", "inventory"));
	}

}
