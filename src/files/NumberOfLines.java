package files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.LineNumberReader;
import java.io.BufferedReader;
public class NumberOfLines
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome to Files:");
		File file=new File("C:\\Users\\91891\\OneDrive\\Desktop\\CodingHub//sampleFile.txt");
		try 
		{
			if(file.exists())
			{
				
				BufferedReader br=new BufferedReader(new FileReader(file));
				//LineNumberReader lr=new LineNumberReader(fr);
				int lineCount=0;
				try
				{
					while(br.readLine()!=null)
					{
						lineCount++;
						System.out.println(br.readLine());
					}
					System.out.println(lineCount);
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
