package main.java.LimbertVargas.shape;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Shape extends JFrame {
	private JPanel contentPane;

	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shape frame = new Shape();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Shape() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setBounds(0, 0, 800, 600);
	}

	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(Color.red);
		g.drawLine(10, 70, 100, 70);
		g.drawRect(150, 70, 50, 70);
		int[] xTriangle = { 300, 350, 250 };
		int[] yTriangle = { 70, 120, 120 };
		g.drawPolygon(xTriangle, yTriangle, 3);
	}
}
