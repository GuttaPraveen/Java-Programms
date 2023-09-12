package files;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class BufferedReaderDemo
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("file3.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		br.close();

	}

}
/*
	This is the most enhanced(better) Reader to read character data from the file. 
	
	Constructors:
	
			BufferedReader br=new BufferedReader(Reader r);
			BufferedReader br=new BufferedReader(Reader r,int buffersize); 
	 Note: BufferedReader can not communicate directly with the File it should 
			communicate via some Reader object.
			
			The main advantage of BufferedReader over FileReader is we can read data line by line instead of character by character.
	
	Methods:
	
			1. int read();
			2. int read(char[] ch);
			3. String readLine(); 
				It attempts to read next line and return it , from the File. if the next line is not 
																	available then this method returns null.
			4. void close();
*/