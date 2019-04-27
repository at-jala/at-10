public class Square extends GeometricFigure {
	int base;

	public Square(int base, String description, String tag) {
		super(description, tag);
		this.base = base;
	}

	public String getFigureType() {
		return "Square";
	}

	public double getArea() {
		return base * base;
	}

	public int getBase() {
		return base;
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