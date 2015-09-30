package AdditionCorrugated;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;

public class CreativeTabAdditionCorrugatedMOD extends CreativeTabs
{
	public CreativeTabAdditionCorrugatedMOD(String AdditionCorrugatedMODTab)
	{
		super(AdditionCorrugatedMODTab);
	}
		
	@Override
	public Item getTabIconItem()
	{
		return Item.getItemFromBlock(AdditionCorrugated.Block.Blocks.Corrugated);
	}
}