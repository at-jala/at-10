package main.java.JosueRodriguez.Figure;

public class Square extends Rectangle {

	public Square(int base,String tag) {
		super(base, base, "I am a Square",tag);
	}
	public String getFigureType() {
		return "Square";
	}
}
