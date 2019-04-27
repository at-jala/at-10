package main.java.JosueRodriguez.Figure;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void getFigureType_rectangleBase4Heigth3_result12() {
		Figure rectangle = new Rectangle("I'm Rectangle", "R-1", 4, 3);
		assertEquals("Rectangle", rectangle.getFigureType());
	}

	@Test
	public void area_rectangleAreaBase5Heigth7_result35() {
		Figure rectangle = new Rectangle("I'm Rectangle", "R-1", 5, 7);
		assertEquals(35, rectangle.getArea(), 0.0);
	}

	@Test
	public void getBase_rectangleBase7_result7() {
		Rectangle rectangle = new Rectangle("I'm Rectangle", "R-1", 7, 3);
		assertEquals(7, rectangle.getBase());
	}

	@Test
	public void getHeight_rectangleHeight7_result7() {
		Figure rectangle = new Rectangle("I'm Rectangle", "R-1", 7, 7);
		assertEquals(7, ((Rectangle) rectangle).getHeight());
	}

}
