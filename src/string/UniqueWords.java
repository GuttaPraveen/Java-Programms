package string;

import java.util.Scanner;

public class UniqueWords
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		int i,j;
		int unw=0;
		for(i=0;i<s1.length;i++)
		{
			for(j=i+1;j<s1.length;j++)
			{
				if((s1[i].equals(s1[j])))
				{
					unw++;
					s1[i]="";
				}
			}
			
		}
		for(i=1;i<s1.length;i++)
		{
			if(s1[i]!="")
			{
				System.out.println(s1[i]);
			}
		}
		System.out.println(unw);
		

	}

}
/*
		  	input = "apple banana mango grape lichi mango apple grape";
		  	output = "banana apple lichi grape mango"
  */
