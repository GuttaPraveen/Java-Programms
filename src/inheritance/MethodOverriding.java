package inheritance;

public class MethodOverriding
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		P3 p=new C4();
		p.m1();

	}

}
class P3
{
	public  void m1()
	{
		System.out.println("m1-P");
	}
	public void m2()
	{
		System.out.println("m2");
	}
}
class C4 extends P3
{
	public  void m1()
	{
		System.out.println("m1-C");
	}
}