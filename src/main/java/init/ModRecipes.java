package init;

import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void RegisterRecipes() {
		addCraftingRecipes();
		addSmeltingRecipes();
	}
	private static void addCraftingRecipes() {
		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian),"AAA","AAA","AAA",'A', Blocks.diamond_block);
		//COPPER PROCESS
		//IRON PROCESS
		//GOLD PROCESS
		//REDSTONE PROCESS		
		//DIAMOND PROCESS ------ uncut diamonds  **change when all items are implemented**
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond), Blocks.prismarine, poorDiamondOre.StartupCommon.blockPoorDiamondOre, poorDiamondOre.StartupCommon.blockPoorDiamondOre);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond), Blocks.prismarine, Blocks.diamond_ore);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 2), Blocks.prismarine, richDiamondOre.StartupCommon.blockRichDiamondOre);
		//LAPIS LAZULI PROCESS
		//TIN PROCESSs
		//ALUMINIUM PROCESS
	}
	
	public static void removeCraftingRecipes() {
		
	}
	private static void removeRecipe(Block output) {
		removeRecipe(Item.getItemFromBlock(output));
	}
	private static void removeRecipe(Item output) {
		int recipesRemoved = 0;
		
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		Iterator<IRecipe> remover = recipes.iterator();
		
		while(remover.hasNext()) {
			ItemStack itemstack = remover.next().getRecipeOutput();
			
			if (itemstack != null && itemstack.getItem() == output) {
				remover.remove();
				recipesRemoved++;
			}
		}
	}
	private static void addSmeltingRecipes() {
//		GameRegistry.addSmelting(inputBlock/Item/ItemStack, new ItemStack(outputBlock/Item/ItemStack, amountOutputted), XPEarned)
		//COPPER PROCESS
		//IRON PROCESS
		//GOLD PROCESS
		//REDSTSONE PROCESS
		//DIAMOND PROCESS
		//LAPIS LAZULI PROCESS
		//TIN PROCESS
		//ALLUMINIUM PROCESS
	}
	public static void removeSmeltingRecipes() {
	//	List<>
	}
}
