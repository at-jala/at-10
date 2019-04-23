package main.java.AndresBurgos;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {

	int base, height;

	public Square(int height, int base) {
		this.height = height;
		this.base = base;
	}
	
	public void draw(Graphics g) {
		g.setColor( Color.RED );
		g.drawRect(50, 100, base, height);		
	}
	
	
}
