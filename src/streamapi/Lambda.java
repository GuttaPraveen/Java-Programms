package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lambda
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b values: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Intf i=()->{
			System.out.println("Hello");
		};
		i.draw();
		

	}

}
interface Intf
{
	public void draw();
}