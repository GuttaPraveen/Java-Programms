package assesment;

import java.util.Scanner;

public class StringRev
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="";
		int i=0,j=s.length()-1;
		while(i>=j)
		{
			s1+=s.charAt(j);
			j--;
		}
		System.out.println(s1);

	}

}
