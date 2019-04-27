package main.java.MelisaRoman.Figures;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

	@Test
	public void getFigureType_rectangle_resultRectangle() {
		Figure rectangle = new Rectangle(4, 3, "I'm Rectangle", "R-01");
		assertEquals("Rectangle", rectangle.getFigureType());
	}

	@Test
	public void getArea_rectangleBase5Heigth7_result35() {
		Figure rectangle = new Rectangle(5, 7, "I'm Rectangle", "R-01");
		assertEquals(35, rectangle.getArea(), 0.0);
	}

	@Test
	public void getBase_rectangleBase7_result7() {
		Figure rectangle = new Rectangle(7, 3,"I'm Rectangle","R-01");
		assertEquals(7, ((Rectangle)rectangle).getBase());
	}
	
	@Test
	public void getHeight_rectangleHeight7_result7() {
		Figure rectangle = new Rectangle(7, 7,"I'm Rectangle","R-01");
		assertEquals(7, ((Rectangle)rectangle).getHeight());
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
	public void drawTxt_rectangleBase4Height3_correctResult() {
	   	String drawing = "****\r\n****\r\n****\r\n";
		Figure rectangle = new Rectangle(4, 3,"I'm Rectangle","R-01");
		rectangle.drawTxt();
		assertEquals(drawing, outContent.toString());
	}
	
	@Test
	public void printDescription_rectangleBase4Height3_correctResult() {
	   	String description = "Tag: R-01\r\nFigure Type: Rectangle\r\nArea: 12.0\r\n";
	   	Figure rectangle = new Rectangle(4, 3,"I'm Rectangle","R-01");
		rectangle.printDescription();
		assertEquals(description, outContent.toString());
	}
}
