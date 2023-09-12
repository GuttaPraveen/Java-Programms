package inheritance;

public class multiple
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		B b = new B();

	}

}
class A
{
	A(int i){
		System.out.println("A-int-param-Con");
	}
	void m2()
	{
		System.out.println("-Con");
	}
}
class B extends A
{
	B()
	{
		super(10);
		System.out.println("B-Con");
	}
	void m1()
	{
		//super(10);
		System.out.println("m1-A");
	}


}
