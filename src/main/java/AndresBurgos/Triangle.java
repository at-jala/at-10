package main.java.AndresBurgos;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shape {
	int pointAx, pointAy, pointBx, pointBy, pointCx, pointCy;
	
	public Triangle(int ax, int ay, int bx, int by, int cx, int cy  ) {
		this.pointAx = ax;
		this.pointAy = ay;
		this.pointBx = bx;
		this.pointBy = by;
		this.pointCx = cx;
		this.pointCy = cy;
	}
	
	public void draw(Graphics g) {
		g.setColor( Color.BLUE );
		//
		g.drawPolygon(new int[] {pointAx, pointBx, pointCx}, new int[] {pointAy, pointBy, pointCy}, 3);
	}
}
