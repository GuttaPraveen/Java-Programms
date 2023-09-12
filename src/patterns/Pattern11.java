package patterns;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int count=0,c=2;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(65+count++)+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(c+" ");
				c+=2;
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("#"+" ");
			}
			System.out.println();
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r-i+1;j++)
			{
				System.out.print("#"+" ");
			}
			System.out.println();
		}
		System.out.println();
		

	}

}
/*
 			A 
			B C 
			D E F 
			G H I J 
			K L M N O 
			

			2 
			4 6 
			8 10 12 
			14 16 18 20 
			22 24 26 28 30 

			# 
			# # 
			# # # 
			# # # # 
			# # # # # 
			# # # # # # 
			# # # # # 
			# # # # 
			# # # 
			# # 
			#
*/


