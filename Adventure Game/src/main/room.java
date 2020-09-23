package main;

public abstract class room 
{
	private String description;
	private room north, east, south, west;
	
	public room(String in)
	{
		description = in;
		
		this.setNorth(null);
		this.setEast(null);
		this.setSouth(null);
		this.setWest(null);
	}
	
	public void setNorth(room in)
	{
		if (in != null)
		{
			this.north = in;
		}
	}
	
	public void setEast(room in)
	{
		if (in != null)
		{
			this.east = in;
		}
	}
	
	public void setSouth(room in)
	{
		if (in != null)
		{
			this.south = in;
		}
	}
	
	public void setWest(room in)
	{
		if (in != null)
		{
			this.west = in;
		}
	}
	
	public room getNorth()
	{
		return north;
	}
	
	public room getEast()
	{
		return east;
	}
	
	public room getSouth()
	{
		return south;
	}
	
	public room getWest()
	{
		return west;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public boolean hasNorth()
	{
		if(this.getNorth() == null)
		{
			return false;
		}
		return true;
	}
	
	public boolean hasEast()
	{
		if(this.getEast() == null)
		{
			return false;
		}
		return true;
	}
	
	public boolean hasSouth()
	{
		if(this.getSouth() == null)
		{
			return false;
		}
		return true;
	}
	
	public boolean hasWest()
	{
		if(this.getWest() == null)
		{
			return false;
		}
		return true;
	}
}
