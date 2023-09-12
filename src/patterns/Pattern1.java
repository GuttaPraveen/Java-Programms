package patterns;
import java.util.*;
public class Pattern1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		//Forward
		/*for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				System.out.print("$"+" ");
			}
			System.out.println();
		}
		*/
		//BackWard
		for(int i=r;i>0;i--)
		{
			for(int j=c;j>0;j--)
			{
				System.out.print("$"+" ");
			}
			System.out.println();
		}
	}

}
