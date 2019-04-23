package main.java.CristelhMiranda.figures;

public class Shape {
	protected int width;

	public Shape(int width) {
		this.width = width;
	}	

	public void draw() {
		System.out.println("No puedo dibujarme! por que no tengo una forma");
	}	
}
