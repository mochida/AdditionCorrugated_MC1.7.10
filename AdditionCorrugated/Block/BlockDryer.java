/**package AdditionCorrugated.Block;

import java.util.Random;
import AdditionCorrugated.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;

public class BlockDryer extends Block
{	
	public BlockDryer()
	{
		super(Material.tnt);
		setBlockName("BlockDryer");
		setBlockTextureName("additioncorrugated:dryer");
		setHardness(1.0F);
		setResistance(10.0F);
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
	
//	@Override
//	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
//	{
//		player.openGui(AdditionCorrugatedCore.instance, AdditionCorrugatedCore.ACRecycleGUI, world, x, y, z);
//		return true;
//	}
}**/