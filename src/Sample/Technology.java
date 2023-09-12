package Sample;

import java.util.Scanner;

public class Technology {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=(int)Math.log10(n)+1;
		int first=0,last=0,res1=0,res2=0,temp=n;
		if(k%2==0)
		{
			int mid=k/2,count=1;
			while(n>0)
			{
				if(count<=2)
				{
					first=first*10+n%10;
					n/=10;
					count++;
				}
				else
				{
					last=last*10+n%10;
					n/=10;
				}
			}
			System.out.println(first+" "+last);
			while(first>0 && last>0)
			{
				res1=res1*10+first%10;
				res2=res2*10+last%10;
				first/=10;
				last/=10;
			}
			System.out.println(res1+" "+res2);
			int sum=res1+res2;
			int ans=sum*sum;
			if(ans==temp)
				System.out.println("Technology Number: "+ans);
			else
				System.out.println("NOn Technology Number: "+ans);
		}

	}

}
