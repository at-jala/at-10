package main.java.MadayAlcala.shape;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class MainTest extends JFrame{
	
	List<Shape> shapes; 
	
	public MainTest() {
		super("Shape");
		setLayout(null);
		setBounds(300, 250, 300, 300);
		
		shapes = new ArrayList<Shape>(); 
		
		Shape s = new Square(20);
		Shape l = new Line(10, 10);
		Shape t = new Triangle(4, 5,4);
		
		shapes.add(s);
		shapes.add(l);
		shapes.add(t);
		
		//Drawing shapes one by one
		/*s.draw();
		l.draw();
		t.draw();*/
		
		//Drawing all shapes
		for(Shape shape: shapes) {
			shape.draw();
		}
		
		
		add(s);
		add(l);
		add(t);
		
		setVisible(true);
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainTest ventana = new MainTest();
	}

}
