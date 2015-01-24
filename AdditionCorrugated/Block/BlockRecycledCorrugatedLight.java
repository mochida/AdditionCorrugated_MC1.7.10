package AdditionCorrugated.Block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRecycledCorrugatedLight extends Block
{
	public BlockRecycledCorrugatedLight()
	{
		super(Material.tnt);
		setBlockName("BlockRecycledCorrugatedLight");
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