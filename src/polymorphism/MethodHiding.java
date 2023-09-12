package polymorphism;

//public class MethodHiding
//{
//
//	public static void main(String[] args)
//	{
//		// TODO Auto-generated method stub
//		
//		P p=new C();
//		p.m1();
//
//	}
//
//}
class C 
{
	public static void main(String args[]) {
		System.out.println(1);
	}
//	public static void m1()
//	{
//		System.out.println("m1-P");
//	}
}
class MethodHidin 
{
	public static void main(String args[]) {
	System.out.println(2);	
	}
//	public static void m1()
//	{
//		System.out.println("m1-C");
//	}
}
/*
In method Overriding, either superclass method or subclass method must not be declared as static,
if we declare either superclass method or subclass method as static then the compiler will raise an error,
if we declare both superclass method and subclass method as static then the compiler will not raise any error,
but where JVM will not perform method overriding, instead JVM will perform “Method Hiding”. IN Method Hiding ,
if we access superclass methods then JVM will hide subclass method and 
JVM will execute only superclass method and we are able to get output from superclass methods.
*/