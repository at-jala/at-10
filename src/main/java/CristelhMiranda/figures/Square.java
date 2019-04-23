package main.java.CristelhMiranda.figures;

import java.awt.Graphics;

public class Square extends Shape{
	//private int height;
	
	public Square(int width) {
		super(width);
	}

	public void draw(Graphics g) {
		g.drawRect(300, 50, width, width);
	}
}
