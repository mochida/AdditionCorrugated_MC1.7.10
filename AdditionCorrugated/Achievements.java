package AdditionCorrugated;

import net.minecraft.item.*;
import net.minecraft.stats.*;
import net.minecraftforge.common.*;

public class Achievements
{
	public static Achievement Corrugated;
	
	public static Achievement StrongPaper;
	
	public static Achievement StrongCorrugated;
	
	public static Achievement Cutter;
	
	public static Achievement RecycledPaper;
	
	public static Achievement Star;
	
	public static Achievement CorrugatedCreeper;
	
	public static Achievement CorrugatedLight;
	
	public static Achievement CorrugatedChest;
	
	public static Achievement HalfCorrugated;
	
	public static Achievement RecycledCorrugated;
	
	public static Achievement[] ACAchievementList;
	
	public static AchievementPage ACAchievementPage;
	
	public static final String newAchievement = "AdditionCorrugated"; 
	
	public static void register()
	{
		Corrugated = (new Achievement("Corrugated", "Corrugated", 0, 0, new ItemStack(AdditionCorrugated.Block.Blocks.Corrugated, 1, 0), AchievementList.openInventory)).initIndependentStat().registerStat();
		
		StrongPaper = new Achievement("StrongPaper", "StrongPaper", 1, -1, new ItemStack(AdditionCorrugated.Item.Items.StrongPaper, 1, 0), Corrugated).initIndependentStat().registerStat();
		
		StrongCorrugated = new Achievement("StrongCorrugated", "StrongCorrugated", 3, -1, new ItemStack(AdditionCorrugated.Block.Blocks.StrongCorrugated, 1, 0), StrongPaper).initIndependentStat().registerStat();
		
		Cutter = new Achievement("Cutter", "Cutter", 0, -2, new ItemStack(AdditionCorrugated.Item.Items.Cutter, 1, 0), Corrugated).initIndependentStat().registerStat();
		
		Star = new Achievement("Star", "Star", -2, 0, new ItemStack(AdditionCorrugated.Item.Items.Star, 1, 0), null).initIndependentStat().registerStat();
		
		RecycledPaper = new Achievement("RecycledPaper", "RecycledPaper", -1, 0, new ItemStack(AdditionCorrugated.Item.Items.RecycledPaper, 1, 0), AchievementList.openInventory).initIndependentStat().registerStat();
		
		CorrugatedCreeper = new Achievement("CorrugatedCreeper", "CorrugatedCreeper", 2, 0, new ItemStack(AdditionCorrugated.Item.Items.Spawn_Egg_CorrugatedCreeper, 1, 0), Corrugated).initIndependentStat().registerStat();
		
		CorrugatedLight = new Achievement("CorrugatedLight", "CorrugatedLight", 0, 2, new ItemStack(AdditionCorrugated.Block.Blocks.CorrugatedLight, 1, 0), Corrugated).initIndependentStat().registerStat();
		
		CorrugatedChest = new Achievement("CorrugatedChest", "CorrugatedChest", 1, 1, new ItemStack(AdditionCorrugated.Block.Blocks.CorrugatedChest, 1, 0), Corrugated).initIndependentStat().registerStat();
		
		HalfCorrugated = new Achievement("HalfCorrugated", "HalfCorrugated", 2, -2, new ItemStack(AdditionCorrugated.Block.Blocks.HalfCorrugated, 1, 0), Cutter).initIndependentStat().registerStat();
		
		RecycledCorrugated = new Achievement("RecycledCorrugated", "RecycledCorrugated", -1, 2, new ItemStack(AdditionCorrugated.Block.Blocks.RecycledCorrugated, 1, 0), RecycledPaper).initIndependentStat().registerStat();
		
		ACAchievementList = new Achievement[] {Corrugated, StrongPaper, StrongCorrugated, Cutter, Star, RecycledPaper, CorrugatedCreeper, CorrugatedLight, CorrugatedChest, HalfCorrugated, RecycledCorrugated};
		
		ACAchievementPage = new AchievementPage(newAchievement, ACAchievementList);
		
		ACAchievementPage.registerAchievementPage(ACAchievementPage);
		
		AdditionCorrugatedCore.proxy.init();
	}
}