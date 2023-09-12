package nestedloops;

import java.util.Scanner;

public class PrimeNUmbers
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();
		Main m=new Main();
		for(int i=s;i<=e;i++)
		{
			int res=m.checkPrime(i);
			if(res==0)
				System.out.print(i+" ");
		}
		

	}

}
class Main
{
	public int checkPrime(int x)
	{
		int fact=0;
		for(int y=2;y<=x/2;y++)
		{
			if(x%y==0)
			{
				fact++;
				break;
			}
		}
		return fact;
	}
}
