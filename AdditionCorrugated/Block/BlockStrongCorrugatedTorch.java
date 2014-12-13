package AdditionCorrugated.Block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;

public class BlockStrongCorrugatedTorch extends BlockTorch
{
	public BlockStrongCorrugatedTorch()
	{
		super();
		setBlockName("StrongCorrugatedTorch");
		setBlockTextureName("additioncorrugated:block_strongcorrugatedtorch");
		setHardness(10.0F);
		setResistance(500.0F);
		setStepSound(Block.soundTypeStone);
		setLightLevel(1.0F);
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
