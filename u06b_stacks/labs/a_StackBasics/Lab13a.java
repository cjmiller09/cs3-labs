//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab13a
{
	public static void main ( String[] args )
	{
		StackTester test = new StackTester("a b c d e f g h i");
		out.println(test+"\n");
		test.popEmAll();
		test.setStack("1 2 3 4 5 6 7 8 9 10");
		out.println(test+"\n");
		test.popEmAll();
		test.setStack("# $ % ^ * ( ) ) _");
		out.println(test+"\n");
		test.popEmAll();
	}
}
