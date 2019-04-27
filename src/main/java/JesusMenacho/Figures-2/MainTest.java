import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {
	public static void main(String args[]) {
		Figure createSquare = new Square(0, "", "");
		Figure createRectangle = new Rectangle(0, 0, "", "");
		boolean menu = true;
		do {
			System.out.print("\n*************************************\n*             MAIN MENU             *\n*************************************\n	1.- Create rectangle\n	2.- Create square\n	3.- Display figure\n	0.- Exit\n Press any key to continuous:");
			Scanner in = new Scanner(System.in);
			int option = in.nextInt();

			switch (option) {
			case 1:
				System.out.print("Enter base: ");
				int baseRectangle = in.nextInt();
				System.out.print("Enter height: ");
				int heightRectangle = in.nextInt();
				createRectangle = new Rectangle(baseRectangle, heightRectangle, "I am a Rectangle :)", "R-01");
				System.out.print("\033[H\033[2J");
				System.out.flush();
				break;
			case 2:
				System.out.print("Enter side: ");
				int sideSquare = in.nextInt();
				createSquare = new Square(sideSquare, "It is a rectangle", "R-02");
				System.out.print("\033[H\033[2J");
				System.out.flush();
				break;
			case 3:
				createRectangle.printDescription();
				createRectangle.drawTxt();
				System.out.println("------------------------------------");
				createSquare.printDescription();
				createSquare.drawTxt();
				System.out.print("Press key Enter to continous:");
				Scanner waitForKeypress = new Scanner(System.in);
				waitForKeypress.nextLine();
				
				break;
			case 0:
				menu = false;
				System.out.println("that is all goodBye!!!");
				break;
			default:
				System.out.println("You type the incorrect number");
				break;
			}
		} while (menu);
		{

		}
	}
}
