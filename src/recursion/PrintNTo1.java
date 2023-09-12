package recursion;
import java.util.*;
public class PrintNTo1
{
	public static void f(int i,int n)
	{
		if(i<1)
			return ;
		System.out.print(i+" ");
		f(i-1,n);
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n Value: ");
		int n=sc.nextInt();
		f(n,n);
		

	}

}
