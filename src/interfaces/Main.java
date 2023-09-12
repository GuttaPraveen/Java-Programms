package interfaces;

public class Main 
{
	public static void main(String[] args)
	{
		A a=new A();
		a.m1();
	}
}
 class A
 {
	 static Car c=new BMW();
	 public static Car m1()
	 {
		//Car c=new BMW();
		c.run();
		return c;
	 }
 }
 class BMW implements Car
 {
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		System.out.println("BMW CAR");
		
	}
	 
 }
interface Car
{
	public static final int i=0;
	public abstract void run();
}


/*
functional interface

marker interface - Serializable ,Clonable 
*/
