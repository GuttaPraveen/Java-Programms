package assesment;

import java.util.Scanner;

public class Armstrong
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=(int)Math.log10(n)+1;
		int sum=0,temp=n;
		while(temp>0)
		{
			int rem=temp%10;
			sum+=(int)Math.pow(rem,l);
		}
		if(sum==n)
			System.out.println("Armstrong");
		

	}

}
