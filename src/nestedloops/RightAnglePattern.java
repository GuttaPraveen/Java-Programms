package nestedloops;
import java.util.*;
public class RightAnglePattern
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Rect m=new Rect();
		for(int i=1;i<=n;i++)
		{
			m.m1(i);
			
		}
		
		

		

	}

}
class Rect
{
	public void m1(int i)
	{
		
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		
	}
}
