package polymorphism;
import java.util.*;
public class MethodOverloading
{
	public void add(int a,int b)
	{
		System.out.println("Addition: "+(a+b));
	}
	public void add(int  a,float b)
	{
		System.out.println(a+b);
	}
	public void add(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		MethodOverloading m=new MethodOverloading();
		m.add(10,20);
		m.add(10,20f);
		m.add(10,20,30,40);
	}

}
/*
  If a class has multiple methods having same name and different arguments or 
				        arguments are different data typpes is called Method overloading. 
*/
