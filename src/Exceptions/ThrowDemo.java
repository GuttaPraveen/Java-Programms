package Exceptions;

public class ThrowDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*System.out.println(10/0);
		  In this case creation of ArithmeticException object and handover to the jvm will be 
		  performed automatically by the main() method. */
		throw new ArithmeticException("/ by zero");
		//In this case we are creating exception object explicitly and handover to the JVM manually.

	}

}
/*
	Sometimes we can create Exception object explicitly and we can hand over
	to the JVM manually by using throw keyword.
	
	                throw     new ArithmeticException("/ by zero");
	                
	After throw statement we can't take any statement directly otherwise we will get compile time error saying unreachable statement.
	
	We can use throw keyword only for Throwable types otherwise we will get compile time error saying incomputable types. 
	                
	Note: In general we can use throw keyword for customized exceptions but not for predefined exceptions

*/