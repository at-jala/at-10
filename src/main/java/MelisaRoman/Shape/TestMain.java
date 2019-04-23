package main.java.MelisaRoman.Shape;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestMain extends JFrame {

	/*
	 * public static void main(String[] args) {
	 * 
	 * Shape square1= new Square(); Shape line1= new Line(); Shape triangle1= new
	 * Triangle();
	 * 
	 * Shape[] shapes=new Shape[3]; shapes[0]= square1; shapes[1]= line1; shapes[2]=
	 * triangle1;
	 * 
	 * for(int i=0;i<3;i++) { shapes[i].draw(); } }
	 */

	public TestMain() {
		
		Shape line1 = new Line();
		Shape square1 = new Square();
		Shape triangle1 = new Triangle();
		
		Shape[] shapes=new Shape[3];
		shapes[0]= line1;
		shapes[1]= square1;
		shapes[2]= triangle1;

		setSize(new Dimension(1200, 600));

		//add(line1);
		
		// add(square1);
		
		//add(triangle1);

		for (int i = 0; i < 3; i++) {
			add(shapes[i]);
		}
	}


	public static void main(String[] args) {

		TestMain frame = new TestMain();
		frame.setVisible(true);

	}

}
