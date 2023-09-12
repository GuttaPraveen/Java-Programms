package loops;

import java.util.Scanner;

public class While_21 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();//230
		int b=sc.nextInt();//5
		int c=sc.nextInt();//0
		int count=0;
		int k=0;
		while(count<=a && count <=b && count <=c)
		{
			
			k=count;
			count++;
		}
		System.out.println(k);

	}

}
