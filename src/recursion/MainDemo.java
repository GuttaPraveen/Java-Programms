package recursion;

public class MainDemo
{
	static int res=0;
	public static void main(String[] args)
	{
		System.out.println(fun(5));
	}
	static int fun(int n)
	{
		if(n==1)
			return 1;
		res=fun(n-1);
		return res;
	}
}
