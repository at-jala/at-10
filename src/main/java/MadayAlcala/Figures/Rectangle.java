package main.java.MadayAlcala.Figures;

public class Rectangle extends GeometricFigure {
	int base;
	int height;

	public Rectangle(int base, int height, String description, String tag) {
		super(description, tag);
		this.base = base;
		this.height = height;
	}
	public String getFigureType() {
		return "Rectangle";
	}
	public double area() {
		return base * height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
