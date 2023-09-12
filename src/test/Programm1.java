package test;
import java.util.Scanner;

public class Programm1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.next().equals("YES"))
		{
			int n=sc.nextInt();
			int c=0;
			for(int j=2;j<=n/2;j++)
			{
				if(n%j==0)
				{
					c++;
					break;
				}
			}
			if(c==0)
			{
				System.out.println("Prime: "+n);
			}
			else
			{
				System.out.println("Not a Prime: "+n);
			}
		}
		System.out.println("Break");
		
	}
}
