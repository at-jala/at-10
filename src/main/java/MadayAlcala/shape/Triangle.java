package shape;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shape{
	int side1;
	int side2;
	int side3;
	
	public Triangle(int side1, int side2, int side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setBackground(Color.black);		
		setBounds(200, 30, 200, 200);
		
	}
	public void paintComponent(Graphics g) {
		System.out.println("Drawing a Triangle");
		draw(g);
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawLine(50, 50, side1, 50);
		g.drawLine(side1, 50, 50 +side1, side2);
		g.drawLine(side3+50, side2, side3+50, 50);
	}
	
	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	public int getSide3() {
		return side3;
	}
	public void setSide3(int side3) {
		this.side3 = side3;
	}
	
	



}



