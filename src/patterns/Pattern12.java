package patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int i,j;
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j==1 || i==r)
					System.out.print("*");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			if(i!=1)
				System.out.print("*");
			System.out.println();
		}

	}

}
