package main.java.CristelhMiranda.figures;

import java.awt.Graphics;

public class Triangle extends Shape {

	private int pointAx;
	private int pointBx;
	private int pointCx;
	private int pointAy;
	private int pointBy;
	private int pointCy;

	public Triangle(int pAx, int pBx, int pCx, int pAy, int pBy, int pCy) {
		pointAx = pAx;
		pointBx = pBx;
		pointCx = pCx;
		pointAy = pAy;
		pointBy = pBy;
		pointCy = pCy;
	}

	public void draw(Graphics g) {
		g.drawPolygon(new int[] { pointAx, pointBx, pointCx }, new int[] { pointAy, pointBy, pointCy }, 3);
	}
}
