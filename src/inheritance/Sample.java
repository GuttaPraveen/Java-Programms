package inheritance;

public class Sample 
{

	public static void main(String[] args)
	{
		C c=new C();
		c.display1();
		c.display2();

	}

}
class P1
{
	int id;
	String name;
	P1()
	{
		id=1240;
		name="Praveen";
	}
	public void display1()
	{
		System.out.println(this.name+" "+id);
	}
}
class C extends P1
{
	int id;
	String name;
	C()
	{
		id=1318;
		name="Maha";
	}
	public void display2()
	{
		System.out.println(this.name+" "+super.name);
	}
}