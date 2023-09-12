package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayElements
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
		int b[]=new int[n];
		/*
		//To copy elements in reverse order
		for(int i=0;i<n;i++)
		{
			b[i]=a[n-i-1];
		}
		System.out.println("Copied Array is: "+Arrays.toString(b));
		*/
		
		/*
		//To copy elements in forward and reverse order
		int i=0;
		for(i=0;i<=a.length/2;i++)
		{
			b[i]=a[i];
		}
		int count=i;
		for(i=a.length-1;i>a.length/2;i--)
		{
			b[count++]=a[i];
		}
		System.out.println(Arrays.toString(b));*/
		//To copy elements in reverse order and Forward order
		int count=0;
		for(int i=a.length/2;i>=0;i--)
		{
			b[count++]=a[i];
		}
		for(int i=a.length/2+1;i<a.length;i++)
		{
			b[i]=a[i];
		}
	
		System.out.println(Arrays.toString(b));
	}

}
