package patterns;

import java.util.Scanner;

public class Pattern39 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=i;j<=r;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=r;i++)
		{
			for(int j=i;j<=r;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
