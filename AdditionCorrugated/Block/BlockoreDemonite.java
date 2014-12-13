package AdditionCorrugated.Block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.EnumPlantType;
import AdditionCorrugated.AdditionCorrugatedCore;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockoreDemonite extends Block implements IWorldGenerator
{
	
	public BlockoreDemonite()
	{
		super(Material.iron);
		setBlockName("OreDemonite");
		setBlockTextureName("additioncorrugated:block_oredemonite");
		setHardness(3.0F);
		setResistance(1.0F);
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
	
	public int quantityDroppedWithBonus(int par1, Random rand)
	{
		int var3 = this.quantityDropped(rand) + rand.nextInt(1 +par1);
		
		if (var3 > 2)
		{
			var3 = 2;
		}
		
		return var3;
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
		for (int i = 0; i < 10; ++i)
		{
			int genX = x + random.nextInt(16);
			int genY = 0 + random.nextInt(25);
			int genZ = z + random.nextInt(16);
			
			(new WorldGenMinable(AdditionCorrugatedCore.oreDemonite, 5)).generate(world, random, genX, genY, genZ);
		}
	}
}