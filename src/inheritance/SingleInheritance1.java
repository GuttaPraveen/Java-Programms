package inheritance;

public class SingleInheritance1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Child1 c=new Child1();
		c.display1();
		c.display2();

	}

}
class Parent1
{
	String name;
	Parent1()
	{
		name="Parent";
	}
	public void display1()
	{
		System.out.println("Parent class: "+name);
	}
}
class Child1 extends Parent1
{
	String name;
	Child1()
	{
		name="Child";
	}
	public void display2()
	{
		System.out.println("Child class: "+name);
	}
}