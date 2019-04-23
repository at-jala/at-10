package main.java.CristelhMiranda.figures;

import java.awt.Graphics;

public class Triangle extends Shape {

	private int[] posX;
	private int[] posY;
	private final int NUMBER_SIDES = 3; 
	
	public Triangle(int[] posX, int [] posY) {
		//formulas para obtener ancho **
		super(1);
		this.posX = posX;
		this.posY = posY;
	}

	public void draw(Graphics g) {
		g.drawPolygon(posX, posY, NUMBER_SIDES);
	}
}
