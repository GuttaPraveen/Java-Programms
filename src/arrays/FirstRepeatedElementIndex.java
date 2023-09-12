package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FirstRepeatedElementIndex
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n vaue: ");
		int n=sc.nextInt();
		int a[]=new int[n];//1 5 3 4 3 5 6
		int b[]=new int[n];
		Arrays.fill(b, -1);
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int minidx=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(b[a[i]]!=-1)//b[1] = -1
			{
				minidx=Math.min(minidx, b[a[i]]);
			}
			else
				b[a[i]]=i;//0 
			
		}
		if(minidx==Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(minidx+1);
			

	}

}
