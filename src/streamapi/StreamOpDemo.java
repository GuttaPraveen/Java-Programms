package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class StreamOpDemo
{
	public static void main(String[] args) 
	{
		List<Employee> emp=new ArrayList();
		emp.add(new Employee(1240,"Praveen",6500));
		emp.add(new Employee(1318,"Maha",5000));
		emp.add(new Employee(1250,"Krishna",7500));
		emp.add(new Employee(1254,"Sai",13000));
		emp.add(new Employee(1254,"Sai",5000));
		emp.add(new Employee(1254,"praveen",8000));
		//distinct
		emp.stream().distinct().forEach(x->System.out.println(x));
		//System.out.println(distinctEmp);
		int i=emp.stream().map(emp1->emp1.getSal()).filter(a->a>45000).reduce(0,(a,b)->a+b);
		System.out.println(i);
		Optional<String> s=emp.stream().map(ename->ename.getName()).filter(name->name.startsWith("Praveen")).findFirst();
		if(s.isPresent())
			System.out.println(s);
		else
			System.out.println("Not found");
		Optional<Employee> maxSal=emp.stream().max((e1,e2)->Integer.compare(e1.getSal(), e2.getSal()));
		if(maxSal.isPresent())
			System.out.println(maxSal.get());
		Optional<Employee> minSal=emp.stream().min((e1,e2)->Integer.compare(e1.getSal(), e2.getSal()));
		System.out.println(minSal);
		//display emps names whose salary is greater than 7000
		emp.stream().filter(x->x.getSal()>7000).forEach(
				(y)->
				{
					System.out.println(y);
				});
		//display emps count whose salary is greater than 7000
		long count=emp.stream().filter(x->x.getSal()>7000).count();
		System.out.println(count);
		//Finding emp name whose having high salary
		Optional<Employee> max=emp.stream().max(Comparator.comparing(Employee::getSal));
		System.out.println(max);
		System.out.println(max.get());
		
	}
}
class Employee
{
	int id;
	String name;
	int sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
