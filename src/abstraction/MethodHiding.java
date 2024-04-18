/*package abstraction;

public class MethodHiding
{

	public static void main(String[] args) 
	{
		part_Emp p=new part_Emp();p.calsal();
		full_Emp f=new full_Emp();f.calsal();
	}
	
}
abstract class Employee
{
	public abstract void calsal();
}
class part_Emp extends Employee
{
 int wage=150;
 int hours=30;
	@Override
	public void calsal() {
		System.out.println(wage*hours);
	}
	
}
class full_Emp extends Employee
{
 int wage=100;
 int days=10;
	@Override
	public void calsal() {
		System.out.println(wage*days);
	}
}*/