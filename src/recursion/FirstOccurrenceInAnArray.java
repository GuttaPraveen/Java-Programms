package recursion;

import java.util.Scanner;

public class FirstOccurrenceInAnArray
{
	public static int firstOccurrence(int a[],int val,int i)
	{
		if(i==a.length-1)
			return -1;
		if(a[i]==val)
			return i;
		
		return firstOccurrence(a,val,i+1);
		
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
		int res=firstOccurrence(a,key,0);
		System.out.println(res);

	}

}
