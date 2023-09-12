package recursion;
import java.util.*;
public class StringRev
{
	public static String strRev(String s)
	{
		if(s.length()==0|| s.length()<=1)
			return s;
		else
			return s.charAt(s.length()-1)+strRev(s.substring(0,s.length()-1));
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(strRev(s));
		

	}

}
/*
return s.charAt(s.length()-1)+strReverse(s.substring(0,s.length()-1));   
*/