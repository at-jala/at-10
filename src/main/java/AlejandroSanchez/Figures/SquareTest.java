package main.java.AlejandroSanchez.Figures;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class SquareTest {
	@Test
	public void getFigureType_squareSide4_Square() {
		Figure square = new Square(4, "I'm a Square", "S-1");
		assertEquals("Square", square.getFigureType());
	}

	@Test
	public void getArea_squareArea4_result16() {
		Figure square = new Square(4, "I'm a Square", "S-1");
		assertEquals(16, square.getArea(),0.0);
	}

	@Test
	public void getSide_SquareSide4_result4() {
		Figure square = new Square(4, "I'm a Square", "S-1");
		assertEquals(4, ((Square)square).getSide());
	}

	/*
	 * Web Resource:
	 * JUnit test for System.out.println()
	 * https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
	 */
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}
	@Test
	public void drawTxt_squareSide4_resultPrintDots4x4() {
		Figure square=new Square(4, "I'm a Square", "S-1");
		String expected = "* * * * \r\n* * * * \r\n* * * * \r\n* * * * \r\n";
		square.drawTxt();
		assertEquals(expected, outContent.toString());
	}
	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	}

	@Before
	public void setUpStreamsPrintDescription() {
	    System.setOut(new PrintStream(outContent));
	}
	@Test
	public void printDescription_rectangleSide5_tagAndFigureTypeAnd25() {
		Figure square = new Square(5, "I'm a Square", "S-1");
		String expected = "Tag: S-1\r\nFigure Type: Square\r\nArea: 25.0\r\n";
		square.printDescription();
		assertEquals(expected, outContent.toString());
	}
	@After
	public void restoreStreamsPrintDescription() {
	    System.setOut(originalOut);
	}
}
