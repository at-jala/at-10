package main.java.AlejandroSanchez.Shapes;

public class Line extends Shape {

	public Line () {
		length = 0;
	}
	
	public Line (double length) {
		this.length = length;
	}
	
	public void draw () {
		System.out.println("What's up, doc! I'm a LINE");
	} 

}
