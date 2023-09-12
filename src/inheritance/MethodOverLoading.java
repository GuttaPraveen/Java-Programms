package inheritance;

public class MethodOverLoading
{
	public void m1()
	{
		System.out.println("Rajesh");
	}
	public void m1(int i,int j)
	{
		System.out.println("Praveen");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MethodOverLoading m=new MethodOverLoading();
		m.m1(10,20);
		

	}
	

}
