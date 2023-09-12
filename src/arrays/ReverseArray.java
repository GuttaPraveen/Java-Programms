package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		/*int count=0;
		for(int i=n-1;i>n/2;i--)
		{
			int temp=a[i];
			a[i]=a[count];
			a[count++]=temp;
			
		}*/
		int l=0,r=a.length-1;
		while(l<=r)
		{
			int temp=a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;
			r--;
		}
		System.out.println(Arrays.toString(a));
		

	}

}
