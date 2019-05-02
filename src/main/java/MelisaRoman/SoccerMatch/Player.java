package main.java.MelisaRoman.SoccerMatch;

public abstract class Player extends Person implements IPlayer{
	protected int number;
	
	void showPlayerData() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("ID: "+ID);
		System.out.println("Number: "+number);
	}
	
}
