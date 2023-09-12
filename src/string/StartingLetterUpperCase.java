package string;

import java.util.Scanner;

public class StartingLetterUpperCase
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		String res="";
		String k="";
		for(int i=0;i<s1.length;i++)
		{
			 res=s1[i];
			k+=res.substring(0,1).toUpperCase()+res.substring(1,res.length()-1)+res.substring(res.length()-1).toUpperCase()+" ";
		}
		System.out.println(k);
		

	}

}
/*
 		input  :  s   = "madam arora malayalam teachers"
 		output :  res = "MadaM ArorA MalayalaM TeacherS"
 		
 */
