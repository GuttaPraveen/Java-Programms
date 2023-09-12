package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicateElements {

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
		/*
		Arrays.sort(a);
		int i=0;
		for(i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
				System.out.print(a[i]+" ");
		}
		System.out.print(a[i]);
		System.out.println();*/
		System.out.println("Without Sorting Remove duplicate elements in an Array");
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<n;i++)
		{
			if(a[i]!=-1)
				System.out.print(a[i]+" ");
		}
	}

}
