package AdditionCorrugated.Block;

import java.util.Random;
import AdditionCorrugated.AdditionCorrugatedCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockACrecycle extends Block
{
	public BlockACrecycle()
	{
		super(Material.tnt);
		setBlockName("BlockACrecycle");
		setBlockTextureName("additioncorrugated:block_acrecycle");
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
	
	public boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, int side)
	{
		return true;
	}
}