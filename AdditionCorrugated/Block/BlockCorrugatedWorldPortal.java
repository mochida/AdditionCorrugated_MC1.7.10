package AdditionCorrugated.Block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class BlockCorrugatedWorldPortal extends Block
{
	public BlockCorrugatedWorldPortal(Material p_i45394_1_)
	{
		super(p_i45394_1_);
		setBlockName("BlockCorrugatedWorldPortal");
		setBlockTextureName("additioncorrugated:corrugatedworldpotal");
		setHardness(5.0F);
		setResistance(5.0F);
		setStepSound(Block.soundTypeStone);
	}
	
//	@Override
//	 public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
//	{
//		if (p_149727_1_.provider.dimensionId != AdditionCorrugatedCore.CorrugatedDimesionID)
//		{
//			if (p_149727_5_ instanceof EntityPlayerMP)
//				{
//				EntityPlayerMP entityPlayerMP = (EntityPlayerMP) p_149727_5_;
//				ServerConfigurationManager serverConfigurationManager = entityPlayerMP.mcServer.getConfigurationManager();
//				WorldServer worldServer = entityPlayerMP.mcServer.worldServerForDimension(AdditionCorrugatedCore.CorrugatedDimesionID);
//				entityPlayerMP.timeUntilPortal = 19;
//				entityPlayerMP.setInPortal();
//				serverConfigurationManager.transferPlayerToDimension(entityPlayerMP, AdditionCorrugatedCore.CorrugatedDimesionID, new TeleporterCorrugated(worldServer));
//				}
//		}
//		else
//		{
//			if (p_149727_5_ instanceof EntityPlayerMP)
//			{
//				EntityPlayerMP entityPlayerMP = (EntityPlayerMP) p_149727_5_;
//				ServerConfigurationManager serverConfigurationManager = entityPlayerMP.mcServer.getConfigurationManager();
//				entityPlayerMP.setInPortal();
//				entityPlayerMP.timeUntilPortal = 19;
//				serverConfigurationManager.transferPlayerToDimension(entityPlayerMP, 0);
//			}
//		}
//		return true;
//	}
//	
	public int quantityDropped(int meta, int fortune, Random random)
	{
		return quantityDroppedWithBonus(fortune, random);
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return 1;
	}
}