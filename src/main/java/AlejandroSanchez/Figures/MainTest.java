package main.java.AlejandroSanchez.Figures;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class MainTest {
	public static void main(String args[]) {
		//List <Figure> figures= new ArrayList<Figure>();
		boolean menu = true;
		Figure last=null;
		Scanner in = new Scanner(System.in);
		do {
			System.out.print( "======================\n" 
							+ " [1] Create rectangle\n"
							+ " [2] Create square\n"
							+ " [3] Display figure\n"
							+ " [0] Exit\n"
							+ "======================\n"
							+ "Type an option and press ENTER: ");
			int option = in.nextInt();

			switch (option) {
			case 1:
				System.out.print("Enter base: ");
				int baseRectangle = in.nextInt();
				System.out.print("Enter height: ");
				int heightRectangle = in.nextInt();
				last = new Rectangle(baseRectangle, heightRectangle, "I am a Rectangle", "R-01");
				System.out.println("Rectangle created successfully! Now you may want to display it");
				break;

			case 2:
				System.out.print("Enter side: ");
				int sideSquare = in.nextInt();
				last = new Square(sideSquare, "I'm a Square", "R-01");
				System.out.println("Square created successfully! Now you may want to display it");
				break;
			
			case 3:
				System.out.println( "======================" ); 
				last.printDescription();
				System.out.println();
				last.drawTxt();
				System.out.println();
				break;
			
			case 0:
				menu = false;
				System.out.println(" Bye!!!");
				break;
			
			default:
				System.out.println("Invalid option!");
				break;
			}
		} while(menu); 
		in.close();
	}
}
