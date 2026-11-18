//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;

public class SyntaxChecker
{
	private String exp;

	public SyntaxChecker()
	{
	}

	public SyntaxChecker(String s)
	{
		exp = s;
	}
	
	public void setExpression(String s)
	{
		exp = s;
	}

	public boolean checkExpression()
	{
      //You can change this to a stack of Strings if you prefer.
   		Stack<Character> symbols = new Stack<>();
		String input = exp;
		while(input.length() > 0)
		{
			char ch = input.charAt(0);
			input = input.substring(1,input.length());
			if(ch == '(' || ch == '{' || ch == '[' || ch == '<'){
				symbols.push(ch);
			}
			else if(ch == ')' || ch == '}' || ch == ']' || ch == '>'){
				if(symbols.isEmpty()){
					return false;
				}
				char top = symbols.pop();
				if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[') || (ch == '>' && top != '<')){
					return false;
				}
			}
		}
		if(!symbols.isEmpty()){
			return false;
		}
   		return true;
	}

	//write a toString method
	public String toString()
	{
		return checkExpression() ? exp + " is correct." : exp + " is incorrect.";
	}
}