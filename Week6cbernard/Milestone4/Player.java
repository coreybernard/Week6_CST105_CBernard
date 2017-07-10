/**
 * Program: NFL Draft App Player Class
 * 
 * File: Player.java 
 * 
 * Summary: Player Class for NFL Draft Application.
 * 
 * Author: Corey Bernard
 * 
 * Date: July 1, 2017
 * 
 **/

public abstract class Player {
	//Declare instance variables
	private String name;
	private String position;
	private String team;
	private int height;
	private int weight;
	private int age;
	private int jerzeeNumber;
	private int experience;
	private String college;
	private double BMI;
	private int rookieAge;
	
	//Constructor without parameters
	public Player() {
		super();
	}
	
	//Constructor that accepts all of the variables as parameters except BMI and rookieAge
	public Player(String name, String position, String team, int height, int weight, int age, int jerzeeNumber,
			int experience, String college) {
		super();
		this.name = name;
		this.position = position;
		this.team = team;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.jerzeeNumber = jerzeeNumber;
		this.experience = experience;
		this.college = college;
		//BMI and Rookie Age are then called since they take other variables that must be set first in order to calculate
		this.setBMI();
		this.setRookieAge();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getJerzeeNumber() {
		return jerzeeNumber;
	}
	
	public void setJerzeeNumber(int jerzeeNumber) {
		this.jerzeeNumber = jerzeeNumber;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public double getBMI() {
		return BMI;
	}

	public void setBMI() {
		BMI = (this.weight * .45) / ((this.height * .025) * 2);
	}

	public int getRookieAge() {
		return rookieAge;
	}

	public void setRookieAge() {
		rookieAge = this.age - this.experience;
	}
	
	//String representation of a player's info
	public String toString(){
		return "Name: " + this.name
				+ "\nPosition: " + this.position
				+ "\nTeam: " + this.team
				+ "\nHeight: " + this.height / 12 + "'" + this.height % 12 + "\""
				+ "\nWeight: " + this .weight
				+ "\nBMI: " + this.BMI
				+ "\nAge: " + this.age
				+ "\nRookie Age: " + this.rookieAge
				+ "\nNumber: " + this.jerzeeNumber
				+ "\nExperience: " + this.experience + " years"
				+ "\nCollege: " + this.college;
	}
	

}
