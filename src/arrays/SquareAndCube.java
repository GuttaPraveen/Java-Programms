package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SquareAndCube
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
			if(a[i]%2!=0)
			{
				b[count++]=(int)Math.pow(a[i],3);
			}
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				b[count++]=(int)Math.pow(a[i],2);
			}
		}
		System.out.println(Arrays.toString(b));

	}

}
