package AdditionCorrugated.CraftingEX;

import net.minecraft.item.*;
import cpw.mods.fml.common.*;

public class AC_CraftingEXFuelHandler implements IFuelHandler
{
	@Override
	public int getBurnTime(ItemStack fuel)
	{
		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugated.CraftingEX.Block.Blocks.RecycledCorrugated2))
		{
			return 500;
		}

		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugated.CraftingEX.Block.Blocks.RecycledCorrugatedLight2))
		{
			return 600;
		}
		
		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugated.CraftingEX.Block.Blocks.Corrugated2))
		{
			return 500;
		}

		if(fuel.getItem() == Item.getItemFromBlock(AdditionCorrugated.CraftingEX.Block.Blocks.CorrugatedLight2))
		{
			return 600;
		}
		
		return 0;
	}
}