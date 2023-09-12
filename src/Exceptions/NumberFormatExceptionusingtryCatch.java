package Exceptions;

public class NumberFormatExceptionusingtryCatch
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i=Integer.parseInt("10");
		try
		{
			System.out.println(i);
			//int j=Integer.parseInt("ten");
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
