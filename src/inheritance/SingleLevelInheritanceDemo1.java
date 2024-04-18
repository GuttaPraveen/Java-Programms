package inheritance;

public class SingleLevelInheritanceDemo1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Parent class exection");
		AnimalDemo a = new AnimalDemo();
		a.eat();
		a.sound();
		a.sleep();
		
		System.out.println("Child class execution");
		CatDemo c=new CatDemo();
		c.sleep();
		c.display();
		c.eat();
		c.sound();
		
				

	}

}
class AnimalDemo
{
	String name;
	String color;
	public AnimalDemo()//DC
	{
		
	}
	public AnimalDemo(String name, String color)//PC
	{
		super();
		this.name = name;
		this.color = color;
	}
	public void eat()
	{
		System.out.println("Eating");
	}
	public void sound()
	{
		System.out.println("Sound");
	}
	public void sleep()
	{
		System.out.println("Sleeping");
	}
}
class CatDemo extends AnimalDemo
{
	String name;
	String color;
	public CatDemo()
	{
		super("Animal","Black");//super()
		this.name="Cat";
		this.color="White";
	}
	public void eat()
	{
		System.out.println("Curd rice");
	}
	public void sound()
	{
		System.out.println("meow-meow");
	}
	public void display()
	{
		System.out.println(name+" "+color);
		System.out.println(super.name+" "+super.color);
	}
}
