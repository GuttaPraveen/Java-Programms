package string;
import java.util.*;
public class Anagram 
{
	public static void main(String[] args)
	{
	    // TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.next();
	    String s2=sc.next();
	    if(s1.length()==s2.length())
	    {
	      s1=s1.toLowerCase();
	      s2=s2.toLowerCase();
	      char ch1[]=s1.toCharArray();
	      char ch2[]=s2.toCharArray();
	      Arrays.sort(ch1);
	      Arrays.sort(ch2);
	      boolean b=Arrays.equals(ch1,ch2);
	      if(b)
	        System.out.println("Anagram");
	      else
	        System.out.println("Not an Anagram");
	    }
	    else
	    {
	      System.out.println("Not an Anagram");
	    }
	}

}
/*
	Input: str1 = “listen”  str2 = “silent”
	Output: “Anagram”
	Explanation: All characters of “listen” and “silent” are the same.
*/
