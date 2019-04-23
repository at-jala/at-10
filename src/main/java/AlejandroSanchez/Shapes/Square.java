package main.java.AlejandroSanchez.Shapes;

public class Square extends Shape {

	private double width;
	
	public Square () {
		length = 0;
		width = 0;
	}
	
	public Square (double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getWidth () {
		return width;
	}
	
	public double getArea () {
		return length*width;
	}
	
	public void draw () {
		System.out.println("What's up, doc! I'm a SQUARE");
	} 

}
