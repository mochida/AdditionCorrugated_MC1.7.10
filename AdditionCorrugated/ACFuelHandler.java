package AdditionCorrugated;

import net.minecraft.item.*;
import cpw.mods.fml.common.*;

public class ACFuelHandler implements IFuelHandler
{
	@Override
	public int getBurnTime(ItemStack fuel)
	{
		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugated.Block.Blocks.Corrugated))
		{
			return 500;
		}

		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugated.Block.Blocks.HalfCorrugated))
		{
			return 250;
		}
		
		if(fuel.getItem().equals(AdditionCorrugated.Item.Items.CorrugatedBoard))
		{
			return 100;
		}
		
		if(fuel.getItem().equals(AdditionCorrugated.Item.Items.CorrugatedAxe))
		{
			return 250;
		}
		
		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugated.Block.Blocks.CorrugatedChest))
		{
			return 800;
		}
		
		if(fuel.getItem().equals(AdditionCorrugated.Item.Items.CorrugatedHoe))
		{
			return 250;
		}
		
		if(fuel.getItem().equals(AdditionCorrugated.Item.Items.CorrugatedPickaxe))
		{
			return 250;
		}
		
		if(fuel.getItem().equals(AdditionCorrugated.Item.Items.CorrugatedShovel))
		{
			return 250;
		}
		
		if(fuel.getItem().equals(AdditionCorrugated.Item.Items.CorrugatedSword))
		{
			return 250;
		}
		
		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugated.Block.Blocks.RecycledCorrugated))
		{
			return 500;
		}
		
		return 0;
	};
}