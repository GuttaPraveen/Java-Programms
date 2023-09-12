package arrays;

import java.util.Arrays;

public class SortEvenandOdd
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]=new int[] {10,15,30,20,19,17,54,99,77,125};
		int e[]=new int[a.length/2];
		int o[]=new int[a.length/2];
		int count=0,count1=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				e[count++]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
				o[count1++]=a[i];
		}
		for(int i=0;i<e.length-1;i++)
		{
			if(e[i]<e[i+1])
			{
				int temp=e[i];
				e[i]=e[i+1];
				e[i+1]=temp;
				i=-1;
			}
		}
		Arrays.sort(o);
		int c=0;
		for(int i=0;i<o.length;i++)
		{
			a[c++]=e[i];
			a[c++]=o[i];
		}
		System.out.println(Arrays.toString(a));
		
		/*
					 public static void main(String[] args)
					{
							// TODO Auto-generated method stub
							System.out.println("Good Morning");
							int a[]=new int[] {10,15,30,20,19,17,54,99,77,125};
							int b[]=new int[a.length];
							int count=0;
							for(int i=0;i<a.length-3;i=i+2)
							{
								if(i%2==0)
								{
									for(int j=0;j<a.length-2;j=j+2)
									{
										if(a[j]<a[j+2])
										{
											int temp=a[j];
											a[j]=a[j+2];
											a[j+2]=temp;
										}
									}	
								}
									
							}
							for(int i=1;i<a.length-3;i=i+2)
							{
								if(i%2!=0)
								{
									if(a[i]>a[i+2])
									{
										int temp=a[i];
										a[i]=a[i+2];
										a[i+2]=temp;
									}
								}
							}
							System.out.println(Arrays.toString(a));
					}
							
		 */

	}

}
