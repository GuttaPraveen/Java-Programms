package assesment;

import java.util.Scanner;
import java.util.*;
public class ATGCTA_TACGAT
{
	public static char getComplement(char c)
	{
		switch(c)
		{
			case 'A':
				return 'T';
			case 'T':
				return 'A';
			case 'G':
				return 'C';
			case 'C':
				return 'G';
			default:
				return c;
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuilder sb=new StringBuilder(s);
		String s1=sb.reverse().toString();
		StringBuilder res=new StringBuilder();
		for(char c:s1.toCharArray())
		{
			char ch=getComplement(c);
			res.append(ch);
		}
		System.out.println(res);

	}

}
