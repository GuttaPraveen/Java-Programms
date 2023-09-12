package constructor;

public class ParameterizedConstructor1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student s1=new Student(1240,"Praveen");
		Student s2=new Student(1318,"Maha");
		s1.display();
		s2.display();

	}

}
class Student
{
	int sid;
	String sname;
	Student(int id,String name)
	{
		sid=id;
		sname=name;
	}
	void display()
	
	{
		System.out.println(sid+" "+sname);
	}
}
