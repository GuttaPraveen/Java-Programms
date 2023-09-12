package string;

import java.util.Scanner;

public class A11B12C13 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ch='0';
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				ch=s.charAt(i);
			}
			else
			{
				int num=Character.getNumericValue(s.charAt(i));
				if(i!=s.length()-1&& s.charAt(i+1)>='0'&&s.charAt(i+1)<='9')
				{
					i++;

					num=num*10+Character.getNumericValue(s.charAt(i));
					for(int j=0;j<num;j++)
					{
						System.out.print(ch);
					}
					System.out.println();
				}
				else
				{
					for(int j=0;j<num;j++)
					{
						System.out.print(ch);
					}
					System.out.println();
				}
			}
		}

	}

}
