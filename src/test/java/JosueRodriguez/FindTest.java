package src;

import static org.junit.Assert.*;

import org.junit.*;

public class FindTest {
	
	@Test
	public void findString_valueString_correctResult33() {
		int expected=33;
		int actual=Find.findString("(101 + 0) / 3");
		assertEquals(actual,expected);
	}
}
