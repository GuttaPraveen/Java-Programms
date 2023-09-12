package Exceptions;
import java.io.*;
public class Caller1
{
	public static void method1() throws FileNotFoundException
	{
		method2();
	}
	public static void method2() throws FileNotFoundException
	{
		//throw new FileNotFoundException("File Is Avaliable");
		File f=new File("C:\\Users\\91891\\OneDrive\\Desktop\\CodingHub//sampleFile5.txt");
		if(f.exists())
		{
			System.out.println("File Found");
		}
	}

	public static void main(String[] args) throws FileNotFoundException
	{
		// TODO Auto-generated method stub
		method1();

	}

}
/*
 			Output:
				Compile and running successfully.
				
				
In the above program if we are removing at least one throws keyword 
then the program won't compile.
*/
