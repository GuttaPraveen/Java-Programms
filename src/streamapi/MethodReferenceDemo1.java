package streamapi;
import java.util.ArrayList;
public class MethodReferenceDemo1
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(1);
		al.add("Praveen");
		al.add(3);
		al.add("Maha");
		al.add(5);
		
		//with Lambda
		al.forEach(x->System.out.println(x));
		
		//with methodreference
		al.forEach(System.out::println);
		
		
		
	}
}
