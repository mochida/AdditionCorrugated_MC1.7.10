package AdditionCorrugated.Block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGravel;
import net.minecraft.block.material.Material;

public class BlockStarGravel extends BlockGravel
{
	public BlockStarGravel()
	{
		super();
		setBlockName("BlockStarGravel");
		setBlockTextureName("additioncorrugated:block_stargravel");
		setHardness(0.5F);
		setResistance(0.5F);
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