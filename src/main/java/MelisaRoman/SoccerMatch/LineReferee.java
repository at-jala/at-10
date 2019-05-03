package main.java.MelisaRoman.SoccerMatch;

public class LineReferee extends Referee implements IReferee{
	public void admonish() {
		System.out.println("Raise flag");
	}
	
	public void whistle() {
		System.out.println("Whistling...");
	}
}
