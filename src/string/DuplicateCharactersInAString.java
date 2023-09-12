package string;

import java.util.Scanner;

public class DuplicateCharactersInAString
{

	public static void main(String[] args)
	{
		//TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					
					count++;
					ch[j]='0';
				}
			}
			if(count>=1 && ch[i]!='0')
				System.out.println(ch[i]);
		}

	}

}
/*
 	input = "Great responsibility";
 	output = r  e  t  s  i
 	
*/
