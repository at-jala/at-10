package main.java.LimbertVargas.Figure;

public class Square extends GeometricFigure {

	public Square(int base, String tag) {
		super(base, base, "I am a Square", tag);
	}

	public String getFigureType() {
		return "Square";
	}
	
	public double getArea() {
		return base * base;
	}

	public void drawTxt() {
		for (int i = 0; i < base; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
