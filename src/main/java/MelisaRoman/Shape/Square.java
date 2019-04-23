package main.java.MelisaRoman.Shape;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {

	public Square() {
		
	}
	
	public void paintComponent(Graphics g) {
		draw(g);
	}
	
	public void draw(Graphics graph) {
		setBounds(500,200,150,150);
		graph.setColor(Color.BLUE);
		graph.drawRect(10,10,100,100);
	
	}
	/*
	public void draw() {
		System.out.println("I'm a square!");
	}
	*/
}
