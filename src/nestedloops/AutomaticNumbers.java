package nestedloops;

import java.util.Scanner;

public class AutomaticNumbers {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=n;i<=m;i++)
		{
			int sq=i*i;//87909376
			int k=(int)Math.log10(sq)+1;//8
			if(k%2==0)
			{
				int res=sq%(int)Math.pow(10,k/2);//87909376%100000
				if(i==res)
					System.out.println("Automatic NUmber: "+i);
			}
			else
			{
				int res=sq%(int)Math.pow(10,k/2+1);//625 
				if(i==res)
					System.out.println("Automatic NUmber: "+i);
			}
			
		}

	}

}
