package main.java.MadayAlcala.Figures;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MainTest {
	public static void main(String args[]) {
		List <Figure> figures= new ArrayList<Figure>();
		boolean menu = false;
		do {
			System.out.print("1.- Create rectangle\r\n2.- Create square\r\n3.- Display figure\r\n0.- Exit");
			Scanner in = new Scanner(System.in);
			int option = in.nextInt();
			Figure last=null;
			switch (option) {
			case 1:
				last = new Rectangle(5, 10, "I am a Rectangle", "R-01");
				//figures.add(rectangle);
				
				break;
			case 2:
				last = new Square(5, "S-01");
				//figures.add(square);
				break;
			case 3:
				last.printDescription();
				
				break;
			default:
				break;
			}
		}while(menu);{
			
		}
	}
}
	