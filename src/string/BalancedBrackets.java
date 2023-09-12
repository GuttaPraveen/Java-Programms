package string;

import java.util.*;

public class BalancedBrackets
{
	public static boolean checkPair(char ch1,char ch2)
	{
		if(ch1=='[' && ch2==']' || ch1=='(' && ch2==')' || ch1=='{' && ch2=='}')
			return true;
		else
			return false;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Stack<Character> st=new Stack<>();
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='[' || s.charAt(i)=='('||s.charAt(i)=='{')
			{
				st.push(s.charAt(i));
			}
			else
			{
				if(st.isEmpty())
				{
					flag=false;
				}
				else if(checkPair(st.peek(),s.charAt(i)))
				{
					st.pop();
					continue;
				}
				else
				{
					flag=false;
				}
			}
				
		}
		System.out.println(st.isEmpty()?"Balanced":"Not Balanced");

	}

}
/*
		Input  : s = “[()]{}{[()()]()}” 
		Output : s1 = Balanced

		Input  : s = “[(])” 
		Output : Not Balanced
*/ 