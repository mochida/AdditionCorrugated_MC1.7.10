package AdditionCorrugated.Block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGravel;

public class BlockSilverGravel extends BlockGravel
{
	public BlockSilverGravel()
	{
		super();
		setBlockName("BlockSilverGravel");
		setBlockTextureName("additioncorrugated:block_silvergravel");
		setHardness(1.0F);
		setResistance(1.0F);
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