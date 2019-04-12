import static org.junit.Assert.*;

import org.junit.Test;

public class ExamOneTest {

	@Test
	public void Operation_ThreeNumbersAddAndDivison_CorrectResult() {
		int expected = 33;
		int actual = ExamOne.OperationNumbers(101, 0, 3);
		assertEquals(expected, actual);
	}

}
