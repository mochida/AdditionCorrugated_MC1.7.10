package AdditionCorrugated.Block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockCorrugatedChest extends BlockChest
{

	public BlockCorrugatedChest(int p_i45397_1_)
	{
		super(p_i45397_1_);
		setBlockName("BlockCorrugatedChest");
		setBlockTextureName("additioncorrugated:no");
		setHardness(0.2F);
		setResistance(0.0F);
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
		
//		public boolean isBlockNormalCube(World world, int x, int y, int z)
//		{
//			return true;
//		}
		
//		public boolean isBlockSolidOnSide(World world, int x, int y, int z, ForgeDirection side)
//		{
//			return true;
//		}

//		boolean isBlockReplaceable(World world, int x, int y, int z)
//		{
//			return true;
//		}

//		public boolean isBlockBurning(World world, int x, int y, int z)
//		{
//			return true;
//		}

//		public int getFlammability(IBlockAccess world, int x, int y, int z, int metadata, ForgeDirection face)
//		{
//			return 10;
//		}

//		public boolean isFlammable(IBlockAccess world, int x, int y, int z, int metadata, ForgeDirection face)
//		{
//			return true;
//		}

//		public int getFireSpreadSpeed(World world, int x, int y, int z, int metadata, ForgeDirection face)
//		{
//			return 50;
//		}

//		public boolean canCreatureSpawn(EnumCreatureType type, World world, int x, int y, int z)
//		{
//			return true;
//		}
}