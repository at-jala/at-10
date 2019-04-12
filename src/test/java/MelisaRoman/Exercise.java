package Package;

public class Exercise {
	public static String valueOfSpecifiedExpression(String str) {
		String value = "";
		boolean boolInString;
		String[] inputsInString = str.split(" ");
		int cantOfElements = inputsInString.length;

		if (!(str.matches(".*[^a-z].*"))) { //todos son
			
				for (int i = 0; i < cantOfElements; i++) {
				try {
					boolInString = Boolean.parseBoolean(inputsInString[i]);
				}catch(Exception e) {
					//nothing
				}
				
			}
		}
		return value;

	}

}
