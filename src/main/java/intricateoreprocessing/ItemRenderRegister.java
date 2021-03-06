package intricateoreprocessing;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;

public final class ItemRenderRegister {
	
	public static void registerItemRenderer() {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.calcine, 0, new ModelResourceLocation("intricateoreprocessing:calcine", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.limestoneShard, 0, new ModelResourceLocation("intricateoreprocessing:limestoneShard", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.chalcopyrite, 0, new ModelResourceLocation("intricateoreprocessing:chalcopyrite", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.groundCopper, 0, new ModelResourceLocation("intricateoreprocessing:groundCopper", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.groundGold, 0, new ModelResourceLocation("intricateoreprocessing:groundGold", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.copperIngot, 0, new ModelResourceLocation("intricateoreprocessing:copperIngot", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.copperMatte, 0, new ModelResourceLocation("intricateoreprocessing:copperMatte", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.groundIron, 0, new ModelResourceLocation("intricateoreprocessing:groundIron", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.roughDiamond, 0, new ModelResourceLocation("intricateoreprocessing:roughDiamond", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.uncutDiamond, 0, new ModelResourceLocation("intricateoreprocessing:uncutDiamond", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.sandpaper, 0, new ModelResourceLocation("intricateoreprocessing:sandpaper", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.ironSlag, 0, new ModelResourceLocation("intricateoreprocessing:ironSlag", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.ironLump, 0, new ModelResourceLocation("intricateoreprocessing:ironLump", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.hammer, 0, new ModelResourceLocation("intricateoreprocessing:hammer", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.amalgam, 0, new ModelResourceLocation("intricateoreprocessing:amalgam", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.appleSeed, 0, new ModelResourceLocation("intricateoreprocessing:appleSeed", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.cyanide, 0, new ModelResourceLocation("intricateoreprocessing:cyanide", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.diamondCuttingTool, 0, new ModelResourceLocation("intricateoreprocessing:diamondCuttingTool", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.parrafinOil, 0, new ModelResourceLocation("intricateoreprocessing:parrafinOil", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.beefStew, 0, new ModelResourceLocation("intricateoreprocessing:beefStew", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.commonMedicinalHerb, 0, new ModelResourceLocation("intricateoreprocessing:commonMedicinalHerb", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.uncommonMedicinalHerb, 0, new ModelResourceLocation("intricateoreprocessing:uncommonMedicinalHerb", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.rareMedicinalHerb, 0, new ModelResourceLocation("intricateoreprocessing:rareMedicinalHerb", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.epicMedicinalHerb, 0, new ModelResourceLocation("intricateoreprocessing:epicMedicinalHerb", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.legendaryMedicinalHerb, 0, new ModelResourceLocation("intricateoreprocessing:legendaryMedicinalHerb", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.kush, 0, new ModelResourceLocation("intricateoreprocessing:kush", "inventory"));
	}

}
