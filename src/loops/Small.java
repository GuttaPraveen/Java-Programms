package loops;

import java.util.Scanner;

public class Small
{
	public static void main(String args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int small=n%10,rem=0;
		while(n>0)
		{
			rem=n%10;
			if(rem<small)
			{
				small=rem;
			}
		}
		System.out.println(small);
	}
}
