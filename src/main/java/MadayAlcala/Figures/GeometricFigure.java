package main.java.MadayAlcala.Figures;

public abstract class GeometricFigure extends Figure {
	final String figureType;
	final String tag;
	final String description;

	GeometricFigure(String figureType, String tag, String description) {
		super();
		this.figureType = figureType;
		this.tag = tag;
		this.description = description;
	}

	public abstract int getBase();

	public abstract void drawTxt();

	public String getTag() {
		return tag;
	}

	public final String getFigureType() {
		return figureType;
	}

	public final String getDescription() {
		return description;
	}

	public double getArea() {
		return 0;
	}

	public final void printDescription() {
		System.out.println("Tag: " + getTag());
		System.out.println("Figure Type: " + getFigureType());
		System.out.println("Area: " + getArea());
	}

}