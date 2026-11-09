//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
import java.util.Scanner;

public class Lab08c
{
	public static void main( String args[] ) throws IOException
	{
		Relatives test = new Relatives();
		Scanner file = new Scanner(new File("lab08c.dat"));
		while(file.hasNextLine()){
			test.setPersonRelative(file.nextLine());
		}	
		out.println(test);
		out.println();
		out.println(test.getRelatives("Dot"));
		out.println();
		out.println("Is Dot directly related to Tom? " + (test.getRelatives("Dot").indexOf("Tom") > -1 ? "Yes" : "No"));
		out.println("Is Dot directly related to Alice? " + (test.getRelatives("Dot").indexOf("Alice") > -1 ? "Yes" : "No"));
	}
}