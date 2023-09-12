package string;
import java.util.*;
public class PalindromicWords
{
	public static boolean isPalindrome(String s)
	{
		boolean flag=false;
		int l=0,r=s.length()-1;
		while(l<r)
		{
			if(s.charAt(l)==s.charAt(r))
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
			l++;
			r--;
		}
		return flag;
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		System.out.println(Arrays.toString(s1));
		int count=0;
		String k="";
		for(int i=0;i<s1.length;i++)
		{
			boolean flag=isPalindrome(s1[i]);
			if(flag)
				count++;
		}
		System.out.println(count);
		

	}

}
/*
		input  :  s   = "madam arora malayalam teachers";
		output :  res = 3 [madam , arora , malayalam ]
*/
