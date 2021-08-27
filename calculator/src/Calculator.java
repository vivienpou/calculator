import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class Calculator
{
	public static void main(String[] args)
	{

	}

	public int add (int num1, int num2) {
		return num1 + num2;
	}

	public int minus (int num1, int num2) {
		return num1 - num2;
	}

	public int multiply (int num1, int num2) {
		return num1 * num2;
	}

	public int divid (int num1, int num2) {
		return num1 / num2;
	}

	public int operation(int num1, int num2, Operators operators) throws ScriptException
	{
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		String foo = (num1 + operators.label + num2);
		return Integer.parseInt(engine.eval(foo).toString());
	}

}