package arrays;

import java.util.Scanner;

public class CommonElementsInTwoArray
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int k=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]==b[j] && a[i]!=k)
				{
					b[j]=-1;
					System.out.println(a[i]);
				}
			}
		}


	}

}
