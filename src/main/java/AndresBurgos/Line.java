package main.java.AndresBurgos;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape {

	int pointAx, pointAy, pointBx, pointBy;

	public Line(int ax, int ay, int bx, int by) {
		this.pointAx = ax;
		this.pointAy = ay;
		this.pointBx = bx;
		this.pointBy = by;
	}
	
	public void draw(Graphics g) {
		g.setColor( Color.GREEN );
		g.drawLine(pointAx, pointAy, pointBx, pointBy);	
	}
}
