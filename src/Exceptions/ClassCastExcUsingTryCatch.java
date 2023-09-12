package Exceptions;

public class ClassCastExcUsingTryCatch
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			Child11 c=(Child11)new Parent11();
			c.m1();
		}
		catch(ClassCastException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}

	}

}
class Parent11
{
	public void m1()
	{
		System.out.println("Hello");
	}
}
class Child11 extends Parent11
{
	public void m1()
	{
		System.out.println("How");
	}
}