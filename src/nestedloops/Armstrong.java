package nestedloops;
import java.util.*;
public class Armstrong
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();
		Arm a=new Arm();
		for(int i=s;i<=e;i++)
		{
			int res=a.isArmstrong(i);
			if(res==i)
				System.out.print(i+" ");
		}

	}

}
class Arm
{
	public static int isArmstrong(int x)
	{
		int k=(int)Math.log10(x)+1;
		int sum=0;
		while(x>0)
		{
			int rem=x%10;
			sum=sum+(int)Math.pow(rem,k);
			x/=10;
		}
		return sum;
	}
}
