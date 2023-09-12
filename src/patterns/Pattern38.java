package patterns;
import java.util.*;
public class Pattern38
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int k=1;k<r+1-i;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==j ||j==1) 
					System.out.print("*"+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=r;i>=1;i--)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print("  ");
			}
			for(int j=r;j>=i;j--)
			{
				if(j==1) 
					System.out.print("* "+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
