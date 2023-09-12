package recursion;
import java.util.*;
public class StringPalindrome
{
	public static boolean checkPalindrome(int i,String s)
	{
		int l=s.length();
		if(i>=l/2)
			return true;
		if(s.charAt(i)!=s.charAt(l-i-1))
			return false;
		return checkPalindrome(i+1,s);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.next();
		boolean flag=checkPalindrome(0,s);
		if(flag)
			System.out.println("Given String "+s+" is a Palindrome");
		else
			System.out.println("Given String "+s+" is not a Palindrome");

	}

}
