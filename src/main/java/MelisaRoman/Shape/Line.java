package main.java.MelisaRoman.Shape;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape {
	
	public Line() {
		
	}

	public void paintComponent(Graphics g) {
		draw(g);
	}
	
	public void draw(Graphics g) {
		setBounds(150,200,200,200);
		g.setColor(Color.GREEN);
		g.drawLine(10,10, 100, 100);
		
	}
	
	/*
	public void draw() {
		System.out.println("I'm a line!");
	}
	*/
}
