package main.java.MelisaRoman.Shape;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shape{
	
	
	public Triangle() {
		
	}
	
	public void paintComponent(Graphics g) {
		draw(g);
	}
	
	public void draw(Graphics graph) {
		setBounds(800,200,600,400);
		graph.setColor(Color.RED);
		graph.drawLine(10,10,100,10);
		graph.drawLine(100,10, 100, 100);
		graph.drawLine(10, 10, 100, 100);
	}
	
	/*
	public void draw() {
		System.out.println("I'm a triangle!");
	}
	*/
}
