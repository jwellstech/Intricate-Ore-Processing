package basicCrusher;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BasicCrusherRecipes {

	private static final BasicCrusherRecipes crushingBase = new BasicCrusherRecipes();
	private Map<ItemStack, ItemStack> crushingList = Maps.<ItemStack, ItemStack>newHashMap();
	
	public static BasicCrusherRecipes instance() {
		return crushingBase;
	}
	
	private BasicCrusherRecipes() {
		
		
		
		
		
	}
	
	public void addCrushingRecipeForBlock(Block input, ItemStack stack) {
		this.addCrushing(Item.getItemFromBlock(input), stack);
	}
	
	public void addCrushing(Item input, ItemStack stack) {
		this.addCrushingRecipe(new ItemStack(input, 1, 32767), stack);
	}
	
	public void addCrushingRecipe(ItemStack input, ItemStack stack) {
		if(getCrushingResult(input) != null) { net.minecraftforge.fml.common.FMLLog.info("Ignored conflicting crushing recipe input: " + input + " = " + stack); return;}
		this.crushingList.put(input, stack);
	}
	
	public ItemStack getCrushingResult(ItemStack stack) {
		for (Entry<ItemStack, ItemStack> entry : this.crushingList.entrySet()) {
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) {
				return (ItemStack)entry.getValue();
			}
		}
		return null;
	}
	
	public boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	
	
	
}
