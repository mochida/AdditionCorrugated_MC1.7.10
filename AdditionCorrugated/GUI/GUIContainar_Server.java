package AdditionCorrugated.GUI;

import AdditionCorrugated.TileEntity.*;
import AdditionCorrugated.Block.BlockACrecycle;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.*;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;

public class GUIContainar_Server extends Container
{
	/**BlockACrecycle tile;
	public static final int sourceSize = 1;
	public static final int fuelSize = 0;//1
	public static final int productSize = 1;//5
	public static final int inventorySize = 27;
	public static final int hotbarSize = 9;
	public static final int sourceIndex = 0;
	public static final int fuelIndex = sourceIndex + sourceSize;
	public static final int productIndex = fuelIndex + fuelSize;
	public static final int inventoryIndex = productIndex + productSize;
	public static final int hotbarIndex = inventoryIndex + inventorySize;**/
	public static int xCoord, yCoord, zCoord;
	
	public GUIContainar_Server(int x, int y, int z/**, InventoryPlayer inventory, IInventory tile**/)
	{
		this.xCoord = x;
		this.yCoord = y;
		this.zCoord = z;
		/**tile = (IInventory) new BlockACrecycle();
		
		for(int i = 0; i < sourceSize; ++i)
		{
			this.addSlotToContainer(new Slot(tile, sourceIndex + i, x, y));
		}
		for(int i = 0; i < fuelSize; ++i)
		{
			this.addSlotToContainer(new Slot(tile, fuelIndex + i, x, y));
		}
		for(int i = 0; i < productSize; ++i)
		{
			this.addSlotToContainer(new Slot(tile, productIndex + i, x, y));
		}
		for (int i = 0; i < 3; ++i)
		{
			for (int j = 0; j < 9; ++j) {
				this.addSlotToContainer(new Slot(inventory, j + i * 9 + inventoryIndex, x, y));
			}
		}
		for (int i = 0; i < 9; ++i)
		{
			this.addSlotToContainer(new Slot(inventory, i, x, y));
		}**/
		}
	
	public boolean canInteractWith(EntityPlayer player)
	{
		return true;
	}
	
	/**@Override
	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int clickedIndex)
	{
 
		Slot slot = (Slot)this.inventorySlots.get(clickedIndex);
		if(slot == null)
		{
			return null;
		}
 
		if(slot.getHasStack() == false)
		{
			return null;
		}
 
		ItemStack itemStack = slot.getStack();
 
		ItemStack itemStackOrg = slot.getStack().copy();
 
		if(sourceIndex <= clickedIndex && clickedIndex <= sourceIndex + sourceSize)
		{
			if (!this.mergeItemStack(itemStack, inventoryIndex, inventoryIndex + inventorySize + hotbarSize, false))
			{
				return null;
				}
			slot.onSlotChange(itemStack, itemStackOrg);
		}
		else if(fuelIndex <= clickedIndex && clickedIndex < fuelIndex + fuelSize)
		{
			if(isSourceItem(itemStack))
			{
				if (!this.mergeItemStack(itemStack, sourceIndex, sourceIndex + sourceSize, false))
				{
					return null;
				}
				slot.onSlotChange(itemStack, itemStackOrg);
			}
			else {
				if (!this.mergeItemStack(itemStack, inventoryIndex, inventoryIndex + inventorySize + hotbarSize, false))
				{
					return null;
				}
				slot.onSlotChange(itemStack, itemStackOrg);
			}
		}
		else if(productIndex <= clickedIndex && clickedIndex < productIndex + productSize)
		{
			if (!this.mergeItemStack(itemStack, inventoryIndex, inventoryIndex + inventorySize + hotbarSize, false))
			{
				return null;
			}
 
			slot.onSlotChange(itemStack, itemStackOrg);
		}
		else if(inventoryIndex <= clickedIndex && clickedIndex < inventoryIndex + inventorySize)
		{
			if(isSourceItem(itemStack))
			{
				if (!this.mergeItemStack(itemStack, sourceIndex, sourceIndex + sourceSize, false))
				{
					return null;
				}
			}
			else if(isFuelItem(itemStack))
			{
				if (!this.mergeItemStack(itemStack, fuelIndex, fuelIndex + fuelSize, false))
				{
					return null;
				}
			}
			else
			{
				if (!this.mergeItemStack(itemStack, hotbarIndex, hotbarIndex + hotbarSize, false))
				{
					return null;
				}
			}
		}
		else if(hotbarIndex <= clickedIndex && clickedIndex < hotbarIndex + hotbarSize)
		{
			if(isSourceItem(itemStack))
			{
				if (!this.mergeItemStack(itemStack, sourceIndex, sourceIndex + sourceSize, false))
				{
					return null;
				}
			}
			else if(isFuelItem(itemStack))
			{
				if (!this.mergeItemStack(itemStack, fuelIndex, fuelIndex + fuelSize, false))
				{
					return null;
				}
			}
			else
			{
				if (!this.mergeItemStack(itemStack, inventoryIndex, inventoryIndex + inventorySize, false))
				{
					return null;
				}
			}
		}
 
		if (itemStack.stackSize == 0)
		{
			slot.putStack((ItemStack)null);
		}
		else
		{
			slot.onSlotChanged();
		}
		
		if (itemStack.stackSize == itemStackOrg.stackSize)
		{
			return null;
		}
		
		slot.onPickupFromSlot(par1EntityPlayer, itemStack);
		return itemStackOrg;
	}**/

	private boolean isFuelItem(ItemStack itemStack)
	{
		return true;
	}

	private boolean isSourceItem(ItemStack itemStack)
	{
		return true;
	}
}