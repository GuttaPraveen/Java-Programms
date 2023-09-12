package string;

import java.util.Scanner;

public class Contains
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		if(s1.contains(s2))
			System.out.println(s2+"Contains in "+s1);
		else
			System.out.println(s2+"not Contains in "+s1);

	}

}
/*
 		s1 = geeksforgeeks
		s2 = for
		
 */
		