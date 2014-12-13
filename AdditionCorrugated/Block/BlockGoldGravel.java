package AdditionCorrugated.Block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGravel;

public class BlockGoldGravel extends BlockGravel
{
	public BlockGoldGravel()
	{
		super();
		setBlockName("BlockGoldGravel");
		setBlockTextureName("additioncorrugated:block_goldgravel");
		setHardness(1.5F);
		setResistance(1.5F);
		setStepSound(Block.soundTypeGravel);
	}
	
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
