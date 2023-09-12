package test;
import java.util.*;
public class Programm3
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			int count=i;
	 
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==2*i-1|| j==1)
			System.out.print(1);
				else if(j>i)
					System.out.print(--count);
				else
					System.out.print(j);
			}
			System.out.println();
		}
		for(int i=r-1;i>0;i--)
		{
			int count=i;
	 
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==2*i-1|| j==1)
			System.out.print(1);
				else if(j>i)
					System.out.print(--count);
				else
					System.out.print(j);
			}
			System.out.println();
		}
	}

}
