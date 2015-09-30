package AdditionCorrugated;

import net.minecraftforge.common.config.*;
import cpw.mods.fml.common.*;

public class ACConfig
{
	public void Config(Configuration config)
	{
		try
		{
			config.load();
			AdditionCorrugated.Entity.Entitys.ACVillagerID = config.get("ID Setting", "ACVillagerID", 61, "Default:61").getInt();
			AdditionCorrugated.Entity.Entitys.CorrugatedCreeperID = config.get("ID Setting", "CorrugatedCreeperID", 25, "Default:25").getInt();
			AdditionCorrugatedCore.ACOre = config.get("Addon Setting", "ACOre", true, "Default:true").getBoolean();
			AdditionCorrugatedCore.TNTRevolution = config.get("Addon Setting", "TNTRevolution", true, "Default:true").getBoolean();
			AdditionCorrugatedCore.ACFood = config.get("Addon Setting", "ACFood", true, "Default:true").getBoolean();
		}
		catch (Exception e)
		{
			FMLLog.severe("Error Message(Config of AdditionCorrugated)");
		}
		finally
		{
			config.save();
		}
	}
}