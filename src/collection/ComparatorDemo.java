package collection;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
class SortId implements Comparator<Employee>
{
	public int compare(Employee o1,Employee o2)
	{
		return Long.compare(o1.deptId,o2.deptId);
	}
}
public class ComparatorDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(333,"Praveen");
		Employee e2=new Employee(555,"Maha");
		Employee e3=new Employee(111,"Sahithi");
		Employee e4=new Employee(444,"Aiswarya");
		Employee e5=new Employee(222,"Saisri");
		List<Employee> al=new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		Collections.sort(al,new SortId());
		System.out.println(al.toString());
		//List list=Arrays.asList(new Employee(1,"Praveen"),new Employee(2,"Maha"),new Employee(3,"Sahithi"),new Employee(4,"Aiswarya"),new Employee(5,"Saisri"));
		//System.out.println(list);

	}

}

class Employee
{
	long deptId;
	String name;
	public Employee(long deptId, String name) 
	{
		super();
		this.deptId = deptId;
		this.name = name;
	}
	@Override
	public String toString() 
	{
		return "Employee [deptId=" + deptId + ", name=" + name + "]";
	}
	
	
}