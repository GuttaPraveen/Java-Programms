package string;

import java.util.Scanner;

public class IsEmpty
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.isEmpty())
			System.out.println("Empty String");
		else
			System.out.println(s);

	}

}
