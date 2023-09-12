package inheritance;

public class Main
{
	
	public static void main(String[] args)
	{
		Cat c=new Cat();
		c.m1();
		c.m2();
	}

}
class Animal
{
	public void m1()
	{
		System.out.println("Animal class");
	}
}
class Cat extends Animal
{
	
	public void m2()
	{
		System.out.println("Cat class");
	}
	
}
