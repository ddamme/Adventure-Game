package main;

public abstract class item 
{

	private String name;
	
	public item(String nameIn) 
	{
		this.name = nameIn;
		
	}
	
	public item()
	{
		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	

}
