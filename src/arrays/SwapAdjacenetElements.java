package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapAdjacenetElements
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
		for(int i=0;i<n-1;i=i+2)
		{
			int temp=a[i];//10
			a[i]=a[i+1];//20
			a[i+1]=temp;//10
		}
		System.out.println(Arrays.toString(a));
		

	}

}
