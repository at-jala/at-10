package Package;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciseTest {

	@Test
	public void valueOfSpecifiedExpression_caseA_correctResult() {
		String actual=Exercise.valueOfSpecifiedExpression("(101 + 0) / 3");
		String expected="33";
		assertEquals(expected, actual);
	}
	
	@Test
	public void valueOfSpecifiedExpression_caseB_correctResult() {
		String actual=Exercise.valueOfSpecifiedExpression("3.0e-6 * 10000000.1");
		String expected="30.0000003";
		assertEquals(expected, actual);
	}
	
	@Test
	public void valueOfSpecifiedExpression_caseBooleanC_correctResult() {
		String actual=Exercise.valueOfSpecifiedExpression("true && true");
		String expected="true";
		assertEquals(expected, actual);
	}
	
	@Test
	public void valueOfSpecifiedExpression_caseBooleanD_correctResult() {
		String actual=Exercise.valueOfSpecifiedExpression("false && true");
		String expected="false";
		assertEquals(expected, actual);
	}
	
	@Test
	public void valueOfSpecifiedExpression_caseBooleanE_correctResult() {
		String actual=Exercise.valueOfSpecifiedExpression("(false && false) || (true && true)");
		String expected="true";
		assertEquals(expected, actual);
	}
	
	@Test
	public void valueOfSpecifiedExpression_caseBooleanF_correctResult() {
		String actual=Exercise.valueOfSpecifiedExpression("(false || false) && (true && true)");
		String expected="false";
		assertEquals(expected, actual);
	}
}
