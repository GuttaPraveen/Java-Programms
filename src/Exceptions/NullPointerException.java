package Exceptions;

public class NullPointerException
{

	public static void main(String[] args)
	{
		//TODO Auto-generated method stub
//		String s=null;
//		System.out.println(s.length());
//		Date date = null;
//	    System.out.println(date.toString());
//		String s=null;
//		System.out.println(s);
//		System.out.println(s.toString());

		User u=new User();
		u=null;
		u.method1();

	}

}
class User
{
	public void method1()
	{
		System.out.println("Hello");
	}
}
/*
		It is the child class of RuntimeException and hence it is unchecked. 
		Raised automatically by the JVM, whenever we are trying to call any method on null.
		
		In Java applications, when we access any instance variable or instance method over a
		 reference variable that has null value  then JVM will raise an 
		 exception like java.lang.NullPointerException.
		 
		 
*/