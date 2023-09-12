package string;
import java.util.*;
public class NNumberOfSubStrings
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.next();
		char ch[]=s.toCharArray();
		System.out.print("[");
		/*
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				System.out.print("[");
				for(int k=i;k<=j;k++)
				{
					System.out.print(ch[k]);
				}
				System.out.print("]"+",");
			}
		}*/
		for(int i=0;i<s.length();i++)
		{
			
			for(int j=1;j<=s.length()-i;j++)
			{
				System.out.print("[");
				System.out.print(s.substring(i,i+j));
				System.out.print("]"+",");
			}
		}
			
		System.out.print("]");
		
		

	}

}
