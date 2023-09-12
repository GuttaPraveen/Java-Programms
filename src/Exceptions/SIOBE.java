package Exceptions;

public class SIOBE
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s[]=new String[5];
		try
		{
			System.out.println(s[7]);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
