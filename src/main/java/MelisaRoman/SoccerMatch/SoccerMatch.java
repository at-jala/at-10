package main.java.MelisaRoman.SoccerMatch;

import java.util.List;

public class SoccerMatch {
	ISoccerTeam team1;
	ISoccerTeam team2;
	List<IReferee> referees;
	Ball ball;
	List<IFan> expectators;

	void refereesAssigment(List<IReferee> refereesList) {
		referees = refereesList;
	}

	void startTheMatch() {
		team1.playMatch();
		team2.playMatch();
		
		referees.get(0).whistle();

	}
	
}
