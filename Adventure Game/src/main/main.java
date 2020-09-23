package main;
import rooms.*;
import weapons.*;

public class main
{
	
	public static void main(String args[])
	{
		
		dungeonEntrance a = new dungeonEntrance();
		fountain b = new fountain();
		jailCell c = new jailCell();
		storageRoom d = new storageRoom();
		
		a.setNorth(c);
		a.setEast(d);
		a.setWest(b);
		
		b.setEast(a);
		c.setSouth(a);
		d.setWest(a);
		
		
		shortSword short_sword = new shortSword();
		
		player Dillon = new player("Dillon", 50, short_sword, null);
		
		game currentGame = new game(Dillon, a);
		
		currentGame.gameStart();
		currentGame.gameRun();
	}
}
