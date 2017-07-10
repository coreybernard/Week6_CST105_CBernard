import java.util.ArrayList;

/**
 * Program: NFL Draft App Manager Class
 * 
 * File: Manager.java 
 * 
 * Summary: Manager Class for NFL Draft Application.
 * 
 * Author: Corey Bernard
 * 
 * Date: July 1, 2017
 * 
 **/

public class Manager {
	//The list of available players that may be drafted
	private ArrayList<Player> availablePlayers = new ArrayList<Player>();
	
	//Constructor which calls creatPlayers every time an instance of manager is created
	public Manager() {
		createPlayers();
	}
	
	//Generates players and adds them to our list above
	public void createPlayers(){
		Player player1 = new OffensivePlayer("Julio Jones", "Wide Receiver", "Atlanta Falcons", 75, 220, 28, 11,
				7, "Alabama");
		Player player2 = new OffensivePlayer("Tom Brady", "Quarterback", "New England Patriots", 76, 225, 39, 12,
				18, "Michigan");
		Player player3 = new OffensivePlayer("Ezekial Elliot", "Running Back", "Dallas Cowboys", 72, 225, 21, 21,
				2, "Ohio State");
		Player player4 = new OffensivePlayer("Antonio Brown", "Wide Receiver", "Pittsburg Steelers", 70, 181, 28, 84,
				8, "Central Michigan");
		Player player5 = new OffensivePlayer("Antonio Gates", "Tight End", "Los Angeles Chargers", 76, 255, 37, 85,
				15, "Kent State");
		Player player6 = new DefensivePlayer("Eric Berry", "Safety", "Kansas City Cheifs", 72, 212, 28, 29,
				8, "Tennessee");
		
		availablePlayers.add(player1);
		availablePlayers.add(player2);
		availablePlayers.add(player3);
		availablePlayers.add(player4);
		availablePlayers.add(player5);
		availablePlayers.add(player6);
	}
	
	//String which shows the names of all the available players
	public String toString(){
		String players = "";
		
		for (Player x : availablePlayers){
			players += x.getName() + "\n";
		}
		return players;
	}
	
	//Method to add a player to the availablePlayer list when the player is cut from the team
	public void addPlayer(Player player){
		availablePlayers.remove(player);
	}
	
	//Method to remove player from availablePlayer list when player is drafted
	public void removePlayer(Player player){
		availablePlayers.add(player);
	}
	
}




