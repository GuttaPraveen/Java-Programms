/*
 	Exception: An unwanted unexpected event that disturbs normal flow of the program is 
				called exception.
*/

package Exceptions;
public class Exception1
{
	public static void doStuff()
	{
		doMoreStuff();
	}
	public static void doMoreStuff()
	{
		System.out.println(10/0);
		System.out.println("Hello Welcome To Exceptions");
	}
	public static void main(String[] args)
	{
		doStuff();

	}

}
