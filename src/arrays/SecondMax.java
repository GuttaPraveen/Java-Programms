package arrays;
import java.util.*;
public class SecondMax
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
		}
		int first_largest=a[0],second_largest=a[0];
		for(int i=1;i<n;i++)
		{
			
			if(first_largest<a[i])
			{
				second_largest=first_largest;
				first_largest=a[i];
			}
			else if(second_largest==first_largest || second_largest<a[i] && first_largest > a[i] )
			{
				second_largest=a[i];
			}
			/*if(second_largest==first_largest)
			{
				second_largest=a[i];
				
			}*/
				
		}
		System.out.println("First largest: "+first_largest+" Second Largest: "+second_largest);


	}


}
