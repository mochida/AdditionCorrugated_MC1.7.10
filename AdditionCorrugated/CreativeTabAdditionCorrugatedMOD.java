package AdditionCorrugated;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabAdditionCorrugatedMOD extends CreativeTabs
{
	public CreativeTabAdditionCorrugatedMOD(String AdditionCorrugatedMODTab)
	{
		super(AdditionCorrugatedMODTab);
	}
		
	@Override
	public Item getTabIconItem()
	{
		return Item.getItemFromBlock(AdditionCorrugatedCore.Corrugated);
	}
}