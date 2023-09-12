package assesment;

import java.util.Arrays;
import java.util.Scanner;

public class NextGreaterElement
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		int i,j;
		for(i=0;i<n-1;i++)
		{
			
			for(j=i+1;j<n-1;j++)
			{
				if(a[i]<a[j])
				{
					break;
				}
				else
				{
					a[j]=-1;
					break;
				}
			}
			b[i]=a[j];
			
		}
		b[i]=-1;
		System.out.println(Arrays.toString(b));

	}

}
