package main.java.JosueRodriguez.Figure;
import java.util.Scanner;
public class MainTest {
	public static void main(String args[]) {
		boolean menu = true;
		Scanner input = new Scanner(System.in);
		Figure last=null;
		do {
			System.out.print(""
					+ "1.- Create rectangle\n"
					+ "2.- Create square\n"
					+ "3.- Display figure\n"
					+ "0.- Exit\n");
			int option = input.nextInt();
			switch (option) {
			case 1:
				System.out.print("Enter base: ");
				int baseRectangle = input.nextInt();
				System.out.print("Enter height: ");
				int heightRectangle = input.nextInt();
				last = new Rectangle("I am a Rectangle", "R-01",baseRectangle, heightRectangle);
				break;
			case 2:
				System.out.print("Enter side: ");
				int sideSquare = input.nextInt();
				last = new Square("I am a Square", "R-01", sideSquare);
				//figures.add(square);
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
		}while(menu);
	}
}
	