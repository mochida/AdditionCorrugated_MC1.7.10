package AdditionCorrugated.Block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;

public class BlockTemperedGlass extends Block
{
	public BlockTemperedGlass()
	{
		super(Material.glass);
		setBlockName("TemperedGlass");
		setBlockTextureName("additioncorrugated:block_temperedglass");
		setHardness(5.0F);
		setResistance(100.0F);
		setStepSound(Block.soundTypeGlass);
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
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
}