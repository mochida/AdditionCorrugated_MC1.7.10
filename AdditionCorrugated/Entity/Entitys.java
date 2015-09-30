package AdditionCorrugated.Entity;

import net.minecraft.entity.*;
import net.minecraft.world.biome.*;
import AdditionCorrugated.*;
import AdditionCorrugated.Entity.*;
import AdditionCorrugated.Entity.Render.*;
import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.relauncher.*;

public class Entitys
{
	public static int CorrugatedCreeperID;
	
	public static int CorrugatedZombieID;
	
	public static int CorrugatedSlimeID;
	
	public static int ACVillagerID;
	
	public static BiomeGenBase[] ABL;
	
	private ACTrade 取引;
	
	public static void register(AdditionCorrugatedCore Core)
	{
		ABL = (BiomeGenBase[]) BiomeGenBase.explorationBiomesList.toArray(new BiomeGenBase[0]);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		取引 = new ACTrade();
		
		VillagerRegistry.instance().registerVillagerId(ACVillagerID);
		VillagerRegistry.instance().registerVillageTradeHandler(ACVillagerID, 取引);
		
		EntityRegistry.registerModEntity(EntityCorrugatedCreeper.class, "CorrugatedCreeper", CorrugatedCreeperID, AdditionCorrugatedCore.instance, 250, 1, true);
		if(FMLCommonHandler.instance().getSide() == Side.CLIENT)
		{
			RenderingRegistry.registerEntityRenderingHandler(EntityCorrugatedCreeper.class, new RenderCorrugatedCreeper());
		}
		
		EntityRegistry.addSpawn(EntityCorrugatedCreeper.class, 10, 4, 4, EnumCreatureType.monster, ABL);
		
		EntityRegistry.registerModEntity(EntityCorrugatedZombie.class, "CorrugatedZombie", CorrugatedZombieID, AdditionCorrugatedCore.instance, 250, 1, true);
		if(FMLCommonHandler.instance().getSide() == Side.CLIENT)
		{
			RenderingRegistry.registerEntityRenderingHandler(EntityCorrugatedZombie.class, new RenderCorrugatedZombie());
		}
		
		EntityRegistry.addSpawn(EntityCorrugatedZombie.class, 75, 4, 75, EnumCreatureType.monster, ABL);
		
		EntityRegistry.registerModEntity(EntityCorrugatedSlime.class, "CorrugatedSlime", CorrugatedSlimeID, AdditionCorrugatedCore.instance, 250, 1, true);
		if(FMLCommonHandler.instance().getSide() == Side.CLIENT)
		{
			RenderingRegistry.registerEntityRenderingHandler(EntityCorrugatedSlime.class, new RenderCorrugatedSlime());
		}
		
		EntityRegistry.addSpawn(EntityCorrugatedSlime.class, 4, 4, 4, EnumCreatureType.monster, ABL);
	}
}