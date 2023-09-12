package string;

import java.util.Scanner;

public class CharAt {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++)
			System.out.print(s.charAt(i)+" ");// Returns the Character at Specified Index
		*/
		A a=new A();
		String s[]=a.callSquare();
		for(String k:s)
			System.out.println(k);
	}

}
class A
{
	String[] s=new String[] {"10","20","30","40"};
	public String[] callSquare()
	{
		for(int i=0;i<s.length;i++)
			s[i]=s[i]+s[i];
		return s;
	}
}