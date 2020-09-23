package weapons;
import main.item;

public abstract class weapon extends item
{
	private int maxDmg;
	private int minDmg;
	
	
	public weapon(String nameIn, int maxDmgIn, int minDmgIn)
	{
		super(nameIn);
		this.maxDmg = maxDmgIn;
		this.minDmg = minDmgIn;
		
	}
	
	public int getMaxDmg()
	{
		return this.maxDmg;
	}
	
	public int getMinDmg()
	{
		return this.minDmg;
	}
	
}
