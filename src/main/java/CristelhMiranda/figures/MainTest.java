package main.java.CristelhMiranda.figures;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainTest extends JFrame {

	private JPanel contentPane;

	public MainTest() {
		this.setTitle("figures");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setBounds(200, 50, 600, 400);
	}

	public void paint(Graphics g) {
		super.paint(g);
		Square square = new Square(200);
		square.draw(g);

		Line line = new Line(50, 50, 100, 100);
		line.draw(g);		

		//Triangle
		int[] posX = {200,150,250};
		int[] posY = {200,250,250};
		Triangle triangle = new Triangle(posX, posY);
		triangle.draw(g);
	}

	public static void main(String args[]) {
		MainTest main = new MainTest();
		main.setVisible(true);
	}
}
