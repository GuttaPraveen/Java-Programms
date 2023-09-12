package Exceptions;

public class Customized_Userdefined2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		throw new DontWriteOnChairException("Please Dont write anything on Chairs");
		

	}

}
class DontWriteOnChairException extends RuntimeException
{
	DontWriteOnChairException(String msg)
	{
		super(msg);
	}
}
