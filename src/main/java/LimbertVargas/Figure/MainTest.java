package main.java.LimbertVargas.Figure;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class MainTest {
	private static Scanner in;

	public static void main(String args[]) {
		boolean menu = true;
		Figure last = null;
		do {
			System.out.println("************");
			System.out.println("FIGURES MENU");
			System.out.println("************");
			System.out.print("1.- Create rectangle\r\n2.- Create square\r\n3.- Display figure\r\n0.- Exit\n");
			System.out.print("Select option: ");
			in = new Scanner(System.in);
			int option = in.nextInt();

			switch (option) {
			case 1:
				System.out.print("Enter base: ");
				int baseRectangle = in.nextInt();
				System.out.print("Enter height: ");
				int heightRectangle = in.nextInt();
				last = new Rectangle(baseRectangle, heightRectangle, "I am a Rectangle", "R-01");
				break;
			case 2:
				System.out.print("Enter side: ");
				int sideSquare = in.nextInt();
				last = new Square(sideSquare, "S-01");
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
		{

		}
	}
}
