package Sample;

import java.util.Scanner;

public class SmallNumber 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
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
			n=n/10;
		}
		System.out.println(small);

	}

}
