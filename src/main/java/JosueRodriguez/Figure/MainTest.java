package main.java.JosueRodriguez.Figure;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MainTest {
	public static void main(String args[]) {
		List <Figure> figures= new ArrayList<Figure>();
		boolean menu = true;
		Figure last=null;
		do {
			System.out.print("1.- Create rectangle\r\n2.- Create square\r\n3.- Display figure\r\n0.- Exit\n");
			Scanner in = new Scanner(System.in);
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
				last = new Square(sideSquare, "R-01");
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
		}while(menu);{
			
		}
	}
}
	