package main.java.MadayAlcala.Figures;

public class Square extends GeometricFigure {
	int base;

	public Square(int base) {
		super("Square", "S-01", "I'm a Square");
		this.base = base;
	}

	public int getBase() {
		return base;
	}

	public double getArea() {
		return base * base;
	}

	public void drawTxt() {
		for (int i = 0; i < base; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}