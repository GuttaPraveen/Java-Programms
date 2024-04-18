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
		System.out.println(i+" "+j);
	}
	public void m1(int i,float j)
	{
		System.out.println("Praveen");
		System.out.println(i+" "+j);
	}
	//If a class contains two or more methos with same name and
	 //different arguments or arguments are different data types is called 

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MethodOverLoading m=new MethodOverLoading();
		m.m1(10,20);
		

	}
	

}
