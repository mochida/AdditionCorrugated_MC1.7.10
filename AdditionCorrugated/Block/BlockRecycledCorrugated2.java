package AdditionCorrugated.Block;

import java.util.Random;
import net.minecraft.block.*;

public class BlockRecycledCorrugated2 extends BlockGravel
{
	public BlockRecycledCorrugated2()
	{
		super();
		setBlockName("BlockRecycledCorrugated2");
		setBlockTextureName("additioncorrugated:recycledcorrugated");
		setHardness(0.5F);
		setResistance(0.0F);
		setStepSound(Block.soundTypeStone);
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random)
	{
		return quantityDroppedWithBonus(fortune, random);
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return 1;
	}
}