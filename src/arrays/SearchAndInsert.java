package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SearchAndInsert
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int key=sc.nextInt();
		boolean flag=false;
		int k=0;
		int a[]=new int[n];
		for(int i=0;i<n-1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				flag=true;
				k=i;
				break;
			}
		}
		if(flag==true)
			System.out.println("The given Key"+key+" is Found at: "+k);
		else
		{
			int m=a.length/2;
			for(int i=a.length-1;i>m;i--)
			{
				a[i]=a[i-1];
			}
			a[m]=key;
			System.out.println(Arrays.toString(a));
		}

	}

}
