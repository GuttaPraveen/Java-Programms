package constructor;

public class ThisMethod2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Add a=new Add(111,112);
		Add a1=new Add();
		a1.display();
		

	}

}
class Add
{
	int a,b;
	Add()
	{
		this(11,112);
		a=10;
		b=20;
	}
	Add(int a,int b)
	{
		
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println(a+ " "+b);
	}
}
