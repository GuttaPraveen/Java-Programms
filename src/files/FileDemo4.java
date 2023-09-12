package files;
import java.io.*;
public class FileDemo4 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int count=0;
		File f=new File("c://Praveen_classes");
		String s[]=f.list();
		for(String s1:s)
		{
			File f1=new File(f,s1);
			if(f1.isFile())
				count++;
			System.out.println(s1);
		}
		System.out.println("Total number of files is:"+count);
		

	}

}
/*
	Write a program to display only file names
*/