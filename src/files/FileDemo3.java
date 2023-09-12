package files;
import java.io.*;
public class FileDemo3 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int count=0;
		File f=new File("c:\\\\praveen_classes");
		String s[]=f.list();
		for(String s1:s)
		{
			count++;
			System.out.println(s1);
		}
		System.out.println(count);

	}

}
/*
Write a program to display the names of all files and directories present in c:\\praveen_classes. 
*/