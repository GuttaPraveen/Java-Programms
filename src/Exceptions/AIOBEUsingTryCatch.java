package Exceptions;

public class AIOBEUsingTryCatch
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]=new int[5];
		try
		{
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e.toString());
		}

	}

}
