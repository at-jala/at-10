package main.java.AndresBurgos;
import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void getFigureType_SquareBase4_Square() {
		Figure square=new Square(4, "S-1");
		assertEquals("Square", square.getFigureType());
	}
	@Test
	public void area_SquareArea4_result16() {
		Figure square=new Square(4, "S-1");
		assertEquals(16, ((Rectangle) square).getArea(),0.0);
	}
	@Test
	public void getBase_SquareBase4_result4() {
		Rectangle square=new Square(4, "S-1");
		assertEquals(4, square.getBase());
	}
}
