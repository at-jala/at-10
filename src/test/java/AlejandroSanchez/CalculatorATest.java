import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorATest {

	@Test 
	public void operationA_correctResult() {
		int expected = 33;
		int actual = CalculatorA.divide((CalculatorA.add(100,1)),3);
		assertEquals(expected,actual);
	}

	@Test 
	public void operationB_correctResult() {
		float expected = 30.0000003;
		float actual = CalculatorA.times(0.000006,10000000.1);
		assertEquals(expected,actual);
	}

	@Test 
	public void operationC_correctResult() {
		boolean expected = true;
		boolean actual = CalculatorA.and(true,true);
		assertEquals(expected,actual);
	}

	@Test 
	public void operationD_correctResult() {
		boolean expected = false;
		boolean actual = CalculatorA.and(false,true);
		assertEquals(expected,actual);
	}

	@Test 
	public void operationE_correctResult() {
		boolean expected = true;
		boolean actual = CalculatorA.and((CalculatorA.or(false,false)),(CalculatorA.or(true, true)));;
		assertEquals(expected,actual);
	}

	@Test 
	public void operationF_correctResult2() {
		boolean expected = false;
		boolean actual = CalculatorA.or((CalculatorA.and(false,false)),(CalculatorA.and(true, true)));;
		assertEquals(expected,actual);
	}


}
