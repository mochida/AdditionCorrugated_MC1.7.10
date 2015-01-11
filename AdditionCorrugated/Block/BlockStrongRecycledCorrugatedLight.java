package AdditionCorrugated.Block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockStrongRecycledCorrugatedLight extends Block
{
	public BlockStrongRecycledCorrugatedLight()
	{
		super(Material.tnt);
		setBlockName("BlockStrongRecycledCorrugatedLight");
		setBlockTextureName("additioncorrugated:strongrecycledcorrugated");
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