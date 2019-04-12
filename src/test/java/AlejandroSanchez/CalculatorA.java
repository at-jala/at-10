public class CalculatorA {
	public static int add (int number1, int number2) {
		return (number1 + number2);
	}

	public static float times (float number1, float number2) {
		return number1 * number2;
	}
	
	public static int divide (int number1, int number2) {
		return number1 / number2;
	}
	
	public static boolean and (boolean number1, boolean number2) {
		return (number1 && number2);
	}
	
	public static boolean or  (boolean boolean1, boolean boolean2) {
		return (boolean1 || boolean2);
	}
	
	public int operationA(int number1, int number2, int number3) {
		return add(number1,number2)/number3;
	}
	public boolean operationE(boolean boolean1, boolean boolean2, boolean boolean3, boolean boolean4) {
		return and((or(boolean1,boolean2)),(or(boolean3, boolean4)));
	}
	public boolean operationF(boolean boolean1, boolean boolean2, boolean boolean3, boolean boolean4) {
		return or((and(boolean1,boolean2)),(and(boolean3, boolean4)));
	}
	
}
