/*
                Customized Exception Handling by using try-catch:

                
It is highly recommended to handle exceptions.In our program the code which may raise exception is called risky code,
 we have to place risky code inside try block and the corresponding handling code inside catch block.

 */


package Exceptions;

public class CustomExceptionWithTryCatch
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Statement-1");
			System.out.println(10/0);
			
		}
		catch(ClassCastException e)
		{
			System.out.println(10/2);
		}
		finally
		{
			System.out.println("Statement-3");
			
		}
	}
		



}
