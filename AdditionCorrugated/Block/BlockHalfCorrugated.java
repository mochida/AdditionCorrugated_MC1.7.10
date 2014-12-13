package AdditionCorrugated.Block;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockHalfCorrugated extends BlockSlab
{

	public BlockHalfCorrugated(boolean p_i45410_1_, Material p_i45410_2_)
	{
		super(p_i45410_1_, Material.tnt);
		setBlockName("BlockHalfCorrugated");
		setBlockTextureName("additioncorrugated:block_corrugated");
		setHardness(0.2F);
		setResistance(0.0F);
		setStepSound(Block.soundTypeStone);
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
	
	public boolean isBlockNormalCube(World world, int x, int y, int z)
	{
		return false;
	}
	
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item par1, List par2List)
	{
		par2List.add(new ItemStack(this));
	}
}