package main.java.LimbertVargas.Figure;

public class Rectangle extends GeometricFigure {
	int base, height;

	public Rectangle(int base, int height, String description, String tag) {
		super(height, height, description, tag);
		this.base = base;
		this.height = height;
	}

	public String getFigureType() {
		return "Rectangle";
	}

	public double getArea() {
		return base * height;
	}

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void drawTxt() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
