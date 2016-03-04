package copperItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DiamondCuttingTool extends Item {
	public DiamondCuttingTool(String unlocalizedName) {
		super();
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setMaxStackSize(1);
		this.setMaxDamage(15);
	}
	
	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return stack.getItemDamage() < 32;
	}

	@Override
	public ItemStack getContainerItem(ItemStack stack) {
		if (stack.attemptDamageItem(1, itemRand)) {
			return null;
		}

		return stack;
	}
}
