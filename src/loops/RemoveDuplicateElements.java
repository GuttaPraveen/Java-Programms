package loops;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElements
{
	/* Array is sorting */
	/*
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
		Arrays.sort(a);
		int i=0;
		for(i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
				System.out.print(a[i]+" ");
		}
		System.out.print(a[i]);*/

	/* Array is not sort */
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
		int i=0,j=0;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[i]=-1;
				}
			}

		}
		for(i=0;i<n;i++)
		{
			if(a[i]!=-1)
				System.out.print(a[i]+" ");
		}
	}

}

