package main.java.MelisaRoman.Figures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {
	public static void main(String args[]) {
		boolean menu = true;
		Figure last = null;
		do {
			System.out.print("1.- Create rectangle\r\n2.- Create square\r\n3.- Display figure\r\n0.- Exit\n");
			Scanner inputScan = new Scanner(System.in);
			int option = inputScan.nextInt();
			switch (option) {
			case 1:
				System.out.print("Enter base: ");
				int baseRectangle = inputScan.nextInt();
				System.out.print("Enter height: ");
				int heightRectangle = inputScan.nextInt();
				last = new Rectangle(baseRectangle, heightRectangle, "I am a Rectangle", "R-01");
				break;
			case 2:
				System.out.print("Enter side: ");
				int sideSquare = inputScan.nextInt();
				last = new Square(sideSquare, "I am a Square", "S-01");
				break;
			case 3:
				last.printDescription();
				last.drawTxt();
				break;
			case 0:
				menu = false;
				System.out.println("Bye!!!");
				break;
			default:
				break;
			}
		} while (menu);
	}
}
