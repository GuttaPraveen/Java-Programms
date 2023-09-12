package arrays;

import java.util.Scanner;
import java.util.*;

public class NegativeAndPositive
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
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				a[count++]=a[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>0)
			{
				a[count++]=a[i];
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
