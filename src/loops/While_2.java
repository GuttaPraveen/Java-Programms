package loops;

import java.util.Scanner;

public class While_2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		while(a<b)
		{
			if(a<c)
			{
				System.out.println(a);
				break;
			}
			else
			{
				System.out.println(c);
				break;
			}
		}
		while(a>b)
		{
			if(a>c && c>b)
			{
				System.out.println(b);
				break;
			}
			else
			{
				System.out.println(c);
				break;
			}
		}

	}

}
