package main.java.AndresBurgos;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainClass extends JFrame {

	private JPanel contentPane;

	public MainClass() {
		setTitle("Figures");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		// contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setBounds(200, 50, 600, 400);
	}

	public void paint(Graphics g) {
		super.paint(g);
		Square square = new Square(150,50);
		square.draw(g);
		
		Line line= new Line(300, 200, 450, 100);
		line.draw(g);
		
		
		
		Triangle triangle = new Triangle(200, 150, 150, 200, 250, 200);
		triangle.draw(g);
		
	}

	public static void main(String[] args) {
		MainClass main = new MainClass();
		main.setVisible(true);
		

	}

}
