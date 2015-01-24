package AdditionCorrugated;

import net.minecraft.item.*;
import cpw.mods.fml.common.*;
import AdditionCorrugated.*;

public class ACFuelHandler implements IFuelHandler
{
	@Override
	public int getBurnTime(ItemStack fuel)
	{
		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugatedCore.Corrugated))
		{
			return 500;
		}

		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugatedCore.CorrugatedLight))
		{
			return 600;
		}

		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugatedCore.HalfCorrugated))
		{
			return 250;
		}
		
		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugatedCore.HalfCorrugatedLight))
		{
			return 300;
		}
		
		if(fuel.getItem().equals(AdditionCorrugatedCore.CorrugatedBoard))
		{
			return 100;
		}
		
		if(fuel.getItem().equals(AdditionCorrugatedCore.CorrugatedAxe))
		{
			return 250;
		}
		
		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugatedCore.CorrugatedChest))
		{
			return 800;
		}
		
		if(fuel.getItem().equals(AdditionCorrugatedCore.CorrugatedHoe))
		{
			return 250;
		}
		
		if(fuel.getItem().equals(AdditionCorrugatedCore.CorrugatedPickaxe))
		{
			return 250;
		}
		
		if(fuel.getItem().equals(AdditionCorrugatedCore.CorrugatedShovel))
		{
			return 250;
		}
		
		if(fuel.getItem().equals(AdditionCorrugatedCore.CorrugatedSword))
		{
			return 250;
		}
		
		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugatedCore.RecycledCorrugated))
		{
			return 500;
		}

		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugatedCore.RecycledCorrugatedLight))
		{
			return 600;
		}
		
		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugated.CraftingEX.Blocks.RecycledCorrugated2))
		{
			return 500;
		}

		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugated.CraftingEX.Blocks.RecycledCorrugatedLight2))
		{
			return 600;
		}
		
		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugated.CraftingEX.Blocks.Corrugated2))
		{
			return 500;
		}

		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugated.CraftingEX.Blocks.CorrugatedLight2))
		{
			return 600;
		}
		return 0;
	};
}