package main.java.LimbertVargas.Figure;
import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void getFigureType_rectangleBase4Heigth3_result12() {
		Figure rectangle = new Rectangle(4, 3, "I'm Rectangle", "R-1");
		assertEquals("Rectangle", rectangle.getFigureType());
	}

	@Test
	public void area_rectangleAreaBase5Heigth7_result35() {
		Figure rectangle = new Rectangle(5, 7, "I'm Rectangle", "R-1");
		assertEquals(35, rectangle.getArea(), 0.0);
	}

	@Test
	public void getBase_rectangleBase7_result7() {
		Rectangle rectangle = new Rectangle(7, 3,"I'm Rectangle","R-1");
		assertEquals(7, rectangle.getBase());
	}
	
	@Test
	public void getHeight_rectangleHeight7_result7() {
		Figure rectangle = new Rectangle(7, 7,"I'm Rectangle","R-1");
		assertEquals(7, ((Rectangle)rectangle).getHeight());
	}

}
