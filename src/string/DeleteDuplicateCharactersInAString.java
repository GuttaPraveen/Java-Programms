package string;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteDuplicateCharactersInAString
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ans="";
		int j,i;
		//WithOutSorting
		for(i=0;i<s.length();i++)
		{
			for(j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
					break;
					
			}
			if(i==j)
				ans+=s.charAt(i);
		}
		System.out.println(ans);

		//With Sorting
		/*
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		ans+=ch[0];
		for(i=1;i<ch.length;i++)
		{
			if(ch[i]!=ch[i-1])
				ans+=ch[i];
		}
		System.out.println(ans); */

	}

}


/*
		Input : "aaabbccd";
		Output : "abcd";
*/