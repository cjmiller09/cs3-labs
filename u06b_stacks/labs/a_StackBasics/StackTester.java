//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class StackTester
{
	private Stack<String> stack;

	public StackTester()
	{
		setStack("");
	}

	public StackTester(String line)
	{
		setStack(line);
	}
	
	public void setStack(String line)
	{
		stack = new Stack<String>();
		String[] words = line.split(" ");
		for(String word : words){
			stack.push(word);
		}
	}

	public void popEmAll()
	{
		out.println("popping all items from the stack");
		while(!stack.isEmpty()){
			out.print(stack.pop()+ " ");
		}
		out.println("\n\n");
	}

	public String toString()
	{
		return stack.toString();
	}
}