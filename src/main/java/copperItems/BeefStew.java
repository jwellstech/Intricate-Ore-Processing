package copperItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BeefStew extends ItemFood {

	public BeefStew(String unlocalizedName, int amount, float saturation, boolean isWolfFood, PotionEffect... effects) {
		super(amount, saturation, isWolfFood);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setUnlocalizedName(unlocalizedName);
		this.effects = effects;
	}
	
	private PotionEffect[] effects;
	
	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);
		
		for (int i = 0; i < effects.length; i ++) {
			if (!world.isRemote && effects[i] != null && effects[i].getPotionID() > 0) {
				player.addPotionEffect(new PotionEffect(this.effects[i]));
			}
		}
	}
	
}
