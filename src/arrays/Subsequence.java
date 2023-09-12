package arrays;

import java.util.Scanner;

public class Subsequence
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("[");
		for(int i=0;i<n;i++)
		{
			
			for(int j=i;j<n;j++)
			{
				System.out.print("[");
				for(int k=i;k<=j;k++)
				{
					System.out.print(a[k]+",");
				}
				System.out.print("]");
			}
		}
		System.out.println("]");

	}

}
