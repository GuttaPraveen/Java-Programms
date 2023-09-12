package patterns;

import java.util.Scanner;

public class Pattern36 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int count=2;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				for(int k=count;count<=1000;count++)
				{
					int c=0;
					for(int s=2;s<=count/2;s++)
					{
						if(count%s==0)
						{
							c++;
							break;
						}
					}
					if(c==0)
					{
						System.out.print(count++ +" ");
						break;
					}
				}
				//count++;
			}
			System.out.println();
		}

	}

}
/*
 
 
2
3 5
7 11 13
17 19 21 23

*/