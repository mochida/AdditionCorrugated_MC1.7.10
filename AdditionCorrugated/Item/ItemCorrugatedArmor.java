//package AdditionCorrugated.Item;
//
//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;
//import net.minecraft.client.renderer.texture.IIconRegister;
//import net.minecraft.entity.*;
//import net.minecraft.item.*;
//import net.minecraft.util.IIcon;
//
//public class ItemCorrugatedArmor extends ItemArmor
//{
//	private IIcon ArmorIcon;
//
//	public ItemCorrugatedArmor(ArmorMaterial CORRUGATED_PG, int p1, int p2)
//	{
//		super(CORRUGATED_PG, p1, p2);
//	}
//	
//	public ItemCorrugatedArmor setArmorTexture(IIcon Icon)
//	{
//		ArmorIcon = Icon;
//		return this;
//	}
//	
//	@Override
//	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
//	{
//		return "additioncorrugated:armor_corrugated";
//	}
//}