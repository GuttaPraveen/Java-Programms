package Exceptions;

public class ArithmeticExc
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());//ArithmeticException
			e.printStackTrace();
		}

	}

}
/*
 * Exception Name : java.lang.ArithmeticException
Exception Description : / by zero
Exception Location : Main.java: 5
*/
