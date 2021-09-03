public class Calculator

{
	interface OperationSimple
	{
		int calculer(int num1, int num2);
	}

	public static void main(String[] args)
	{

	}

	OperationSimple simplyAdd = (num1, num2) -> num1 + num2;
	OperationSimple simplySubstract = (num1, num2) -> num1 - num2;
	OperationSimple simplyMultiply = (num1, num2) -> num1 * num2;
	OperationSimple simplyDivid = (num1, num2) -> num1 / num2;

	public int add(int num1, int num2)
	{
		return num1 + num2;
	}

	public int minus(int num1, int num2)
	{
		return num1 - num2;
	}

	public int multiply(int num1, int num2)
	{
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
				return multiply(num1, num2);
			case PLUS:
				return add(num1, num2);
			case MINUS:
				return minus(num1, num2);
			default:
				return 0;
		}
	}

	public int simplyoperate(int num1, int num2, Operators operators) throws NumberFormatException, ArithmeticException
	{

		switch (operators)
		{
			case DIVID:
				return simplyDivid.calculer(num1, num2);
			case MULTIPLY:
				return simplyMultiply.calculer(num1, num2);
			case PLUS:
				return simplyAdd.calculer(num1, num2);
			case MINUS:
				return simplySubstract.calculer(num1, num2);
			default:
				return 0;
		}
	}

}