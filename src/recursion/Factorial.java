package recursion;

import java.util.Scanner;

public class Factorial
{
	public static int fact(int n)
	{
		if(n<=1)
			return 1;
		return n*fact(n-1);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int res=fact(n);
		System.out.println("The Factorial Of a number "+n+" is: "+res);

	}

}
