package abstraction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileData 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			FileReader fr=new FileReader("C:\\Users\\91891\\OneDrive\\Desktop/EmpDetails.txt");
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw=new FileWriter("C:\\Users\\91891\\OneDrive\\Desktop/res.txt"); 
			PrintWriter out=new PrintWriter(fw); 
			String line=br.readLine();
			while(line!=null)
			{
				out.write(line);
			}
			br.close();
			out.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
