package AdditionCorrugated.Item;

import AdditionCorrugated.AdditionCorrugatedCore;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemCutter extends Item
{
	private boolean repair = false;
	
	public ItemCutter()
	{
		super();
        this.setMaxStackSize(1);
        this.setMaxDamage(16);
	}
	
	@Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack)
    {
        return false;
    }
	
    @Override
    public boolean hasContainerItem(ItemStack stack)
    {
        return !repair;
    }
    
    @SubscribeEvent
	public void onCrafting(ItemCraftedEvent event)
	{
		repair = AdditionCorrugatedCore.Cutter == event.crafting.getItem();
	}
	
    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        if (itemStack != null && itemStack.getItem() == this)
        {
            itemStack.setItemDamage(itemStack.getItemDamage() + 1);
        }
        return itemStack;
    }
}