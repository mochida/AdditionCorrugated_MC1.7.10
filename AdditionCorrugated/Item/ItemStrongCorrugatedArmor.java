package AdditionCorrugated.Item;

import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.item.ItemArmor.*;

public class ItemStrongCorrugatedArmor extends ItemArmor
{
	public static final String StrongCorrugatedHelmet = "additioncorrugated:textures/item/strongcorrugatedhelmet.png";
	
	public static final String StrongCorrugatedChestplate = "additioncorrugated:textures/item/strongcorrugatedplate.png";
	
    public static final String StrongCorrugatedLeggings = "additioncorrugated:textures/item/strongcorrugatedleg.png";
    
    public static final String StrongCorrugatedBoots = "additioncorrugated:textures/item/strongcorrugatedboots.png";
    
    public ItemStrongCorrugatedArmor(ArmorMaterial StrongCorrugatedArmor, int par2, int par3)
	{
		super(AdditionCorrugated.Item.Items.StrongCorrugatedArmorMaterial, 0, 1);
	}
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
    {
    	if(4 - slot == 0)
    	{
    		return StrongCorrugatedHelmet;
    	}
    	if(4 - slot == 1)
    	{
    		return StrongCorrugatedChestplate;
    	}
    	if(4 - slot == 2)
    	{
    		return StrongCorrugatedLeggings;
    	}
    	if(4 - slot == 3)
    	{
    		return StrongCorrugatedBoots;
    	}
    	
		return "";
	}
}