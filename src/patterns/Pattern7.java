package patterns;
import java.util.*;
public class Pattern7 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			
			for(int space=1;space<=r-i;space++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<2*i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			
		}
		System.out.println();
		for(int i=1;i<=r;i++)
		{
			
			for(int space=1;space<=r-i;space++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			
		}

	}

}
/*
 		*
 	   ***
 	  *****
 	 *******
 	*********
 	

*/