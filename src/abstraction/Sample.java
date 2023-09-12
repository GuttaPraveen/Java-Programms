package abstraction;

public class Sample
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		B b=new B();
		b.m1();

	}

}
abstract class A
{
	public abstract  void m1();
}
class B extends A
{

	@Override
	public void m1() 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
	}
	
}
/*
	Abstraction : Hiding the Internal details and showing the functionality is called "Abstarction".
	Abstraction is achieved by Abstract classes and Interfaces.
	Abstract classes : If we are talking about implementation but not completely (partial 
					   implementation) then we should go for abstract class
    Abstract is the modifier applicable only for methods and classes but not for variables
*/