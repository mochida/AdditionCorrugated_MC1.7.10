package AdditionCorrugated.ACFood;

import net.minecraft.item.*;
import net.minecraftforge.oredict.*;

public class ACFOreDictionary
{
	public static void init()
	{
		OreDictionary.registerOre("natto", new ItemStack(AdditionCorrugated.ACFood.Item.Items.FermentedSoybeans, 1, 0));
		
		OreDictionary.registerOre("soybeans", new ItemStack(AdditionCorrugated.ACFood.Item.Items.Soybeans, 1, 0));
		
		OreDictionary.registerOre("bottlesoysauce", new ItemStack(AdditionCorrugated.ACFood.Item.Items.SoySauce, 1, 0));
		
		OreDictionary.registerOre("Rice", new ItemStack(AdditionCorrugated.ACFood.Item.Items.Rice, 1, 0));
		
		OreDictionary.registerOre("JapaneseLeek", new ItemStack(AdditionCorrugated.ACFood.Item.Items.JapaneseLeek, 1, 0));
		
		OreDictionary.registerOre("GlutinousRice", new ItemStack(AdditionCorrugated.ACFood.Item.Items.GlutinousRice, 1, 0));
		
		OreDictionary.registerOre("RiceCake", new ItemStack(AdditionCorrugated.ACFood.Item.Items.RiceCake, 1, 0));
	}
}