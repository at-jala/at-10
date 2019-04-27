package main.java.JosueRodriguez.Figure;

public class Square extends GeometricFigure {
	int sideSquare;

	public Square(String description, String tag, int sideSquare) {
		super(description, tag);
		this.sideSquare = sideSquare;
	}

	public String getFigureType() {
		return "Square";
	}
	public double getArea() {
		return sideSquare*sideSquare;
	}
	public void drawTxt() {
		for (int i = 0; i<sideSquare;i++) {
			for (int j = 0; j<sideSquare;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public int getSideSquare() {
		return sideSquare;
	}
	
}
