package string;

import java.util.Scanner;

public class ReverseOddIndexes
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		String res = new String();
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(i);
			String str=s1[i];
			String ans="";
			for(int j=str.length()-1;j>-1;j--)
			{
				ans+=str.charAt(j);
			}
			res+=ans+" ";
			
		}
		System.out.println(res);
		

	}

}
