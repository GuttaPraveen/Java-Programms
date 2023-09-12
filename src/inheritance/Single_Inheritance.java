package inheritance;

public class Single_Inheritance
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Programmer p=new Programmer();
		p.salary();//calls method of super class
		p.bonus();//calls method of sub class
		

	}

}
class Employee
{
	void salary()
	{
		System.out.println("Salary = 400000");
	}
}
class Programmer extends Employee
{
	void bonus()
	{
		System.out.println("Salary = 50000");
	}
}
