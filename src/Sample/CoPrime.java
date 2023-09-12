package Sample;
import java.util.*;
public class CoPrime {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int gcd=1;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
				gcd=i;
		}
		if(gcd==1)
		{
			System.out.println("Co-Prime");
		}
		else
			System.out.println("Not a Coprime");

	}

}
