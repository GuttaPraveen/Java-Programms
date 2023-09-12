package Sample;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int rem=n%10;
			sum=sum*10+rem;
			n/=10;
		}
		if(temp==sum)
			System.out.println("The given number "+temp+" is a Palindrome");
		else
			System.out.println("The given number "+temp+" is not a Palindrome");
	}

}
