package Sample;
import java.util.*;
public class SecondLargest
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(largest<a[i])
			{
				secondLargest=largest;
				largest=a[i];
			}
			if(a[i]>secondLargest && a[i]<largest)
			{
				secondLargest=a[i];
			}
		}
		System.out.println(secondLargest);
		

	}

}
