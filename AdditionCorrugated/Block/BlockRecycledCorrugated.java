package AdditionCorrugated.Block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRecycledCorrugated extends Block
{
	public BlockRecycledCorrugated()
	{
		super(Material.tnt);
		setBlockName("BlockRecycledCorrugated");
		setBlockTextureName("additioncorrugated:recycledcorrugated");
		setHardness(0.2F);
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