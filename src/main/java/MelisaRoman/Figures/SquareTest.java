package main.java.MelisaRoman.Figures;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SquareTest {

	@Test
	public void getFigureType_SquareSide4_Square() {
		Figure square = new Square(4, "I am a Square", "S-1");
		assertEquals("Square", square.getFigureType());
	}

	@Test
	public void getArea_SquareArea4_result16() {
		Figure square = new Square(4, "I am a Square", "S-1");
		assertEquals(16, square.getArea(), 0.0);
	}

	@Test
	public void getSide_SquareBase4_result4() {
		Figure square = new Square(4, "I am a Square", "S-1");
		assertEquals(4, ((Square) square).getSide());
	}

	private PrintStream sysOut;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		sysOut = System.out;
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void revertStreams() {
		System.setOut(sysOut);
	}

	@Test
	public void drawTxt_squareSide4_correctResult() {
		String drawing = "****\r\n****\r\n****\r\n****\r\n";
		Figure square = new Square(4, "I am a Square", "S-01");
		square.drawTxt();
		assertEquals(drawing, outContent.toString());
	}

	@Test
	public void printDescription_squareSide4_correctResult() {
		String description = "Tag: S-01\r\nFigure Type: Square\r\nArea: 16.0\r\n";
		Figure square = new Square(4, "I am a Square", "S-01");
		square.printDescription();
		assertEquals(description, outContent.toString());
	}
}
