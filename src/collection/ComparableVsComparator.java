package collection;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;
class SortIdComparator implements Comparator<StudentDetails>
{
	public int compare(StudentDetails o1,StudentDetails o2)
	{
		return Long.compare(o1.deptId,o2.deptId);
	}

	
}
class SortNameComparator implements Comparator<StudentDetails>
{
	public int compare(StudentDetails o1,StudentDetails o2)
	{
		return o1.name.compareTo(o2.name);
	}
}
public class ComparableVsComparator 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<StudentDetails> studentList=new ArrayList();
		StudentDetails student1=new StudentDetails(327,"Praveen");
		StudentDetails student2=new StudentDetails(100,"Maha");
		StudentDetails student3=new StudentDetails(167,"Java");
		StudentDetails student4=new StudentDetails(327,"Developer");
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		//Collections.sort(studentList);
		Collections.sort(studentList,new SortNameComparator());
		Collections.sort(studentList,new SortIdComparator());
		//System.out.println(studentList);
		for(int i=0;i<studentList.size();i++)
		{
			System.out.println(studentList.get(i));
		}
		
		
	}

}
class StudentDetails
{
	long deptId;
	String name;
	public StudentDetails(long deptId, String name)
	{
		super();
		this.deptId = deptId;
		this.name = name;
	}
	@Override
	public String toString() 
	{
		return "Student [deptId=" + deptId + ", name=" + name + "]";
	}
}