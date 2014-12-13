package AdditionCorrugated;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabAdditionCorrugatedMOD_Under_Development extends CreativeTabs
{
	public CreativeTabAdditionCorrugatedMOD_Under_Development(String AdditionCorrugatedMOD_Under_DevelopmentTab)
	{
		super(AdditionCorrugatedMOD_Under_DevelopmentTab);
	}
	
	@Override
	public Item getTabIconItem()
	{
		return Item.getItemFromBlock(AdditionCorrugatedCore.StrongCorrugated);
	}
}