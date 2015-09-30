package AdditionCorrugated.CraftingEX.Block;

import java.util.Random;

import net.minecraft.block.*;

public class BlockRecycledCorrugatedLight2 extends BlockGravel
{
	public BlockRecycledCorrugatedLight2()
	{
		super();
		setBlockName("BlockRecycledCorrugatedLight2");
		setBlockTextureName("additioncorrugated:recycledcorrugated");
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