package constructor;

public class DefaultConstructor3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Product1 p1=new Product1();
		p1.display();
		

	}

}
class Product1 
{
	int pid;
	String pname;
	Product1()
	{
		pid=12;
		pname="Lenovo";
	}
	void display()
	{
		System.out.println(pid+" "+pname);
	}
	
}