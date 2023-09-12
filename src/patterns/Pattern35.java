package patterns;

import java.util.Scanner;

public class Pattern35
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int k=1;k<r+1-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=r;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=r+1-i;j++)
			{
				System.out.print("* ");
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
 	   * * * * * *
 	  * * * * * * *
 	 * * * * * * * *
 	* * * * * * * * *
    * * * * * * * * * *
 	 * * * * * * * * *
 	  * * * * * * * *
 	   * * * * * * *
 	    * * * * * *
 	      * * * * *
 	       * * * *
 	         * * *
 	          * *
 	           *
*/