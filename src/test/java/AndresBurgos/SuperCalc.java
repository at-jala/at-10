import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class SuperCalc {
	public static String expEvaluator(String exp) {
		String result="";
		
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");        
		try {
			Object res = engine.eval(exp);
			result=res.toString();
		} catch (ScriptException e) {
			// nothing for now
		}
		
		
		return result;
	}
}
