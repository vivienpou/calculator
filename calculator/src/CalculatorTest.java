import javax.script.ScriptException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
		Assertions.assertEquals(calculator.operation(2, 3, Operators.PLUS), 5);

	}

	@Test
	public void testMinus() throws ScriptException
	{
		Assertions.assertEquals(calculator.minus(2, 3), -1);
		Assertions.assertEquals(calculator.operation(2, 3, Operators.MINUS), -1);

	}

	@Test
	public void testMultiply() throws ScriptException
	{
		Assertions.assertEquals(calculator.multiply(2, 3), 6);
		Assertions.assertEquals(calculator.multiply(-2, 3), -6);
		Assertions.assertEquals(calculator.multiply(-2, -3), 6);
		Assertions.assertEquals(calculator.multiply(-2, 0), 0);
		Assertions.assertEquals(calculator.operation(2, 3, Operators.MULTIPLY), 6);
		Assertions.assertEquals(calculator.operation(-2, 3, Operators.MULTIPLY), -6);
		Assertions.assertEquals(calculator.operation(-2, 0, Operators.MULTIPLY), 0);
	}

	@Test
	public void testDivid() throws ScriptException
	{
		Assertions.assertEquals(calculator.divid(2, 3), 0);
		Assertions.assertEquals(calculator.divid(-6, 2), -3);
		Assertions.assertEquals(calculator.divid(-6, -3), 2);

		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
			calculator.divid(-6, 0);
		});
		String expectedMessage = "Please investigate school program, why would you do that ?";
		String actualMessage = exception.getMessage();
		assertTrue(actualMessage.contains(expectedMessage));

		Assertions.assertEquals(calculator.operation(6, 2, Operators.DIVID), 3);
		Assertions.assertEquals(calculator.operation(-6, 3, Operators.DIVID), -2);
		Assertions.assertEquals(calculator.operation(-6, -2, Operators.DIVID), 3);
	}

}
