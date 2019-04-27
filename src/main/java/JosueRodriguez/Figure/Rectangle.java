package main.java.JosueRodriguez.Figure;

public class Rectangle extends GeometricFigure {
	int base;
	int height;

	public Rectangle(String description,String tag,int base, int height) {
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
	public void drawTxt() {
		for (int i = 0; i<height;i++) {
			for (int j = 0; j<base;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}
}
