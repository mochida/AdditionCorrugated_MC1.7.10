package AdditionCorrugated.Block;

import java.util.Random;

import AdditionCorrugated.AdditionCorrugatedCore;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockCorrugatedChest extends BlockChest
{

	public BlockCorrugatedChest(int p_i45397_1_)
	{
		super(p_i45397_1_);
		setBlockName("BlockCorrugatedChest");
		setBlockTextureName("additioncorrugated:block_corrugated");
		setHardness(1.0F);
		setResistance(0.5F);
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
		
		public int getRenderType()
		{
			return AdditionCorrugatedCore.proxy.chestType;
		}
}