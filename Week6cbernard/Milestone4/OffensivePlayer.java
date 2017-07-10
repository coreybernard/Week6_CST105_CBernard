/**
 * Program: NFL Draft App Offensive Player Class
 * 
 * File: OffensivePlayer.java 
 * 
 * Summary: Offensive Player Class for NFL Draft Application.
 * 
 * Author: Corey Bernard
 * 
 * Date: July 8, 2017
 * 
 **/

public class OffensivePlayer extends Player{
	private int touchdowns;
	private int yards;
	private int completions;
	private int rushes;
	private int catches;
	
	public int getTouchdowns() {
		return touchdowns;
	}
	
	public void setTouchdowns(int touchdowns) {
		this.touchdowns = touchdowns;
	}
	
	public int getYards() {
		return yards;
	}
	
	public void setYards(int yards) {
		this.yards = yards;
	}
	
	public int getCompletions() {
		return completions;
	}
	
	public void setCompletions(int completions) {
		this.completions = completions;
	}
	
	public int getRushes() {
		return rushes;
	}
	
	public void setRushes(int rushes) {
		this.rushes = rushes;
	}
	
	public int getCatches() {
		return catches;
	}
	
	public void setCatches(int catches) {
		this.catches = catches;
	}

	public OffensivePlayer() {
		super();
	}

	public OffensivePlayer(String name, String position, String team, int height, int weight, int age, int jerzeeNumber,
			int experience, String college) {
		super(name, position, team, height, weight, age, jerzeeNumber, experience, college);
	}

	@Override
	public String toString() {
		return "OffensivePlayer [toString()=" + super.toString() + "]";
	}
	
}
