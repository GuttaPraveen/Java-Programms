package patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int count=2;
		int i,j;
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j==1)
					System.out.print("*");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print("$");
			}
			if(count==i)
			{
				System.out.print("*");
				count++;
			}
			System.out.println();
		}

	}

}
/*
 			*
 			*$*
 			*$$*
 			*$$$*
 			*$$$$*
*/

