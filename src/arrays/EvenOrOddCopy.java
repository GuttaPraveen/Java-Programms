package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOrOddCopy
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				b[count++]=a[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				b[count++]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
		

	}

}
