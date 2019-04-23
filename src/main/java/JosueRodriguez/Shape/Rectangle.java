package main.java.JosueRodriguez.Shape;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public void draw() {
		System.out.println("Draw a Restangle of color " + getColor());

	}

	public double getArea() {
		return length * width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
