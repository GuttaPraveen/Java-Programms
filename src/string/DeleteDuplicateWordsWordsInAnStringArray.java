package string;

import java.util.Scanner;

public class DeleteDuplicateWordsWordsInAnStringArray
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		int i,j;
		String ans="";
		for(i=0;i<s1.length;i++)
		{
			for(j=0;j<i;j++)
			{
				if(s1[i].equals(s1[j]))
					break;
			}
			if(i==j)
				ans+=s1[i]+" ";
		}
		System.out.println(ans);
		

	}

}
/*
	input = "Welcome to Java Session Java Session Session Java";
	output = "Welcome to Java Session"
*/