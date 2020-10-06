import cse360assignment02.AddingMachine;

public class TestCase
{
	public static void main(String args[])
	{
		AddingMachine testCase = new AddingMachine();
		testCase.add(4);
		testCase.subtract(2);
		testCase.add(5);
		System.out.println(testCase);
	}
}
