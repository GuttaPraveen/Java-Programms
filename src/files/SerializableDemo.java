package files;
import java.io.*;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.IOException;
public class SerializableDemo
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Serialization Started");
		Dog d1=new Dog();
		String fname="C:\\Users\\91891\\OneDrive\\Desktop\\Serializable//abc.txt";
		FileOutputStream fos=new FileOutputStream(fname);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization Ended");
		System.out.println("DeSerialization Started");
		FileInputStream fis=new FileInputStream(fname);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		System.out.println("DeSerialization Ended");
		System.out.println(d2.i+" "+d2.j);
		
	}
}
class Dog implements Serializable
{
	int i=10;
	int j=20;
	
}