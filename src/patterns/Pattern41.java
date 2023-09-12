package patterns;

import java.util.Scanner;

public class Pattern41 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				 if((i+j)%2!=0)
					System.out.print(0);
				 else
						System.out.print(1);
					
			}
			System.out.println();
		}

	}

}
/*
 	 1
     0 1
     1 0 1
     0 1 0 1
     1 0 1 0 1
   
*/