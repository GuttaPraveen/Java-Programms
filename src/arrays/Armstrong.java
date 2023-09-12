package arrays;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int temp=a[i],sum=0;
			while(temp>0)
			{
				sum=sum*10+temp%10;
				temp/=10;
			}
			if(sum==a[i])
				System.out.print(a[i]+" ");
		
		}*/
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int l=(int)Math.log10(a[i])+1;
			int temp=a[i],sum=0;
			while(temp>0)
			{
				int rem=temp%10;
				sum=sum+(int)Math.pow(rem,l);
				temp/=10;
			}
			//System.out.println(sum);
			if(sum==a[i])
				System.out.println(a[i]+" ");
		}


	}

}
