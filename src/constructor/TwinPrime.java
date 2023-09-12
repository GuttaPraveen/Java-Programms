package constructor;

import java.util.Scanner;

public class TwinPrime
{
	public static boolean isPrime(int a)
	{
		int count=0;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
			return true;
		else
			return false;
	}
	
	TwinPrime(int a,int b)
	{
		if(isPrime(a)&& isPrime(b)||Math.abs(a-b)==2)
		{
			System.out.println("Twin Prime");
		}
		else
			System.out.println("Not Twin Prime");
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		TwinPrime t= new TwinPrime(n1,n2);

	}

}
