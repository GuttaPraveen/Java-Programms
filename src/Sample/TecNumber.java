package Sample;

import java.util.Scanner;

public class TecNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=(int)Math.log10(n)+1;
		int leftNumber=0,rightNumber=0,temp=n;
		if(k%2==0)
		{
			leftNumber=n%(int)Math.pow(10,k/2);//
			rightNumber=n/(int)Math.pow(10,k/2);
			int sum=leftNumber+rightNumber;
			int ans=sum*sum;
			System.out.println(leftNumber+" "+rightNumber+" "+sum+" "+ans);
			if(ans==temp)
				System.out.println("Technology Number");
			else
				System.out.println("Not a Technology number");
		}
		else
			System.out.println("Not a Technology number");

	}

}
