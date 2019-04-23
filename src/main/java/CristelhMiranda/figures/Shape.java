package main.java.CristelhMiranda.figures;

public class Shape {
	protected int width;

	public Shape(int width) {
		this.width = width;
	}
	// public Shape(double xInit, double yInit,double xEnd, double yEnd) {
	// this.ancho = ancho;
	// }

	public Shape() {

	}

	public void draw() {
		System.out.println("No puedo dibujarme! por que no tengo una forma");
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
