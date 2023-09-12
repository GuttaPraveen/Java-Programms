
package interfaces;

import java.io.Serializable;
public class Employee extends Object implements Cloneable 
{
	String name;
	int salary;
	Employee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	Employee m1() throws CloneNotSupportedException
	{
		return (Employee)super.clone();
	}
	public static void main(String[] args)
	{
		Employee emp1=new Employee("Praveen",45000);
		Employee emp2=null;;
		try 
		{
			emp2=emp1.m1();
		} 
		catch (CloneNotSupportedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Employee Salary:"+emp1.salary);
		System.out.println("Employee Name:"+emp1.name);
		System.out.println("Employee Salary:"+emp2.salary);
		System.out.println("Employee Name:"+emp2.name);
		
	}
}
