package nestedloops;
import java.util.*;
public class Programm3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0;
		int prime_Count=0;
		for(int i=n;i<=m;i++)
		{
			int c=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					c++;
					break;
				}
			}
			if(c==0)
			{
				prime_Count++;
				sum+=i;
			}
			
		}
		System.out.println(prime_Count+" "+sum);
		

	}

}
