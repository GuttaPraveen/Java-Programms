package Exceptions;

public class AIOBEDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] x=new int[10];
		System.out.println(x[0]);//valid
		System.out.println(x[100]);//AIOOBE
		System.out.println(x[-100]);//AIOOBE

	}

}
