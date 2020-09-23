package armor;
import main.item;

public abstract class armor extends item
{
	private int durability;
	
	public armor(String nameIn, int durabilityIn)
	{
		super(nameIn);
		this.durability = durabilityIn;
	}
	
	public int getDurability()
	{
		return this.durability;
	}
	
	public void setDurability(int newDurability)
	{
		this.durability = newDurability;
	}
	
	public void minusDurability(int durabilityIn)
	{
		this.durability = durability - durabilityIn;
	}
}
