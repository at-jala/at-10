import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SquareTest {

	@Test
	public void getFigureType_SquareBase4_Square() {
		Figure square=new Square(4,"Description of square" ,"S-1");
		assertEquals("Square", square.getFigureType());
	}
	@Test
	public void area_SquareArea4_result16() {
		Square square=new Square(4,"Description of square", "S-1");
		assertEquals(16, square.getArea(),0.0);
	}
	@Test
	public void getBase_SquareBase4_result4() {
		Square square=new Square(4,"Descripcion of square","S-1");
		assertEquals(4, square.getBase());
	}
}
