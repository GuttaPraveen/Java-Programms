package files;

import java.io.File;
import java.io.IOException;

public class fileDemo1
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		File f=new File("demo.txt");
		f.createNewFile();

	}

}
