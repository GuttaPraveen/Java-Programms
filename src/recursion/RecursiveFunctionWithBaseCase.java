package recursion;

public class RecursiveFunctionWithBaseCase
{
	static int cnt=0;
	public static void f()
	{
		if(cnt==4)
		{
			return ;
		}
		System.out.print(cnt+" ");
		cnt++;
		f();
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		f();

	}

}
