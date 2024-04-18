package streamapi;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LambdaDemo
{
	public void display()
	{
		System.out.println("Implementing Lambda Expression");
		IntfA i=()->System.out.println("Hello");
		i.meth1();
//		Intf y=(int k,int l)->System.out.println("Adition:"+(k+l));
//		y.meth2(10,20);

	}
	public static void main(String[] args)
	{
		//TODO Auto-generated method stub
		LambdaDemo l=new LambdaDemo();
		l.display();

	}


}
@FunctionalInterface
interface IntfA
{
	void meth1();
	//int meth2(int p,int q);
	//int meth3(int m,int n);
	//void meth4(int m);
	//void draw();
	//int m3(int m,int n);
}