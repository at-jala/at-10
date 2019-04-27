package main.java.MadayAlcala.Figures;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void getFigureType_SquareFigureType_resultSquare() {
		Figure square = new Square(9);
		assertEquals("Square", square.getFigureType());
	}

	@Test
	public void getTag_SquareTag_resultS01() {
		Figure square = new Square(7);
		assertEquals("S-01", square.getTag());
	}

	@Test
	public void getDescription_squareDescription_result1IAmSquare() {
		Figure square = new Square(21);
		assertEquals("I'm a Square", square.getDescription());
	}

	@Test
	public void area_SquareArea4_result16() {
		Figure square = new Square(4);
		assertEquals(16, square.getArea(), 0.0);
	}

	@Test
	public void getBase_SquareBase3_result3() {
		Figure square = new Square(3);
		assertEquals(3, square.getBase());
	}
}
