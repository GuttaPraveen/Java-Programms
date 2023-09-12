package inheritance;

public class HierarchicalInheritance1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Employee3 employee=new Employee3("Tom",25,9863855,"Home",50000,"IT");
		Manager manager=new Manager("Sam",35,5969386,"Earth",45000,"IT");
		employee.printSalary();
		manager.printSalary();
		
		

	}

}
class Member
{
	String name;
	int age;
	long phonenumber;
	String adress;
	long salary;
	Member(String name,int age,long phonenumber,String adress,long salary)
	{
		this.name=name;
		this.age=age;
		this.phonenumber=phonenumber;
		this.adress=adress;
		this.salary=salary;
	}
	public void printSalary()
	{
		System.out.println("Salary : "+salary);
	}
	
}
class Employee3 extends Member
{
	
	
	String specialization;
	
	Employee3(String name,int age,long phonenumber,String adress,long salary,String specialization)
	{
		super(name,age,phonenumber,adress,salary);
		this.name=name;
		this.age=age;
		this.phonenumber=phonenumber;
		this.adress=adress;
		this.salary=salary;
		this.specialization=specialization;
		
	}
	
}
class  Manager extends Member
{
	String department;
	Manager(String name,int age,long phonenumber,String adress,long salary,String department)
	{
		super(name,age,phonenumber,adress,salary);
		this.name=name;
		this.age=age;
		this.phonenumber=phonenumber;
		this.adress=adress;
		this.salary=salary;
		this.department=department;
	}
	
}