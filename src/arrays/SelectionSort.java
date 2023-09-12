package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort
{
	public static void selectionSort(int a[])
	{
		

		for(int i=0;i<a.length;i++)
		{
			int min=i,j;
			for(j=i+1;j<a.length;j++)
			{
				if(a[min]<a[j])
					min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a element: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		SelectionSort s=new SelectionSort();
		s.selectionSort(a);

	}

}
