package arrays;

import java.util.Arrays;

public class Sort
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]=new int[] {10,4,1,3,7,2};
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
			
		}
		System.out.println(Arrays.toString(a));

	}

}
