package files;
import java.io.*;
public class fileDemo
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		File f=new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());

	}

}
/*
	File f=new File("abc.txt");
	
This line 1st checks whether abc.txt file is already available (or) not if it is already 
available then "f" simply refers that file.
If it is not already available then it won't create any physical file just creates a java File 
object represents name of the file.

=>A java File object can represent a directory also.
				f.mkdir();
*/