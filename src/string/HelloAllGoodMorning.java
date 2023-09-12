package string;

import java.util.Scanner;

public class HelloAllGoodMorning
{
	private static String removeDuplicate(String s)
	{
		int i,j;
		String ans="";
		for(i=0;i<s.length();i++)
		{
			for(j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
					break;
			}
			if(i==j)
				ans+=s.charAt(i);
		}
		
		return ans.substring(0,1).toUpperCase()+ans.substring(1);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		String res="";
		for(int i=0;i<s1.length;i++)
		{
			res+=removeDuplicate(s1[i])+" ";
		}
		System.out.println(res);

	}

	

}
