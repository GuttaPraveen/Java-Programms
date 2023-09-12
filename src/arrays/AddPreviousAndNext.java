package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddPreviousAndNext {

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
		b[0]=a[0]+a[1];
		b[n-1]=a[n-2]+a[n-1];
		for(int i=1;i<a.length-1;i++)
		{
			b[i]=a[i-1]+a[i+1];
		}
		System.out.println(Arrays.toString(b));

	}

}
