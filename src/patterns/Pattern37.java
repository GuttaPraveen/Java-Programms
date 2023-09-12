package patterns;

import java.util.Scanner;

public class Pattern37
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1 || j==i)
					System.out.print("*");
				else
					System.out.print("");
			}
			System.out.println();
		}

	}

}
