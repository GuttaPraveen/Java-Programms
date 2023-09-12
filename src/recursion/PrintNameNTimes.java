package recursion;
import java.util.Scanner;
public class PrintNameNTimes
{
	public static void f(int i,int n)
	{
		if(i>n)
		{
			return ;
		}
		System.out.print("Praveen"+" ");
		f(i+1,n);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n Value: ");
		int n=sc.nextInt();
		f(1,n);
		

	}

}
