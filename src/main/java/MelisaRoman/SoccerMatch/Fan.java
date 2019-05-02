package main.java.MelisaRoman.SoccerMatch;

public class Fan extends Person implements IFan{

	SoccerTeam soccerTeam;
	
	public void cheer() {
		System.out.println("GO GO GO "+ soccerTeam.getName() );
	}

	public void scream() {
		System.out.println("GOOOOOOL!");
	}

	public void wave() {
		System.out.println("Waving");
	}

}
