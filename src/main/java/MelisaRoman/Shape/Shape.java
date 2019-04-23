package main.java.MelisaRoman.Shape;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class Shape extends JPanel{
	Color colorShape;
	public Shape() {
		setBackground(Color.black);		
		setBounds(20, 20, 100, 100);
		colorShape = Color.blue; 
	}
	
	//overridden paintComponent method is required
	public void paintComponent(Graphics g) {
		System.out.println(" ");
	}
	
	public void draw() {
		repaint();
	}
}
