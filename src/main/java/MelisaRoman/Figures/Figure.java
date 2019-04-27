package main.java.MelisaRoman.Figures;

public abstract class Figure {
	String tag;

	public Figure(String tag) {
		this.tag = tag;
	}

	public String getTag() {
		return tag;
	}

	public abstract String getFigureType();

	public abstract double getArea();

	public abstract void drawTxt();

	public abstract void printDescription();
}
