package main.java.MelisaRoman.SoccerMatch;

import java.util.List;

public class SoccerTeam implements ISoccerTeam {
	List<IPlayer> players;
	List<ITrainer> technicalTeam;
	String name;
	
	public void train() {
		System.out.println("Training hard");
	}
	
	public void playMatch() {
		System.out.println("Playing hard");
	}
	public void travel() {
		System.out.println("Traveling");
	}

	public String getName() {
		return name;
	}
	
}
