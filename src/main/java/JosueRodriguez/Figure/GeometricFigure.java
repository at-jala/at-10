package main.java.JosueRodriguez.Figure;

public class GeometricFigure extends Figure {
	private String description;

	GeometricFigure(String description, String tag) {
		super(tag);
		this.description = description;
	}
	public String getTag() {
		return tag;
	}
	public String getFigureType() {
		return description;
	}

	public double getArea() {
		return 0;
	}

	public void drawTxt() {

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getArea(int height, int base) {
		return height * base;
	}

	public void printDescription() {
		System.out.println("Tag: " + tag);
		System.out.println("Figure Type: " + getFigureType());
		System.out.println("Area: " + getArea());
	}

}
