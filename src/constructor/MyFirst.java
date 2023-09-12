package constructor;

public class MyFirst
{
	static int a=10;
	static int n;
	int b=5;
	int c;
	{
		b=30;
		n=20;
	}
	static
	{
		a=60;
	}
	public MyFirst(int m)
	{
		System.out.println(a+","+b+","+c+","+n+","+","+m);
	}
	public static void main(String[] args)
	{
		MyFirst obj=new MyFirst(n);
	}
}
