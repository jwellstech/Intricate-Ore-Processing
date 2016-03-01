package basicCrusher;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.inventory.SlotFurnaceOutput;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerBasicCrusher extends Container {
	private final IInventory tileBasicCrusher;
	private int field_178152_f;
	private int field_178153_g;
	private int field_178154_h;
	private int field_178155_i;
	private Object BasicCrusherRecipes;
	
	public ContainerBasicCrusher(InventoryPlayer playerInventory, IInventory basicCrusherInventory) {
		this.tileBasicCrusher = basicCrusherInventory;
		this.addSlotToContainer(new Slot(basicCrusherInventory, 0 ,56, 17));
		this.addSlotToContainer(new SlotFurnaceFuel(basicCrusherInventory, 1, 56, 53));
		this.addSlotToContainer(new Slot(basicCrusherInventory, 2, 29, 53));  //Grindstone
		this.addSlotToContainer(new SlotFurnaceOutput(playerInventory.player, basicCrusherInventory, 3, 111, 18));
		this.addSlotToContainer(new SlotFurnaceOutput(playerInventory.player, basicCrusherInventory, 4, 111, 53)); //Cobble
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		for (int k = 0; k < 9; k++) {
			this.addSlotToContainer(new Slot(playerInventory, k, 8 + k * 18, 142));
		}
	}
		public void onCraftGuiOpened(ICrafting listener) {
			super.onCraftGuiOpened(listener);
			listener.sendAllWindowProperties(this, this.tileBasicCrusher);
		}
	
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
	
		for (int i = 0; i < this.crafters.size(); i++) {
			ICrafting icrafting = (ICrafting)this.crafters.get(i);
			if (this.field_178152_f != this.tileBasicCrusher.getField(2)) {
				icrafting.sendProgressBarUpdate(this, 2, this.tileBasicCrusher.getField(2));
			}
			if (this.field_178154_h != this.tileBasicCrusher.getField(0)) {
				icrafting.sendProgressBarUpdate(this, 0, this.tileBasicCrusher.getField(0));
			}
			if (this.field_178155_i != this.tileBasicCrusher.getField(1)) {
				icrafting.sendProgressBarUpdate(this, 1, this.tileBasicCrusher.getField(1));
			}
			if (this.field_178153_g != this.tileBasicCrusher.getField(3)) {
				icrafting.sendProgressBarUpdate(this, 3, this.tileBasicCrusher.getField(3));
			}
		}
	
		this.field_178152_f = this.tileBasicCrusher.getField(2);
		this.field_178154_h = this.tileBasicCrusher.getField(0);
		this.field_178155_i = this.tileBasicCrusher.getField(1);
		this.field_178153_g = this.tileBasicCrusher.getField(3);
	}
	
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int id, int data) {
		this.tileBasicCrusher.setField(id, data);
	}
	public boolean canInteractWith(EntityPlayer playerIn) {
		return this.tileBasicCrusher.isUseableByPlayer(playerIn);
	}
	
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
		ItemStack itemstack = null;
		Slot slot = (Slot)this.inventorySlots.get(index);
	
		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			
			if (index == 2) {
				if (!this.mergeItemStack(itemstack1, 3, 39, true)) {
					return null;
				}
				slot.onSlotChange(itemstack1, itemstack);
				
			}
			else if (index >= 1 && index != 0) {
				if (basicCrusher.BasicCrusherRecipes.instance().getCrushingResult(itemstack1) != null) {
					if (!this.mergeItemStack(itemstack1, 0, 1, false)) {
						return null;
					}
				}
			
			else if (TileEntityBasicCrusher.isItemFuel(itemstack1)) {
				if (!this.mergeItemStack(itemstack1, 30, 39, false)) {
					return null;
				}
			}
			else if (index >= 3 && index < 30) {
				if (!this.mergeItemStack(itemstack1, 30, 39, false)) {
					return null;
				}
			}
			else if (index >=30 && index < 39 && !this.mergeItemStack(itemstack1, 3, 30, false)) {
				return null;
			}
		}
			else if (!this.mergeItemStack(itemstack1, 3, 39, false)) {
				return null;
			}
	if (itemstack1.stackSize == 0) {
		slot.putStack((ItemStack)null);
	}
	else {
		slot.onSlotChanged();
	}
	if (itemstack1.stackSize == itemstack.stackSize) {
		return null;
	}
	slot.onPickupFromSlot(playerIn, itemstack1);
	}
	
	return itemstack;
	
	
	
}
}
