package nestedloops;
import java.util.*;
public class EvilNumbers 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=n;i<=m;i++)
		{
			int sq=i*i;
			int sum=0;
			while(sq>0)
			{
				sum+=sq%10;
				sq/=10;
			}
			if(sum==i)
				System.out.println("Evil Number : "+i);
		}
		

	}

}
