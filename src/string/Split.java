package string;

import java.util.Arrays;
import java.util.Scanner;

public class Split {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();// Good Morning to All
		String s1[]=s.split(" ");// Split a String into an Array Of SubStrings
		System.out.println(Arrays.toString(s1));//[Good, Morning, to, All]


	}

}
