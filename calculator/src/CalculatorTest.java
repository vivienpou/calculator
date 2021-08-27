import javax.script.ScriptException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest
{
	private static Calculator calculator;

	@BeforeAll
	public static void setupClass()
	{
		calculator = new Calculator();
	}

	@Test
	public void testAdd() throws ScriptException
	{
		Assertions.assertEquals(calculator.add(2, 3), 5);
		Assertions.assertNotEquals(calculator.add(2, 3), 4);
		Assertions.assertEquals(calculator.operation(2, 3, Operators.PLUS), 5);
		Assertions.assertNotEquals(calculator.operation(2, 3, Operators.PLUS), 4);

	}

	@Test
	public void testMinus() throws ScriptException
	{
		Assertions.assertEquals(calculator.minus(2, 3), -1);
		Assertions.assertNotEquals(calculator.minus(2, 3), 1);
		Assertions.assertEquals(calculator.operation(2, 3, Operators.MINUS), -1);
		Assertions.assertNotEquals(calculator.operation(2, 3, Operators.MINUS), 1);

	}

	@Test
	public void testMultiply() throws ScriptException
	{
		Assertions.assertEquals(calculator.multiply(2, 3), 6);
		Assertions.assertNotEquals(calculator.multiply(2, 3), 5);
		Assertions.assertEquals(calculator.multiply(-2, 3), -6);
		Assertions.assertEquals(calculator.multiply(-2, -3), 6);
		Assertions.assertEquals(calculator.operation(2, 3, Operators.MULTIPLY), 6);
		Assertions.assertNotEquals(calculator.operation(2, 3, Operators.MULTIPLY), 5);
		Assertions.assertEquals(calculator.operation(-2, 3, Operators.MULTIPLY), -6);
		Assertions.assertEquals(calculator.operation(-2, -3, Operators.MULTIPLY), 6);
	}

	@Test
	public void testDivid() throws ScriptException
	{
		Assertions.assertEquals(calculator.divid(2, 3), 0);
		Assertions.assertNotEquals(calculator.divid(2, 3), 5);
		Assertions.assertEquals(calculator.divid(-6, 2), -3);
		Assertions.assertEquals(calculator.divid(-6, -3), 2);
		Assertions.assertEquals(calculator.operation(2, 3, Operators.DIVID), 6);
		Assertions.assertNotEquals(calculator.operation(2, 3, Operators.DIVID), 5);
		Assertions.assertEquals(calculator.operation(-2, 3, Operators.DIVID), -6);
		Assertions.assertEquals(calculator.operation(-2, -3, Operators.DIVID), 6);
	}

}
