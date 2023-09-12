package string;

import java.util.Arrays;
import java.util.Scanner;

public class HappyNumber
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n1=Integer.parseInt(s)*2;
		int n2=Integer.parseInt(s)*3;
		s=s+String.valueOf(n1)+String.valueOf(n2);
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		String ans="";
		int i,j;
		for(i=0;i<ch.length;i++)
		{
			for(j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					break;
				}
			}
			if(i==j)
				ans+=ch[i];
			
		}
		System.out.println(ans);
		String s1="123456789";
		if(s1.equals(ans))
			System.out.println("Happy Number");
		else
			System.out.println("Not a Happy Number");
		

	}

}
