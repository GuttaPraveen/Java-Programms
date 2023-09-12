package nestedloops;

import java.util.Scanner;

public class AlienNumbers {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=n;i<=m;i++)
		{
			int res1=i*i,res2=0;
			int temp=i,rev=0;
			while(temp>0)
			{
				rev=rev*10+temp%10;
				temp/=10;
			}
			int sq2=rev*rev;
			while(sq2>0)
			{
				res2=res2*10+sq2%10;
				sq2/=10;
			}
			if(res1==res2)
				System.out.println("Alien Number: "+i);
			
		}

	}

}
