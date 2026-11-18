//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.*;
public class Lab13c
{
	public static void main ( String[] args )
	{
		//add test cases
		String[] postfixStrings = {
			"2 7 + 1 2 + +",
    		"1 2 3 4 + + -",
    		"9 3 * 8 / 4 +",
    		"19 3 / 2 * 7 9 * + 43 -",
    		"35 5 + 2 * 4 / 19 +",
    		"2.3 49.2 + 0.27 * 9 2 / +",
    		"2 3 2 ^ ^"
		};
		String[] prefixStrings = {
			"+ + 2 7 + 1 2",
			"- 1 + 2 + 3 4",
			"+ / * 9 3 8 4",
			"- + * / 19 3 2 * 7 9 43",
			"+ / * + 35 5 2 4 19",
			"+ * + 2.3 49.2 0.27 / 9 2",
			"^ 2 ^ 3 2"
		};
		out.println("Evaluating Postfix Expressions:");
        for(String expression : postfixStrings){
            out.println(expression + " == " + ExpressionSolver.solvePostfix(expression));
        }
		out.println("\nEvaluating Prefix Expressions:");
		for(String expression : prefixStrings){
			out.println(expression + " == " + ExpressionSolver.solvePrefix(expression));
		}
	}
}
