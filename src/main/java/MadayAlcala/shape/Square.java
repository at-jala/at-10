package main.java.MadayAlcala.shape;



import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape{
	int side;
	
	public Square(int side){
		this.side = side;
		setBackground(Color.black);		
		setBounds(20, 20, 100, 100);
		
	}
	public void paintComponent(Graphics g) {
		System.out.println("Drawing a square");
		draw(g);	
	}
	
	public void draw(Graphics g) {
		g.setColor(colorShape);
		g.drawRect(10, 10, side, side);		
	}

	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	

}
