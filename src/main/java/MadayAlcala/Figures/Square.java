package main.java.MadayAlcala.Figures;

public class Square extends Rectangle {

	public Square(int base,String tag) {
		super(base, base, "I am a Square",tag);
	}
	public String getFigureType() {
		return "Square";
	}
}
