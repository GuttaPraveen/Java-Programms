package string;

import java.util.Arrays;

public class RemoveSpecialCharactersInString
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s="milk and @#$%&!bread";
		String s1=s.replaceAll("[a-zA-Z0-9]","");//@#$%&!
		String s2=s.replaceAll("[^a-zA-Z0-9]","");//milkandbread
		System.out.println(s1);
		System.out.println(s2);
		String s3=s.replaceAll("[^\\w]","");//milkandbread
		String s4=s.replaceAll("[\\w]","");//@#$%&!
		System.out.println(s3);
		System.out.println(s4);
		String a="milk__and__@#$%&!bread";
		String b=a.replaceAll("[^\\w]|_","");//To remove underscores also
		System.out.println(b);//milkandbread
		
		
				

	}

}
