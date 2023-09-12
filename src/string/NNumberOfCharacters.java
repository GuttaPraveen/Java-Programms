package string;

import java.util.Scanner;

public class NNumberOfCharacters
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ans="";
		/* 1
		 for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int k=Character.getNumericValue(s.charAt(i));
				for(int j=0;j<k;j++)
				{
					ans+=s.charAt(i-1);
				}
			}
		}
		System.out.println(ans);
		*/
		int count=0,k=0;
		for(int i=0;i<s.length();i=k)
		{
			count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			k=k+count;
			System.out.print(s.charAt(i)+""+count);
			
		}
		

	}

}
/*
 	1.	input  : s   =  a5b4c3d2e1
 		output : res =  aaaaabbbbcccdde
 		
 		
 	2.	input  : s   =  aaaaabbbbcccdde
		output : res =  a5b4c3d2e1
 */




































































































