package Exceptions;

public class InSufficientFundsExc 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int total=1000,req=20000;
		if(total>= req)
			total=total-req;
		else
			throw new ArithmeticException("Insufficient Balance"); 

	}

}
