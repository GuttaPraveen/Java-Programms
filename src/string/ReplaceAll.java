package string;

import java.util.Scanner;

public class ReplaceAll
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="I Love You";
		String s1=s.replaceAll("o","e");
		System.out.println(s1);
		String s2=s.replaceAll("You","Me");
		System.out.println(s2);
		String s3=s.replace('o','a');//replacing all the old char or CharSequence to new char or CharSequence
		System.out.println(s3);
		
		
		
		
		 String str1 = "aabbaaac";
		 String str2 = "Learn223Java55@";
		 // regex for sequence of digits
		 String regex = "\\d+";
		 // all occurrences of "aa" is replaceAll with "zz"
		 System.out.println(str1.replaceAll("aa", "zz"));  // zzbbzzac
		 // replace a digit or sequence of digits with a whitespace
		 System.out.println(str2.replaceAll(regex, " "));  // Learn Java @

	}

}
