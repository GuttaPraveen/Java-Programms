package polymorphism;

public class ConstructorOverloading 
{
	ConstructorOverloading()
	{
		System.out.println("Default Constructor");
	}
	ConstructorOverloading(int i)
	{
		System.out.println("Parameterized Constructor");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ConstructorOverloading  c = new ConstructorOverloading (10);

	}

}
