package main.java.AlejandroSanchez.Figures;

public class Rectangle extends GeometricFigure {
	private int base;
	private int height;

	public Rectangle(int base, int height, String description, String tag) {
		super(description, tag);
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

	public void drawTxt() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
