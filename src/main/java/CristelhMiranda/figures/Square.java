package main.java.CristelhMiranda.figures;

import java.awt.Graphics;

public class Square extends Shape{
	
	private int posX;
	private int posY;
	
	public Square(int width) {
		super(width);
		posX = 300;
		posY = 50;
	}
	
	public Square(int posX, int posY, int width) {
		super(width);
		this.posX = posX;
		this.posY = posY;
	}

	public void draw(Graphics g) {
		g.drawRect(posX, posY, width, width);
	}
}
