package patterns;

import java.util.Scanner;

public class Pattern32
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print("-");
			}
			for(int j=1;j<=r+1-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
/*

 	*****
	-****
	--***
	---**
	----*

*/