package AdditionCorrugated.Client;

import net.minecraft.util.ResourceLocation;
import AdditionCorrugated.*;
import AdditionCorrugated.common.CommonProxy;
import cpw.mods.fml.common.registry.VillagerRegistry;

public class ClientProxy extends CommonProxy
{
	public void init()
	{
		VillagerRegistry.instance().registerVillagerSkin(AdditionCorrugatedCore.ACVillagerID, new ResourceLocation("additioncorrugated", "textures/entity/acvillager.png"));
	}
}