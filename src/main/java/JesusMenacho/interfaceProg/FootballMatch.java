package interfaceProg;

import java.util.ArrayList;

public class FootballMatch {
    Clock TIME = new Clock("90");
    Clock addTime = new Clock("");
    java.util.List<Team> team = new ArrayList<>();
    FieldAssistant fieldAssistant = null;
    PassBall passBal = null;
    Referee referee = null;
    int scoreHost=0;
    int socreVisitor=0;
    String place=null;
    String city=null;
    Ball ball=null;

    public void beginMatch() {

    }

    public void endMatch() {

    }
}
