package patterns;

import java.util.Scanner;

public class Pattern9
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=r;j++)
			{
				if(i==r || i==1 || j==1 || j==r || i==j || i+j==r+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
