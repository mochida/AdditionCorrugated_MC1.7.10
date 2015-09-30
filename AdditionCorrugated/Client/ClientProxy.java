package AdditionCorrugated.Client;

import net.minecraft.util.*;
import AdditionCorrugated.*;
import AdditionCorrugated.Common.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.relauncher.*;

public class ClientProxy extends CommonProxy
{
	public void init()
	{
		VillagerRegistry.instance().registerVillagerSkin(AdditionCorrugated.Entity.Entitys.ACVillagerID, new ResourceLocation("additioncorrugated", "textures/entity/acvillager.png"));
	}
}