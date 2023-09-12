package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotate
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int r=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		/*
		for(int i=a.length-r;i<a.length;i++)
		{
			b[count++]=a[i];
		}
		for(int i=0;i<r;i++)
		{
			b[count++]=a[i];
		}
		System.out.println(Arrays.toString(b));*/
		for(int i=0;i<r;i++)
		{
			int temp=a[a.length-1],j;
			for(j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[j]=temp;
			System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));

	}

}
