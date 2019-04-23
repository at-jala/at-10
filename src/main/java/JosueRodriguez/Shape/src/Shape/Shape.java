package Shape;



public class Shape{
	private String color;
	
	public Shape() {
		this.color = "black"; 

	}

	public Shape(String color) {
		this.color = color;
	}

	public String toString() {
		return "Shape[color=" + color + "]";
	}

	public double getArea() {
		System.err.println("Cannot compute arrea because the Shape is Unknown");
		return 0;
	}

	public void draw() {
		System.out.println("Shape unknown! Cannot draw shape of color "+ getColor());
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
