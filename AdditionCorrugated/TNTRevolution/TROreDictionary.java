package AdditionCorrugated.TNTRevolution;

import net.minecraft.item.*;
import net.minecraftforge.oredict.*;

public class TROreDictionary
{
	public static void init()
	{
		OreDictionary.registerOre("oreTNT", new ItemStack(AdditionCorrugated.TNTRevolution.Block.Blocks.oreTNT, 1, 0));
	}
}