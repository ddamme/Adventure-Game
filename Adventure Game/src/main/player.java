package main;
import weapons.*;
import rooms.*;
import armor.*;

public class player 
{
	private String name;
	private int hp;
	
	private weapon currentWeapon;
	private armor currentArmor;
	
	public player(String nameIn, int hpIn, weapon weaponIn, armor armorIn)
	{
		this.name = nameIn;
		this.hp = hpIn;
		this.currentWeapon = weaponIn;
		this.currentArmor = armorIn;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getHP()
	{
		return this.hp;
	}
	
	
}
