package AdditionCorrugated;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;

public class CreativeTabAdditionCorrugatedMOD_Development extends CreativeTabs
{
	public CreativeTabAdditionCorrugatedMOD_Development(String AdditionCorrugatedMOD_DevelopmentTab)
	{
		super(AdditionCorrugatedMOD_DevelopmentTab);
	}
	
	@Override
	public Item getTabIconItem()
	{
		return Item.getItemFromBlock(AdditionCorrugated.Block.Blocks.StrongCorrugated);
	}
}