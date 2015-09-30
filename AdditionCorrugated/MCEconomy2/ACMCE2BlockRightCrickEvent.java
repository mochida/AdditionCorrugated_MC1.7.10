package AdditionCorrugated.MCEconomy2;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.eventhandler.Cancelable;
import cpw.mods.fml.common.eventhandler.Event;

@Cancelable
@Event.HasResult
public class ACMCE2BlockRightCrickEvent extends Event
{
	public final World world;
	public final EntityPlayer player;
	public final ItemStack heldItem;
	
	public final int posX;
	public final int posY;
	public final int posZ;
	
	public ACMCE2BlockRightCrickEvent(World thisWorld, EntityPlayer thisPlayer, ItemStack item, int X, int Y, int Z)
	{
		this.world = thisWorld;
		this.player = thisPlayer;
		this.heldItem = item;
		this.posX = X;
		this.posY = Y;
		this.posZ = Z;
	}
}