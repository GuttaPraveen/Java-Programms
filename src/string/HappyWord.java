package string;

import java.util.Arrays;

public class HappyWord
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s="the quick brown fox jumps over a lazy dog";
		
		char ch[]=s.toLowerCase().toCharArray();
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
		ans=ans.trim();
		String s1="abcdefghijklmnopqrstuvwxyz";
		System.out.println(ans);
		if(ans.equals(s1))
			System.out.println("Happy word");
		else
			System.out.println("Not Happy word");
		
	}

}
