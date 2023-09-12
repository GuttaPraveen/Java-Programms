package Sample;
import java.util.*;
public class Armstrong {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=(int)Math.log10(n)+1;
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int rem=n%10;
			sum+=Math.pow(rem,k);
			n=n/10;
		}
		if(sum==temp)
			System.out.println("The given number "+temp+" is a armstrong");
		else
			System.out.println("The given number "+temp+" is not a armstrong");

	}

}
