package string;

import java.util.Scanner;

public class Palindrome
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i=0,j=s.length()-1;
		boolean b=false;
		while(i<j)
		{
			
			if(s.charAt(i)==s.charAt(j))
			{
				b=true;
			}
			else
			{
				b=false;
				break;
			}
			i++;
			j--;
		}
		if(b)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		
		

	}

}
