package nestedloops;
import java.util.*;
public class PalindromeAndPrime {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		for(int i=n;i<=m;i++)
		{
			int temp=i,sum=0,c=0;
			while(temp>0)
			{
				sum=sum*10+temp%10;
				temp/=10;
			}
			if(sum==i && count<k)
			{
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
					System.out.println(i);
					count++;
				}
			}
		}

	}

}
