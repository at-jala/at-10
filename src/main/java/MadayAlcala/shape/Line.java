package main.java.MadayAlcala.shape;


import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape{
	int coordX;
	int coordY;
	
	public Line(int coordX, int coordY){
		this.coordX = coordX;
		this.coordY = coordY;
		setBackground(Color.black);		
		setBounds(80, 80, 50, 50);
		
	}
	public void paintComponent(Graphics g) {
		System.out.println("Drawing a line");
		draw(g);
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawLine(100, 100, coordX, coordY);
	}
	
	public int getCoordX() {
		return coordX;
	}
	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}
	public int getCoordY() {
		return coordY;
	}
	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}
	



}
