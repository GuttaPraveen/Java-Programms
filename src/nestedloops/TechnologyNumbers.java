package nestedloops;

import java.util.Scanner;

public class TechnologyNumbers {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=n;i<=m;i++)
		{
			int k=(int)Math.log10(i)+1;
			int leftNumber=0,rightNumber=0,temp=i,ans=0,sum=0;
			if(k%2==0)
			{
				rightNumber=temp%(int)Math.pow(10,k/2);//
				leftNumber=temp/(int)Math.pow(10,k/2);
				sum=leftNumber+rightNumber;
				ans=sum*sum;
				if(ans==i)
					System.out.println("Technology Number: "+i);
		
			}
		}
	}

}
