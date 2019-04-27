package main.java.AlejandroSanchez.Figures;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class RectangleTest {

	@Test
	public void getFigureType_rectangleBase4Heigth3_result12() {
		Figure rectangle = new Rectangle(4, 3, "I'm a Rectangle", "R-1");
		assertEquals("Rectangle", rectangle.getFigureType());
	}

	@Test
	public void getArea_rectangleAreaBase5Heigth7_result35() {
		Figure rectangle = new Rectangle(5, 7, "I'm a Rectangle", "R-1");
		assertEquals(35, rectangle.getArea(), 0.0);
	}

	@Test
	public void getBase_rectangleBase7_result7() {
		Rectangle rectangle = new Rectangle(7, 3, "I'm a Rectangle","R-1");
		assertEquals(7, rectangle.getBase());
	}
	
	@Test
	public void getHeight_rectangleHeight7_result7() {
		Figure rectangle = new Rectangle(7, 7, "I'm a Rectangle","R-1");
		assertEquals(7, ((Rectangle)rectangle).getHeight());
	}

	/*
	 * Web Resource:
	 * JUnit test for System.out.println()
	 * https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
	 */
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	@Before
	public void setUpStreamsDrawTxt() {
	    System.setOut(new PrintStream(outContent));
	}
	@Test
	public void drawTxt_rectangleBase7Height5_resultPrintDots7x5() {
		Figure rectangle = new Rectangle(7, 5, "I'm a Rectangle", "R-1");
		String expected = "* * * * * * * \r\n* * * * * * * \r\n* * * * * * * \r\n* * * * * * * \r\n* * * * * * * \r\n";
		rectangle.drawTxt();
		assertEquals(expected, outContent.toString());
	}
	@After
	public void restoreStreamsDrawTxt() {
	    System.setOut(originalOut);
	}
	
	@Before
	public void setUpStreamsPrintDescription() {
	    System.setOut(new PrintStream(outContent));
	}
	@Test
	public void printDescription_rectangleBase7Height5_tagAndFigureTypeAnd35() {
		Figure rectangle = new Rectangle(7, 5, "I'm a Rectangle", "R-1");
		String expected = "Tag: R-1\r\nFigure Type: Rectangle\r\nArea: 35.0\r\n";
		rectangle.printDescription();
		assertEquals(expected, outContent.toString());
	}
	@After
	public void restoreStreamsPrintDescription() {
	    System.setOut(originalOut);
	}
}
