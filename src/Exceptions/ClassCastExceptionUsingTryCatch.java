package Exceptions;

public class ClassCastExceptionUsingTryCatch
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			Child12 c=(Child12)new Parent12();
			c.m1();
		}
		catch(ClassCastException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}

	}

}
class Parent12
{
	public void m1()
	{
		System.out.println("Hello");
	}
}
class Child12 extends Parent12
{
	public void m1()
	{
		System.out.println("How");
	}
}