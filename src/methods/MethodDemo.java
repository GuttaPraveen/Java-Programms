package methods;

public class MethodDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(Math.sqrt(25));
		System.out.println("Hello".length());
		
		//new MethodDemo().methodCall();
		System.out.println("hi");
		System.out.println("Method call end");
	}
	public  void methodCall()
	{
		System.out.println("Method-Call Demo");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+" "+"Happy Sri Ram Navami");
		}
	}
}
