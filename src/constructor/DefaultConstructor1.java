package constructor;

public class DefaultConstructor1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Product p=new Product();

	}

}
class Product
{
	Product()
	{
		int pid=1240;
		String pname="HP";
		System.out.println(pid+" "+pname);
	}
}
