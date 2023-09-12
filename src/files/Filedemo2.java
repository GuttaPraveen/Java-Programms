package files;
import java.io.File;
import java.io.IOException;
public class Filedemo2
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		File f1=new File("Praveen123");
		f1.mkdir();
		File f2=new File("Praveen123","abc.txt");
		f2.createNewFile();
		

	}

}