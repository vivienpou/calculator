public enum Operators
{
	PLUS("+"),MINUS("-"),MULTIPLY("*"),DIVID("/");

	public final String label;

	private Operators(String label){
		this.label = label;
	}
}