package AdditionCorrugated.Item;

import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.item.Item.*;
import net.minecraftforge.common.util.*;

public class ItemCorrugatedArmor extends ItemArmor
{
	public static final String CorrugatedHelmet = "additioncorrugated:textures/item/helmet.png";
	
	public static final String CorrugatedChestplate = "additioncorrugated:textures/item/plate.png";
	
    public static final String CorrugatedLeggings = "additioncorrugated:textures/item/leg.png";
    
    public static final String CorrugatedBoots = "additioncorrugated:textures/item/boots.png";
    
    public ItemCorrugatedArmor(ArmorMaterial CorrugatedArmor, int par2, int par3)
	{
		super(AdditionCorrugated.Item.Items.CorrugatedArmorMaterial, 0, 0);
	}
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
    {
    	if(4 - slot == 0)
    	{
    		return CorrugatedHelmet;
    	}
    	if(4 - slot == 1)
    	{
    		return CorrugatedChestplate;
    	}
    	if(4 - slot == 2)
    	{
    		return CorrugatedLeggings;
    	}
    	if(4 - slot == 3)
    	{
    		return CorrugatedBoots;
    	}
    	
		return "";
	}
}