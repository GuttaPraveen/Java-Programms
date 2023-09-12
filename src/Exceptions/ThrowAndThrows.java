package Exceptions;

import java.util.Scanner;

public class ThrowAndThrows 
{

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		if(n==0)
			throw new ArithmeticException("/ by zero");
		else
			System.out.println(n);
		

	}

}
