//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab13b
{
	public static void main ( String[] args )
	{
		SyntaxChecker test = new SyntaxChecker("(abc(*def)");
		out.println(test);
		test.setExpression("[{}]");
		out.println(test);
		test.setExpression("["); 
		out.println(test);
		test.setExpression("[{<()>}]");
		out.println(test);
		test.setExpression("{<html[value=4]*(12)>{$x}}");
		out.println(test);
		test.setExpression("[one]<two>{three}(four)");
		out.println(test);
		test.setExpression("car(cdr(a)(b)))");
		out.println(test);
		test.setExpression("car(cdr(a)(b))");
		out.println(test);
	}
}