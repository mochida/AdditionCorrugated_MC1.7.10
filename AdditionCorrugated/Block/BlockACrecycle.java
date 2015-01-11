package AdditionCorrugated.Block;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import AdditionCorrugated.AdditionCorrugatedCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockACrecycle extends Block
{
//	public ItemStack[] itemStacks = new ItemStack[10];
	
	public BlockACrecycle()
	{
		super(Material.tnt);
		setBlockName("BlockACrecycle");
		setBlockTextureName("additioncorrugated:block_acrecycle");
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
	
	@Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
	{
		player.openGui(AdditionCorrugatedCore.instance, AdditionCorrugatedCore.ACRecycleGUI, world, x, y, z);
		return true;
    }
	
//	public int addACRecycleRecipe()
//	{
//		return (Integer) null;		
//	}
}