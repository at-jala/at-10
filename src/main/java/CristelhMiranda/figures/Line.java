package main.java.CristelhMiranda.figures;

import java.awt.Graphics;

public class Line extends Shape{
private int xInit;
private int yInit;
private int xEnd;
private int yEnd;
	
	public Line (int xInit, int yInit,int xEnd, int yEnd) {
		//super(xInit, yInit, xEnd, yEnd);
		//super(10);
		this.xInit = xInit;
		this.yInit = yInit;
		this.xEnd = xEnd;
		this.yEnd = yEnd;
	}

	
	public double getxInit() {
		return xInit;
	}


	public void setxInit(int xInit) {
		this.xInit = xInit;
	}


	public double getyInit() {
		return yInit;
	}


	public void setyInit(int yInit) {
		this.yInit = yInit;
	}


	public double getxEnd() {
		return xEnd;
	}


	public void setxEnd(int xEnd) {
		this.xEnd = xEnd;
	}


	public double getyEnd() {
		return yEnd;
	}


	public void setyEnd(int yEnd) {
		this.yEnd = yEnd;
	}


	public void draw(Graphics g) {
		g.drawLine(xInit, yInit, xEnd, yEnd);
	}
}
