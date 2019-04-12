import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SuperCalcTest {

	@Test
	void expEvaluator_aritmeticExpression_groupedDivision() {
		String expected = "33";
		String actual = SuperCalc.expEvaluator("(101 + 0) / 3)");
		assertEquals(expected, actual);
	}

	@Test
	void expEvaluator_aritmeticExpression_groupedMultiplication() {
		String expected = "30.0000003";
		String actual = SuperCalc.expEvaluator("(3.0e-6 * 10000000.1))");
		assertEquals(expected, actual);
	}
	
	@Test
	void expEvaluator_booleanExpression_trueAndTrue() {
		String expected = "true";
		String actual = SuperCalc.expEvaluator("(true && true)");
		assertEquals(expected, actual);
	}
	
	@Test
	void expEvaluator_booleanExpression_falseAndTrue() {
		String expected = "false";
		String actual = SuperCalc.expEvaluator("(false && true)");
		assertEquals(expected, actual);
	}
	
	@Test
	void expEvaluator_booleanExpression_groupedOrAnd() {
		String expected = "true";
		String actual = SuperCalc.expEvaluator("((false && false) || (true && true))");
		assertEquals(expected, actual);
	}
	
	@Test
	void expEvaluator_booleanExpression_groupedAndOr() {
		String expected = "false";
		String actual = SuperCalc.expEvaluator("(false || false) && (true && true)");
		assertEquals(expected, actual);
	}
}
