package main.java.AlejandroSanchez.Shapes;

public class Triangle extends Shape {

	private double width;
	
	public Triangle () {
		length = 0;
		width = 0;
	}
	
	public Triangle (double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength () {
		return length;
	}
	
	public double getWidth () {
		return width;
	}
	
	public double getArea () {
		return length*width/2;
	}
	
	public void draw () {
		System.out.println("What's up, doc! I'm a TRIANGLE");
	} 

}
