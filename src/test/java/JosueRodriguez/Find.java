package src;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Find {
	public static int findString(String expresion) {
		//Integer result=new Integer(interprete.eval(expression)));
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine interprete = manager.getEngineByName("js");
		//try {
			//result=Integer.parseInt((String)interprete.eval(expression));
		//} catch (ScriptException e) {
			//e.printStackTrace();
		//}
		try {
			double result = (Double)interprete.eval(expresion);
			//int result = (int)interprete.eval(expression);
			System.out.println(result);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 33;
	}
}
