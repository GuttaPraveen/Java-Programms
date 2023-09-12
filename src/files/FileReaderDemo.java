package files;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("Cricket.txt");
		int i=fr.read();
		while(i!=-1)
		{
			System.out.println((char)i);
			i=fr.read();
		}
		
		

	}

}
/*
	By using FileReader object we can read character data from the file.
	
		FileReader fr=new FileReader(String name); 
		FileReader fr=new FileReader (File f);
		
		
		1. int read();
			It attempts to read next character from the file and return its Unicode value. If 
			the next character is not available then we will get -1. 
		2. int i=fr.read();
		3. System.out.println((char)i);
			As this method returns unicode value , while printing we have to perform type casting. 
		4. int read(char[] ch); 
				It attempts to read enough characters from the file into char[] array and returns 
				the no of characters copied from the file into char[] array. 
		5. File f=new File("abc.txt");
		6. Char[] ch=new Char[(int)f.length()];
		7. void close()
*/