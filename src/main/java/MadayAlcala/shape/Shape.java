package main.java.MadayAlcala.shape;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.color.ColorSpace;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Shape extends JPanel{
	Color colorShape;
	public Shape(){
		setBackground(Color.black);		
		setBounds(20, 20, 100, 100);
		colorShape = Color.blue; 
		
	}
	public void paintComponent(Graphics g) {
		System.out.println("Drawing a shape");
	}
	public void draw() {
		repaint();//Llama automaticamente al paintComponent
	}

}
