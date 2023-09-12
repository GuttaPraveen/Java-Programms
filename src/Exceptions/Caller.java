package Exceptions;

public class Caller
{
	public static void m1() 
	{
		try
		{
			m2();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("hello");
		}
	}
	public static void m2() 
	{
		int a[]=new int[3];
		//System.out.println(a[4]);
		throw new ArrayIndexOutOfBoundsException("In m2");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		m1();

	}

}