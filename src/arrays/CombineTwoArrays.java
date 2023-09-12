package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CombineTwoArrays
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		int c[]=new int[n+n];
		int d[]=new int[n+n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			c[count++]=a[i];
		}
		for(int i=0;i<n;i++)
		{
			c[count++]=b[i];
		}
		int count1=0;
		for(int i=0;i<n;i++)
		{
			d[count1++]=a[i];
			d[count1++]=b[i];
		}
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));

	}

}
