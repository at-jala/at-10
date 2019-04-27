package main.java.MadayAlcala.Figures;

public class Rectangle extends GeometricFigure {
	int base;
	int height;

	public Rectangle(int base, int height) {
		super("Rectangle", "R-01", "I'm a Rectangle");
		this.base = base;
		this.height = height;
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

	public void drawTxt() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
