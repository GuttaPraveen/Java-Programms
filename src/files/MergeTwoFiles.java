package files;
import java.io.*;
public class MergeTwoFiles
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("file3.txt"); 
		BufferedReader br=new BufferedReader(new FileReader("abc.txt")); 
		String line=br.readLine(); 
		while(line!=null) 
		{ 
			pw.println(line); 
			line=br.readLine(); 
		} 
		br=new BufferedReader(new FileReader("Cricket.txt")); //reuse 
		 line=br.readLine(); 
		 while(line!=null) 
		 { 
			 pw.println(line); 
			 line=br.readLine(); 
		} 
		 System.out.println(pw);
		pw.flush(); 
		br.close(); 
		pw.close(); 


	}

}
