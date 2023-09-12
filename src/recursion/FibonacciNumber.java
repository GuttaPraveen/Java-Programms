package recursion;

import java.util.Scanner;

public class FibonacciNumber
{
	public static int fib(int n)
	{
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2); // Recursive Calls
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		System.out.print(fib(n)+" ");

	}

}
