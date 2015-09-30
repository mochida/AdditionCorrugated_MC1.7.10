package AdditionCorrugated.Block;

import java.util.Random;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.*;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.util.ForgeDirection;
import AdditionCorrugated.AdditionCorrugatedCore;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;

public class BlockCorrugated extends Block
{
	public BlockCorrugated()
	{
		super(Material.leaves);
		setBlockName("BlockCorrugated");
		setBlockTextureName("additioncorrugated:block_corrugated");
		setHardness(0.5F);
		setResistance(0.0F);
		setStepSound(Block.soundTypeStone);
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random)
	{
		return quantityDroppedWithBonus(fortune, random);
	}
	
	public int quantityDroppedWithBonus(Random rand)
	{
		return 1;
	}
}