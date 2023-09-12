package Exceptions;

public class StackOverFlowErr 
{
	public static void methodOne()
	{
		methodTwo();
	}
	public static void methodTwo()
	{
		methodOne();
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		methodOne();

	}

}
/*
		It is the child class of Error and hence it is unchecked. 
		Whenever we are trying to invoke recursive method call JVM will raise StackOverFloeError automatically.
*/