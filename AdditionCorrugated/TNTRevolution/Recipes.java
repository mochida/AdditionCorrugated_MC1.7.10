package AdditionCorrugated.TNTRevolution;

import net.minecraft.init.*;
import net.minecraft.item.*;
import cpw.mods.fml.common.registry.*;

public class Recipes
{
	public void addSmelting()
	{
		GameRegistry.addSmelting(AdditionCorrugated.TNTRevolution.Block.Blocks.oreTNT, new ItemStack(Blocks.tnt, 1), 0.99F);
	}
	
	public void addShapelessRecipe()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.TNTRevolution.Block.Blocks.TStone, 1),
				new Object[]{
					new ItemStack(Blocks.tnt,1),new ItemStack(Blocks.stone,1)});
	}
}