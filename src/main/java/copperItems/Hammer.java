package copperItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Hammer extends Item {

	public Hammer(String unlocalizedName) {
		super();
		
		this.setMaxStackSize(1);
		this.setMaxDamage(32);
//		this.onItemRightClick(itemStackIn, worldIn, playerIn){itemStackIn.damageItem(1,playerIn);}
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabMisc);
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
