package string;

import java.util.Scanner;

public class VowelsAndConsonantCopy
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.next();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='A' || s.charAt(i)=='E'|| s.charAt(i)=='I'|| s.charAt(i)=='O'|| s.charAt(i)=='U'||s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u')
			{
				s1+=s.charAt(i);
			}
		}
		for(int i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)=='A' || s.charAt(i)=='E'|| s.charAt(i)=='I'|| s.charAt(i)=='O'|| s.charAt(i)=='U'||s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'))
			{
				s1+=s.charAt(i);
			}
		}
		System.out.println(s1);

	}

}
