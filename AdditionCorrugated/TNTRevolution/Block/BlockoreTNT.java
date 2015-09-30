package AdditionCorrugated.TNTRevolution.Block;

import java.util.Random;

import AdditionCorrugated.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderHell;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.EnumPlantType;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockoreTNT extends Block implements IWorldGenerator
{
	
	public BlockoreTNT()
	{
		super(Material.iron);
		setBlockName("OreTNT");
		setBlockTextureName("additioncorrugated:block_oretnt");
		setHardness(3.5F);
		setResistance(5.0F);
		setStepSound(Block.soundTypeStone);
	}
	
	public int quantityDropped(int par1, Random rand, int par3)
	{
		return par1 > 0 ? 4 : 0;
	}
	
	public Block getItemDropped(int par1, Random rand)
	{
		return Blocks.tnt;
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		if(world.provider instanceof WorldProviderSurface)
		{
			this.generateOre(world, random, chunkX << 4, chunkZ << 4);
		}
	}

	private void generateOre(World world, Random random, int x, int z)
	{
		for (int i = 0; i < 20; ++i)
		{
			int genX = x + random.nextInt(16);
			int genY = 0 + random.nextInt(50);
			int genZ = z + random.nextInt(16);
			
			(new WorldGenMinable(AdditionCorrugated.TNTRevolution.Block.Blocks.oreTNT, 1 +  random.nextInt(4))).generate(world, random, genX, genY, genZ);
		}
	}
}