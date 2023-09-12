/*
printStackTrace():This method prints exception information in the following format. 
					Name of the exception: description of exception Stack trace
toString(): This method prints exception information in the following format. 
			 Name of the exception: description of exception
getMessage(): This method returns only description of the exception.Description
 */

package Exceptions;
public class ExceptionInformation
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();//java.lang.ArithmeticException: / by zero    at Basics/Exceptions.ExceptionInformation.main(ExceptionInformation.java:11)
			System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
			System.out.println(e.getMessage());/// by zero
		}

	}

}
