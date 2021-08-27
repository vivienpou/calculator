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
		try
		{
			return num1 / num2;

		} catch (ArithmeticException e) {
			throw new ArithmeticException("Please investigate school program, why would you do that ?");
		}
	}

	public int operation(int num1, int num2, Operators operators) throws NumberFormatException, ArithmeticException
	{

		switch (operators){
			case DIVID:
				return divid(num1,num2);
			case MULTIPLY:
				return multiply(num1,num2);
			case PLUS:
				return add(num1,num2);
			case MINUS:
				return minus(num1,num2);
			default:
				return 0;
		}
	}

}