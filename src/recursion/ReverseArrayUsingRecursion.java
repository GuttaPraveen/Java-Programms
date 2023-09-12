package recursion;

import java.util.Scanner;

public class ReverseArrayUsingRecursion
{
	public static void reverse(int i,int a[])
	{
		int l=a.length;
		if(i>l-1)
			return ;
		reverse(i+1,a);
		System.out.print(a[i]+" ");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		reverse(0,a);

	}

}
