package files;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class BufferedWriterDemo
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("gec.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch={'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("Praveen");
		bw.newLine();
		bw.write("software solutions");
		System.out.println(bw);
		
		

	}

}
/*
				1. While writing data by FileWriter compulsory we should insert line separator(\n) 
						manually which is a bigger headache to the programmer.
				2. While reading data by FileReader we have to read character by character 
						instead of line by line which is not convenient to the programmer.
				3. To overcome these limitations we should go for BufferedWriter and 
						BufferedReader concepts
		
		By using BufferedWriter object we can write character data to the file. 
		
			BufferedWriter bw=new BufferedWriter(writer w);
			BufferedWriter bw=new BufferedWriter(writer w,int buffersize);
			
	Note: BufferedWriter never communicates directly with the file it should communicates via some writer object.
	
	
		1. BufferedWriter bw=new BufferedWriter("cricket.txt"); (invalid)
		2. BufferedWriter bw=new BufferedWriter (new File("cricket.txt")); (invalid)
		3. BufferedWriter bw=new BufferedWriter (new FileWriter("cricket.txt")); (valid)
		
		 Methods: 
			1. write(int ch);
			2. write(char[] ch);
			3. write(String s);
			4. flush();
			5. close();
			6. newline(); 
					Inserting a new 
		line character to the file.
		When compared with FileWriter which of the following capability(facility) is available as method in BufferedWriter. 
							1. Writing data to the file.
							2. Closing the writer.
							3. Flush the writer.
							4. Inserting newline character.
*/