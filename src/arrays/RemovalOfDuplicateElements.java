package arrays;

import java.util.Scanner;

public class RemovalOfDuplicateElements 
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
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
				}
			}
		}
		for(int k:a)
		{
			if(k!=0)
				System.out.print(k+" ");
		}
	}

}