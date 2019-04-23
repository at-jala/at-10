package main.java.CristelhMiranda.figures;

import java.awt.Graphics;

public class Line extends Shape {
	private int xInit;
	private int yInit;
	private int xEnd;
	private int yEnd;

	public Line(int xInit, int yInit, int xEnd, int yEnd) {		
		super(1);
		this.xInit = xInit;
		this.yInit = yInit;
		this.xEnd = xEnd;
		this.yEnd = yEnd;
	}

	public void draw(Graphics g) {
		g.drawLine(xInit, yInit, xEnd, yEnd);
	}
}
