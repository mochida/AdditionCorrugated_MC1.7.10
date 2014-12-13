package AdditionCorrugated.Block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlockHalfCorrugatedLight extends BlockSlab
{

	public BlockHalfCorrugatedLight(boolean p_i45410_1_, Material p_i45410_2_)
	{
		super(p_i45410_1_, Material.tnt);
		setBlockName("BlockHalfCorrugatedLight");
		setBlockTextureName("additioncorrugated:block_corrugated");
		setHardness(0.2F);
		setResistance(0.0F);
		setStepSound(Block.soundTypeStone);
		setLightLevel(1.0F);
	}

	@Override
	public String func_150002_b(int p_150002_1_)
	{
		return null;
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