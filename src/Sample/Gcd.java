package Sample;
import java.util.*;
public class Gcd
{
	public static int getGreatestCommonDivisor(int a,int b)
	{
		int k=a<b?a:b;
		int i=1,gcd=0;
		if(k>10)
		{
			while(i<=k)
			{
				if(a%i==0 && b%i==0)
				{
					gcd=i;
				}
				i++;
			}
			return gcd;
		}
		else
			return -1;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();//10
		int b=sc.nextInt();//20
		int i=1,gcd=0;
		System.out.println(getGreatestCommonDivisor(a,b));
	}

}
/*

              a=20                b=30
              1 2 4 5 10 20      1 2 3 5 6 10 15 30




*/