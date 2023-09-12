package nestedloops;
import java.util.*;
public class PrimeAndFib
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//20
		int m=sc.nextInt();//30
		int a=0,b=1,res=0;
		for(int i=n;i<=m;i++)//20 21
		{
			int c=0;//
			for(int j=2;j<=i/2;j++)//2
			{
				if(i%j==0)//20%2==0
				{
					c++;//1
					break;
				}
			}
			if(c==0)
			{
				System.out.println(i);//21
				for(int k=n;k<=m-2;k++)//20
				{
					res=a+b;//1
					System.out.println(a);//0
					a=b;//1
					b=res;//1
					break;
				}
			}
		}
	}

}
