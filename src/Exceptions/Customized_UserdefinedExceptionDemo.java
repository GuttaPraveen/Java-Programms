package Exceptions;

import java.util.Scanner;

public class Customized_UserdefinedExceptionDemo
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age>60)
		{
			throw new TooYoungException("please wait some more time.... u will get best match");
		}
		else if(age<18)
		{
			throw new TooOldException("u r age already crossed....no chance of getting married");
		}
		else
		{
			System.out.println("you will get match details soon by e-mail");
		}
	}

}
class TooYoungException extends RuntimeException 
{
	TooYoungException(String msg)
	{
		super(msg);
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String s)
	{
		super(s);
	}
}
/*
 		Sometimes we can create our own exception to meet our programming requirements. 

		Such type of exceptions are called customized exceptions (user defined exceptions)
		
*/