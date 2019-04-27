package main.java.MadayAlcala.Figures;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void getFigureType_rectangleBase5Heigth2_result12() {
		Figure rectangle = new Rectangle(4, 3);
		assertEquals("Rectangle", rectangle.getFigureType());
	}

	@Test
	public void getTag_rectangleTag_resultR01() {
		Figure rectangle = new Rectangle(4, 3);
		assertEquals("R-01", rectangle.getTag());
	}

	@Test
	public void getDescription_rectangleDescription_result1ImARectangle() {
		Figure rectangle = new Rectangle(4, 3);
		assertEquals("I'm a Rectangle", rectangle.getDescription());
	}

	@Test
	public void area_rectangleAreaBase5Heigth7_result35() {
		Figure rectangle = new Rectangle(5, 7);
		assertEquals(35, rectangle.getArea(), 0.0);
	}

	@Test
	public void getBase_rectangleBase7_result7() {
		Figure rectangle = new Rectangle(7, 3);
		assertEquals(7, rectangle.getBase());
	}

	@Test
	public void getHeight_rectangleHeight9_result9() {
		Figure rectangle = new Rectangle(9, 9);
		assertEquals(9, ((Rectangle) rectangle).getHeight());
	}

}
