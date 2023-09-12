package patterns;

import java.util.Scanner;

public class Pattern3 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		//*
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		//1
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//A
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print((char)(65+j)+" ");
			}
			System.out.println();
		}
	}
}
/*
 		* 
 		* * 
 		* * * 
 		* * * * 
 		* * * * * 
 		* 
		
		
		1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5 



		A 
		A B 
		A B C 
		A B C D 
*/
