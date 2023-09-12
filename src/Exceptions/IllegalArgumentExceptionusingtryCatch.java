package Exceptions;

public class IllegalArgumentExceptionusingtryCatch
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Thread t=new Thread();
		try
		{
			t.setPriority(100);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.toString());
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
