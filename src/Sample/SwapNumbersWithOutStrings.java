package Sample;
import java.util.*;
public class SwapNumbersWithOutStrings
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=(int)Math.log(n);
		int count=0;
		int res=0;
		while(count<k)
		{
			int coe=n/(int)Math.pow(10,k);//1
			if(count%2==0)
			{
				res=(int)Math.pow(10,k)*coe+res;
				count++;
				n=n-(int)Math.pow(10,k)*coe;
			}
			else
			{
		
				count++;
				n=n-(int)Math.pow(10,k)*coe;
			}
		}
		System.out.println(res);

	}

}
