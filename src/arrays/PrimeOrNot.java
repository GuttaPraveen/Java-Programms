package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int count1=0,k=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=2;j<=a[i]/2;j++)
			{
				if(a[i]%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				b[count1++]=a[i];
				
			}
				
		}
		int c[]=new int[count1];
		for(int i=0;i<count1;i++)
		{
			
			c[i]=b[i];
		}
		System.out.println(Arrays.toString(c));

	}

}
