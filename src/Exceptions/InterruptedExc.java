package Exceptions;

public class InterruptedExc
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Thread t=new Thread();
		try
		{
			
			t.start();
			t.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}

	}

}
