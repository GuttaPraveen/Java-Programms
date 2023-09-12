package arrays;

import java.util.Scanner;

public class DuplicateElements
{

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
		boolean b[]=new boolean[a.length];
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					b[j]=true;
				}
					
			}
		}
		for(int i=0;i<n;i++)
		{
			if(b[i]==true)
				System.out.println(a[i]);
		}

	}

}
