package nestedloops;
import java.util.*;
public class ArmstrongAndPrime
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=n;i<=m;i++)
		{
			int k=(int)Math.log10(i)+1;
			int sum=0;
			int temp=i;
			while(temp>0)
			{
				sum+=Math.pow(temp%10,k);
				temp/=10;
			}
			if(sum==i)
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
					System.out.println(i);
			}
		}

	}

}
