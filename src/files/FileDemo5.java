package files;

import java.io.File;

public class FileDemo5
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
			if(f1.isDirectory())
				count++;
		}
		System.out.println(count);

	}

}
/*
Write a program to display only directory names
*/