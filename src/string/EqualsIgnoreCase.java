package string;

import java.util.Scanner;

public class EqualsIgnoreCase
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Both Strings are equal");
		else
			System.out.println("Both Strings are not equal");

	}

}
/*
 	input : s1 = amma
			s2 = AMMA
	output:	Both Strings are equal
*/
