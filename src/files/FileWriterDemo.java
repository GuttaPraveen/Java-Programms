package files;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("Cricket.txt",true);
		//FileWriter fw=new FileWriter("cricket.txt");
		fw.write(65);
		fw.write("Coding Hub Privated Limited");
		fw.write("\n");
		char ch[]= new char[]{'p','m','d'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		fw.close();
		System.out.println(fw);
		
		
		

	}

}
/*
=> By using FileWriter object we can write character data to the file.

		FileWriter fw=new FileWriter(String name);
		FileWriter fw=new FileWriter(File f);
		
		The above 2 constructors meant for overriding.
		
		Instead of overriding if we want append operation then we should go for the following 2 constructors.
		
		FileWriter fw=new FileWriter(String name,boolean append);
		FileWriter fw=new FileWriter(File f,boolean append);
		
		If the specified physical file is not already available then these constructors will create 
		that file.
		
		1. write(int ch);
				To write a single character to the file.
		2. write(char[] ch);
				To write an array of characters to the file.
		3. write(String s);
				To write a String to the file.
		4. flush();
				To give the guarantee the total data include last character also written to the file.
		5. close();
				To close the stream.
				
				
				
				
				=> The main problem with FileWriter is we have to insert line separator manually , 
				   which is difficult to the programmer. ('\n')
 				   And even line separator varing from system to system.
*/