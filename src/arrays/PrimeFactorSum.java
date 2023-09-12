package arrays;

import java.util.Scanner;

public class PrimeFactorSum
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int c=0;
			for(int j=2;j<=a[i]/2;j++)
			{
				if(a[i]%j==0)
				{
					c++;
					
				}
			}

		}

	}

}
