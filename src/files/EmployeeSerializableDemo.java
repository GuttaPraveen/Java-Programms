package files;
import java.io.*;
public class EmployeeSerializableDemo 
{
	public static void main(String[] args) throws Exception
	{
		Employee emp1=new Employee();
		String filePath="C:\\Users\\91891\\OneDrive\\Desktop\\Serializable//emp.txt";
		FileOutputStream fos=new FileOutputStream(filePath);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		oos.close();
		fos.close();
		System.out.println("Object Saved In file");
		System.out.println("DeSerialization Started");
		FileInputStream fis=new FileInputStream(filePath);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp2=(Employee)ois.readObject();
		System.out.println(emp2.empId);
		System.out.println(emp2.empName);
		System.out.println(emp2.empSalary);
	}
	
	
}
class Employee implements Serializable
{
	long empId=1240;
	String empName="Praveen";
	int empSalary=45000;
	
}