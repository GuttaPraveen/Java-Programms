package collection;
import java.util.*;
public class UserDefinedStudent
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*Student s1=new Student("Praveen",1240,'M',10000);
		Student s2=new Student("Maha",1318,'F',12000);
		ArrayList<Student> al=new ArrayList<>();
		al.add(s1);
		al.add(s2);
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		List<Student> al=Arrays.asList(new Student("Praveen",1240,'M',10000),new Student("Maha",1318,'F',12000));
		System.out.println(al);
		
	}

}
class Student
{
	String name;
	long id;
	char gender;
	long salary;
	public Student(String name, long id, char gender, long salary)
	{
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.salary = salary;
	}
	@Override
	public String toString()
	{
		return "Student [name=" + name + ", id=" + id + ", gender=" + gender + ", salary=" + salary + "]";
	}
	
}