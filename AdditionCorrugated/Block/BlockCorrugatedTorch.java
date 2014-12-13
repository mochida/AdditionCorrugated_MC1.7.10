package AdditionCorrugated.Block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockCorrugatedTorch extends BlockTorch
{
	public BlockCorrugatedTorch()
	{
		super();
		setBlockName("CorrugatedTorch");
		setBlockTextureName("additioncorrugated:block_corrugatedtorch");
		setHardness(0.2F);
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