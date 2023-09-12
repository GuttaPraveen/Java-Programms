package patterns;

public class Recursion {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Recursion r=new Recursion();
		int sum=r.summer(4);
		System.out.println(sum);

	}
	static int summer(int in)
	{
		int sum=0;
		if(in==0)
			return 0;
		sum=in+summer(--in);
		return sum;
	}

}
