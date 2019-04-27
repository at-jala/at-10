package main.java.MelisaRoman.Figures;

public class Square extends GeometricFigure {

	int side;

	public Square(int side, String description, String tag) {
		super(description, tag);
		this.side = side;
	}

	public String getFigureType() {
		return "Square";
	}
	
	public double getArea() {
		return side * side;
	}

	public int getSide() {
		return side;
	}

	public void drawTxt() {
		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
