package arrays;

import java.util.*;

public class RandomDemo1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Random r=new Random(10);
		for(int i=0;i<n;i++)
		{
			System.out.println(r.nextInt(1000));
		}
		
		

	}

}
