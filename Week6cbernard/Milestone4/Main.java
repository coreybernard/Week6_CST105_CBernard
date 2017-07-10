/**
 * Program: NFL Draft App Main Class
 * 
 * File: Main.java 
 * 
 * Summary: Main Class for NFL Draft Application.
 * 
 * Author: Corey Bernard
 * 
 * Date: July 1, 2017
 * 
 **/

public class Main {

	public static void main(String[] args) {
		//Call the test drivers
		playerDriver();
		
		System.out.println();
		
		managerDriver();
		
	}
	
	//test driver for Player class
	public static void playerDriver(){
		//create a player without parameters
		Player tomBrady = new OffensivePlayer();
		//Set parameters manually
		tomBrady.setHeight(76);
		tomBrady.setWeight(225);
		
		tomBrady.setBMI();
		
		//print to show the info for the players
		System.out.println(tomBrady.toString());
		System.out.println();
		
		//Create a player by accepting all of the parameters
		Player julioJones = new OffensivePlayer("Julio Jones", "Wide Receiver", "Atlanta Falcons", 75, 220, 28, 11,
				7, "Alabama");
		
		//print to show the info for the player
		System.out.println(julioJones.toString());
	}
	
	//test driver for Manager class
	public static void managerDriver(){
		//Create a player manager class instance
		Manager availablePlayers = new Manager();
		
		//print a list of available players in the manager
		System.out.println(availablePlayers.toString());
	}

}
