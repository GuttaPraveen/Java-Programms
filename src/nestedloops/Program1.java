package nestedloops;
import java.util.*;
public class Program1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				count++;
				
		}
		if(count==0)
			System.out.println("Prime number");
		else
			System.out.println("Not a  Prime NUmber");

	}

}
