package Exceptions;

public class ClassCastExc
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			Child c=(Child)new Parent();
			c.m1();
		}
		catch(ClassCastException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}

	}

}
class Parent
{
	public void m1()
	{
		System.out.println("Hello");
	}
}
class Child extends Parent
{
	public void m1()
	{
		System.out.println("How");
	}
}