package AdditionCorrugated.Block;

import java.util.Random;
import net.minecraft.block.*;

public class BlockCorrugatedLight2 extends BlockGravel
{
	public BlockCorrugatedLight2()
	{
		super();
		setBlockName("BlockCorrugatedLight2");
		setBlockTextureName("additioncorrugated:block_corrugated");
		setHardness(0.5F);
		setResistance(0.0F);
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