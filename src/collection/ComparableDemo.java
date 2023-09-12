package collection;
import java.util.*;
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Student12 e1=(Student12)obj1;
		Student12 e2=(Student12)obj2;
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
		
	}

}
public class ComparableDemo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Student12> studentList =  new ArrayList<>();
	    Student12 student1 = new Student12(327, "Praveen");
	    Student12 student2 = new Student12(100, "Maha");
	    Student12 student3 = new Student12(467, "Developer");

	    studentList.add(student1);
	    studentList.add(student2);
	    studentList.add(student3);
	    System.out.println(studentList);
	    Collections.sort(studentList,new MyComparator());
	    System.out.println(studentList);
	    /*for(int i = 0; i < studentList.size(); i++)
	    {
	        System.out.println(studentList.get(i).getName());
	    }*/

	}

}
class Student12 implements Comparable
{

     int id;
     String name;

    public Student12(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
	@Override
	public String toString() {
		return "Student12 [id=" + id + ", name=" + name + "]";
	}

	@Override
    
	public int compareTo(Object o) 
	{
		// TODO Auto-generated method stub
		int eid1=this.id;
		int eid2=((Student12)o).id;
		if(eid1 < eid2)
		{
			return -1;
		}
		else if(eid1 > eid2)
		{
			return 1;
		}
		else return 0;

		
	}
    
    
}
