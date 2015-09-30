package AdditionCorrugated.MCEconomy2;

import AdditionCorrugated.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraftforge.oredict.*;
import cpw.mods.fml.common.registry.*;

public class Recipes
{
	public void addRecipe()
	{
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(AdditionCorrugated.MCEconomy2.Block.Blocks.ACVendingMachine, 1, 0),
				new Object[]{"XYX","XYX","XXX",
					Character.valueOf('X'), "ingotSilver",
					Character.valueOf('Y'), "ingotMythril"}));
	}
}