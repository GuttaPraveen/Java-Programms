package nestedloops;

import java.util.Scanner;

public class PowerNumber
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=n;i<=m;i++)
		{
			int temp=i,sum=0,pro=1;
			while(temp>0)
			{
				sum+=temp%10;
				pro*=temp%10;
				temp/=10;
			}
			if(sum==pro)
				System.out.println("Power Number: "+i);
		}

	}

}
