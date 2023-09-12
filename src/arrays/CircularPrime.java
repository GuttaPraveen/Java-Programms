package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CircularPrime
{
	private static boolean isrotate(int[] a)
	{
		// TODO Auto-generated method stub
		boolean b=false;
		for(int i=0;i<a.length-1;i++)
		{
			int temp=a[0],j;
			for(j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[j]=temp;
			System.out.println(Arrays.toString(a));
			String s="";
			for(int k=0;k<a.length;k++)
			{
				s+=String.valueOf(a[k]);
			}
			int n=Integer.parseInt(s);
			if(isprime(n))
				b=true;
			else
			{
				break;
			}
				
		}
		return b;

		
	}

	
	private static boolean isprime(int n)
	{
		int count=0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				break;
		}
		if(count==0)
			return true;
		else
			return false;
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();//1193
		
		int k=(int)Math.log10(n);
		int a[]=new int[k+1];
		for(int i=0;i<a.length;i++)
		{
			a[i]=n/(int)Math.pow(10,k);
			System.out.println(a[i]);
			n=n%(int)Math.pow(10,k);
			System.out.println(n);
			--k;
		}
		System.out.println(Arrays.toString(a));
		if(isrotate(a))
			System.out.println("Circular Prime");
		else
			System.out.println("Not a Circular Prime");

	
		
	}

	
}
