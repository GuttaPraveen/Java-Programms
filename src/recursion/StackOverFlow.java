package recursion;

public class StackOverFlow
{
	public static void f()
	{
		System.out.println(1);
		f();
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		f();

	}

}
