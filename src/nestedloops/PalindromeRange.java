package nestedloops;
import java.util.*;
public class PalindromeRange
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int temp1=0;
		for(int i=n;i<=m;i++)
		{
			temp1=i;
			int sum=0;
			while(temp1>0)
			{
				sum=sum*10+temp1%10;
				temp1=temp1/10;
			}
			if(sum==i)
				System.out.println(sum);
		}

	}

}
