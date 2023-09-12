package constructor;

public class ParameterizedConstructor3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student1 s=new Student1(1240,"Praveen");
		Student1 s1=new Student1(1318,"Maha");
		s.display();
		s1.display();
	}

}
class Student1
{
	int sid;
	String sname;
	Student1(int sid,String sname)
	{
		sid=sid;
		sname=sname;
	}
	void display()
	{
		System.out.println(sid+" "+sname);
	}
}
/*
  		0 null
		0 null
*/
