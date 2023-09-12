package patterns;

import java.util.Scanner;

public class Pattern2
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		//Forward
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
