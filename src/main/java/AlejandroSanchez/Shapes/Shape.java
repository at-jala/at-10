package main.java.AlejandroSanchez.Shapes;

public class Shape {

	protected double length;
	
	public Shape () {
		length = 0.0;
	}
	
	public Shape (double length) {
		this.length = length;
	}
	
	public double getLength () {
		return length;
	}
	
	public void draw () {
		System.out.println("What's up, doc! I'm a SHAPE");
	}

}
