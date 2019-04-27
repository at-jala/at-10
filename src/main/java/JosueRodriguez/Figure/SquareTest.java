package main.java.JosueRodriguez.Figure;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void getFigureType_SquareBase4_Square() {
		Figure square = new Square("I am aSquare", "S-1", 4);
		assertEquals("Square", square.getFigureType());
	}

	@Test
	public void area_SquareArea4_result16() {
		Figure square = new Square("I am aSquare", "S-1", 4);
		assertEquals(16, square.getArea(), 0.0);
	}

	@Test
	public void getBase_SquareBase4_result4() {
		Figure square = new Square("I am aSquare","S-1",4);
		assertEquals(4, ((Square)square).getSideSquare());
	}
}
