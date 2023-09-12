package Exceptions;

public class NoClassdefFoundErr
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			//Student s=new Student();
		}
		catch(NoClassDefFoundError e)
		{
			System.out.println(e.getMessage());
		}
		//Student cannot be resolved to a type

		//at Exceptions.NoClassdefFoundErr.main(NoClassdefFoundErr.java:9)


	}

}
/*
It is the child class of Error and hence it is unchecked.
JVM will raise this error automatically whenever it is unable to find required .class file.
Example: java Test If Test.class is not available.
Then we will get NoClassDefFound error.
*/