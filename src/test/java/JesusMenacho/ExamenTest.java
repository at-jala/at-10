import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExamenTest {
	
	@Test
	void operationMath_threeNumberBooleans_correctResult() {
		int expected = 33;
		int actual = Examen.operationMath(100,0,3);
		assertEquals(expected, actual);
	}
	@Test
	void compareTwoBooleans_twoBooleans_correctResult() {
		Boolean expected = true;
		boolean actual = Examen.compareTwoBooleans(true,true);
		assertEquals(expected, actual);
	}
	@Test
	void compareTwoBooleans_twoBooleansFalse_correctResult() {
		Boolean expected = false;
		boolean actual = Examen.compareTwoBooleans(false,true);
		assertEquals(expected, actual);
	}
	@Test
	void compareTwoGroupBooleans_twoGroupCondicionofBooleans_correctResult() {
		Boolean expected = true;
		boolean actual = Examen.compareTwoGroupBooleans(false,false,true,true);
		assertEquals(expected, actual);
	}
	@Test
	void compareTwoGroupFourBooleans_twoGroupCondicionofBooleansFalse_correctResult() {
		Boolean expected = false;
		boolean actual = Examen.compareTwoGroupBooleansUsingOr(false,false,true,true);
		assertEquals(expected, actual);
	}
}
