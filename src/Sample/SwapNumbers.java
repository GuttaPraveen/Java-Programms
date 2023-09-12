package Sample;

import java.util.Scanner;

public class SwapNumbers
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=Integer.toString(n);
		String res="";
		int count=0;
		while(n>0)
		{
			if(count%2==0)
			{
				res+=s.charAt(count+1);
				count++;
			}
			else
			{
				res+=s.charAt(count-1);
				count++;
			}
			n=n/10;
		}
		System.out.println(res);
	}

}
