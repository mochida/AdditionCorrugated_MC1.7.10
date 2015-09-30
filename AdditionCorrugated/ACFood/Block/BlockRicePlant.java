package AdditionCorrugated.ACFood.Block;

import java.util.Random;

import AdditionCorrugated.ACFood.Item.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraftforge.common.*;

public class BlockRicePlant extends BlockCrops
{
	@SideOnly(Side.CLIENT)
	private IIcon[] icon;
	
	public BlockRicePlant()
	{
		super();
		setBlockName("BlockRicePlant");
		setStepSound(soundTypeGrass);
	}
	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z)
	{
		return EnumPlantType.Crop;
	}
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random)
	{
		if (meta == 5 || meta == 6)
		{
			int ret = 1;
			for (int n = 0; n < 3 + fortune; n++)
			{
				if (random.nextInt(15) <= meta)
				{
					ret++;
				}
			}
			return ret;
		}
		else
		{
			return 1;
		}
	}
	
	@Override
	public Item getItemDropped(int par1, Random par2random, int par3)
	{
		if (par1 >= 7)
		{
			return this.func_149865_P();
		}
		else
		{
			return this.func_149866_i();
		}
	}
	
	@Override
	protected Item func_149865_P()
	{
		return Items.Rice;
	}
	
	@Override
	protected Item func_149866_i()
	{
		return Item.getItemFromBlock(Blocks.RicePlant);
	}
	
	@Override
	public IIcon getIcon(int par1, int par2)
	{
		if (par2 < 5)
		{
			return this.icon[par2 >> 1];
		}
		else if (par2 < 7)
		{
			return this.icon[3];
		}
		else
		{
			return this.icon[4];
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1)
	{
		icon = new IIcon[5];
		
		for (int i = 0; i < this.icon.length; ++i)
		{
			this.icon[i] = par1.registerIcon("additioncorrugated:Rplant" + i);
		}
    }
}