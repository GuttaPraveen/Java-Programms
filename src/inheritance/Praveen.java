package inheritance;

public class Praveen
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Sahithi s=new Sahithi("Coding hub");
		
		s.m2();
		s.m1();
		

	}

}
class Saisri
{
	String name="Nalgonda";
	Saisri(String name)
	{
		System.out.println(name);
	}
	public void m1()
	{
		System.out.println("Saisri");
	}
}
class Sahithi extends Saisri
{
	Sahithi(String name)
	{
		super("Warngal");
		super.m1();
		System.out.println(name);
	}
	public void m2()
	{
		System.out.println(super.name);
		System.out.println("Sahithi");
	}
}