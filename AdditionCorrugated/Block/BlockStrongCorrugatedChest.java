package AdditionCorrugated.Block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;

public class BlockStrongCorrugatedChest extends BlockChest
{
	public BlockStrongCorrugatedChest(int p_i45397_1_)
	{
		super(p_i45397_1_);
		setBlockName("BlockStrongCorrugatedChest");
		setBlockTextureName("additioncorrugated:no");
		setHardness(10.0F);
		setResistance(500.0F);
		setStepSound(Block.soundTypeStone);
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