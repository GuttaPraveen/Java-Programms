package inheritance;

public class SingleInheritance
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Child c=new Child();
		c.display();

	}

}
class Parent
{
	String name;
	Parent()
	{
		name="Parent";
	}
	public void display()
	{
		System.out.println("Parent class: "+name);
	}
}
class Child extends Parent
{
	String name;
	Child()
	{
		name="Child";
	}
	public void display()
	{
		System.out.println("Child class: "+name);
	}
}
/*
  	Child class : Child
*/
