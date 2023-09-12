package inheritance;

public class Multilevel {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Child21 c=new Child21();
		Child12 c1=new Child12();
		c.m1();
		c1.m2();
		c.m3();

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
	public void m2()
	{
		System.out.println("Child1");
	}
}
class Child21 extends Parent12
{
	public void m3()
	{
		System.out.println("Child2");
	}
}