
public class Examen {
	public static int operationMath(int numberA,int numberB,int numberb) {
		return ((numberA+numberB)/numberb);
	}
	public static Boolean compareTwoBooleans(Boolean booleanA, Boolean booleanB) {
		return (booleanA&&booleanB);
	}
	public static Boolean compareTwoGroupBooleans(Boolean booleanA, Boolean booleanB,Boolean booleanC, Boolean booleanD) {
		return ((booleanA&&booleanB)||( booleanC&&booleanD));
	}
	public static Boolean compareTwoGroupBooleansUsingOr(Boolean booleanA, Boolean booleanB,Boolean booleanC, Boolean booleanD) {
		return ((booleanA||booleanB)&& (booleanC&&booleanD));
	}
}
