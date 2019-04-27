package main.java.MelisaRoman.Figures;

public abstract class GeometricFigure extends Figure {
	String description;

	public GeometricFigure(String description, String tag) {
		super(tag);
		this.description = description;
	}

	public abstract String getFigureType();

	public abstract double getArea();

	public abstract void drawTxt();

	public void printDescription() {
		System.out.println("Tag: " + tag);
		System.out.println("Figure Type: " + getFigureType());
		System.out.println("Area: " + getArea());
	}
}
