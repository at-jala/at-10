package main.java.LimbertVargas.Figure;

public class GeometricFigure extends Figure {
	String description;
	protected int base;

	GeometricFigure(int base, int base2, String description, String tag) {
		super(tag);
		this.description = description;
		this.base = base;
	}

	public String getFigureType() {
		return description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getBase() {
		return base;
	}

	public double getArea() {
		return 0;
	}

	public void drawTxt() {

	}

	public void printDescription() {
		System.out.println("Tag: " + tag);
		System.out.println("Figure Type: " + getFigureType());
		System.out.println("Area: " + getArea());
		System.out.println();
	}

	/*
	 * Tag: C-5 Figure Type: Square Area: 25
	 * 
	 */

}
