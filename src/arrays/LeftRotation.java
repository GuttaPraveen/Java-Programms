package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		/*for(int i=l;i<a.length;i++)
		{
			b[count++]=a[i];
		}
		for(int i=0;i<l;i++)
		{
			b[count++]=a[i];
		}
		System.out.println(Arrays.toString(b));*/
		for(int i=0;i<l;i++)
		{
			int temp=a[0],j;
			for(j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[j]=temp;
		}
		System.out.println(Arrays.toString(a));

	}

}
