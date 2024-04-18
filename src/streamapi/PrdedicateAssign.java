package streamapi;

import java.util.Arrays;
import java.util.function.Predicate;

public class PrdedicateAssign
{
	public static void main(String[] args)
	{
		String[ ]  names = {"Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };
		Predicate<String> p = s->s.startsWith("A");
		Arrays.stream(names).filter(p).forEach(System.out::println);
	}
	
}

/*
Declare names in an array and print names which are starting with 'A' using lambda expression.

String[ ]  names = {"Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };


		Predicate<String> p = name -> name.charAt(0) == 'A';

		for (String name : names)
		{
			if ( p.test(name) )
			{
				System.out.println(name);
			}
		}
*/
