package abstraction;

public class Overriding
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		A1 a = new B1();
		a.m1();

	}

}

class A1
{
	void m1()
	{
		System.out.println("m1-A1");
	}
}  
class B1 extends A1
{
	void m1()
	{
		System.out.println("m1-B1");
	}
}


/*

In the above Method overriding, even if we access the superclass method,
the superclass method body will not be executed, whereas the subclass method body is executed. 
In this case providing implementation for the superclass method is unnecessary,
 so here we must declare a superclass method without the body.

IN Java , if we want to declare a method without the body then we must declare that method as an abstract method.

In Java applications, if we want to declare a method as an abstract method then the respective class must be an abstract class.


*/