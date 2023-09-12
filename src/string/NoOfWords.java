package string;

import java.util.Scanner;

public class NoOfWords
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=sc.nextLine();
		int words=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' ')
			{
				words++;
			}
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
				words--;
			/*if(s.charAt(i)==' ')
			 {
			 	if(s.charAt(i+1)==' ')
			 	{
			 		i++;
			 		continue;
			 	}
			 	words++;
			 }
			 */
				
		}
		System.out.println(words+1);

	}

}
