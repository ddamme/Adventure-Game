package main;

import java.util.Scanner;

public class game 
{
	private player player1;
	private room currentRoom;
	
	public game(player playerIn, room starterRoom)
	{
		this.player1 = playerIn;
		this.currentRoom = starterRoom;
	}
	
	public room getCurrentRoom()
	{
		return this.currentRoom;
	}
	
	public player getPlayer()
	{
		return this.player1;
	}
	
	public void setCurrentRoom(room newRoom)
	{
		this.currentRoom = newRoom;
	}
	
	public void setPlayer(player newPlayer)
	{
		this.player1 = newPlayer;
	}
	
	public void gameStart()
	{
		System.out.println("Welcome to the Dungeon! Your adventure starts in the " + this.getCurrentRoom().getDescription() + ".");
	}
	
	public void gameRun()
	{
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		
		while (flag)
		{
			System.out.println("You are currently in the " + this.getCurrentRoom().getDescription() + ".");
			System.out.println("Where would you like to go?");
			if (this.getCurrentRoom().hasNorth())
			{
				System.out.println("North: " + this.getCurrentRoom().getNorth().getDescription());
			}
			else
			{
				System.out.println("North: None");
			}
			
			if (this.getCurrentRoom().hasEast())
			{
				System.out.println("East:  " + this.getCurrentRoom().getEast().getDescription());
			}
			else
			{
				System.out.println("East:  None");
			}
			
			if (this.getCurrentRoom().hasSouth())
			{
				System.out.println("South: " + this.getCurrentRoom().getSouth().getDescription());
			}
			else
			{
				System.out.println("South: None");
			}
			
			if (this.getCurrentRoom().hasWest())
			{
				System.out.println("West:  " + this.getCurrentRoom().getWest().getDescription());
			}
			else
			{
				System.out.println("West:  None");
			}
			
			System.out.println("Enter 'Stop' to end the game.\n");
			
			String userInput = in.nextLine();
			if (userInput.equals("North") && this.getCurrentRoom().hasNorth())
			{
				this.setCurrentRoom(this.getCurrentRoom().getNorth());
			}
			else if (userInput.equals("East") && this.getCurrentRoom().hasEast())
			{
				this.setCurrentRoom(this.getCurrentRoom().getEast());
			}
			else if (userInput.equals("South") && this.getCurrentRoom().hasSouth())
			{
				this.setCurrentRoom(this.getCurrentRoom().getSouth());
			}
			else if (userInput.equals("West") && this.getCurrentRoom().hasWest())
			{
				this.setCurrentRoom(this.getCurrentRoom().getWest());
			}
			else if (userInput.equals("Stop"))
			{
				flag = false;
				System.out.println("Thanks for playing!");
			}
			else
			{
				System.out.println("That was not a valid input\n");
			}
		}
		in.close();
	}
}
