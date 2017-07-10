/**
 * Program: NFL Draft App Defensive Player Class
 * 
 * File: DefensivePlayer.java 
 * 
 * Summary: Defensive Player Class for NFL Draft Application.
 * 
 * Author: Corey Bernard
 * 
 * Date: July 8, 2017
 * 
 **/

public class DefensivePlayer extends Player{
	private int tackles;
	private int sacks;
	private int interceptions;
	
	public int getTackles() {
		return tackles;
	}
	
	public void setTackles(int tackles) {
		this.tackles = tackles;
	}
	
	public int getSacks() {
		return sacks;
	}
	
	public void setSacks(int sacks) {
		this.sacks = sacks;
	}
	
	public int getInterceptions() {
		return interceptions;
	}
	
	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}

	public DefensivePlayer() {
		super();
	}

	public DefensivePlayer(String name, String position, String team, int height, int weight, int age, int jerzeeNumber,
			int experience, String college) {
		super(name, position, team, height, weight, age, jerzeeNumber, experience, college);
	}
	
	@Override
	public String toString() {
		return "DefensivePlayer [toString()=" + super.toString() + "]";
	}
	
}
