package copperItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Sandpaper extends Item {

	public Sandpaper(String unlocalizedName) {
		super();

		this.setMaxStackSize(1);
		this.setMaxDamage(16);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return stack.getItemDamage() < 16;
	}

	@Override
	public ItemStack getContainerItem(ItemStack stack) {
		if (stack.attemptDamageItem(1, itemRand)) {
			return null;
		}

		return stack;
	}
}
