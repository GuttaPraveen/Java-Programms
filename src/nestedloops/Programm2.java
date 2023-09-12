package nestedloops;
import java.util.*;
public class Programm2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=n;i<=m;i++)
		{
			int c=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==0)
				System.out.println(i);

		}

	}

}
/*
class Test
{
	public static void main(String args[])
	{
		while(true)
		{
			System.out.println("hello");
		}
		System.out.println("hi");
	}
}
*/

