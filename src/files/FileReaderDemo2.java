package files;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
public class FileReaderDemo2
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		File f=new File("Cricket.txt");
		FileReader fr=new FileReader(f);
		char ch[]=new char[(int)f.length()];
		fr.read(ch);
		for(char ch1:ch)
		{
			System.out.println(ch1);
		}
		
	}

}
