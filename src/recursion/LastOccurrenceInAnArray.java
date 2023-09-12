package recursion;

import java.util.Scanner;

public class LastOccurrenceInAnArray
{
	public static int lastOccurrence(int a[],int val,int i)
	{
		if(i==0)
			return -1;
		if(a[i]==val)
			return i;
		return lastOccurrence(a,val,i-1);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int key=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int res=lastOccurrence(a,key,n-1);
		System.out.println("The last Occurrence Of the "+key+" is: "+res);
	}

}
